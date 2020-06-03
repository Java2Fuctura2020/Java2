package br.com.ericmoraess.dao.filtro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import br.com.ericmoraess.conexao.DataSourceFactory;
import br.com.ericmoraess.entidade.VOHospital;

public class ConsultarHospitalNome {
	public static ConsultarHospitalNome instancia = new ConsultarHospitalNome();
	
	private static final String QUERY = "SELECT * FROM " + VOHospital.NM_TABELA;	
	
	public static ConsultarHospitalNome getInstancia() {
		if(instancia == null) {
			instancia = new ConsultarHospitalNome();
		}
		return instancia;
	}
	
	
	public Set<VOHospital> consultar(FiltroConsultarHospitalNome filtro){
		try {
			
			StringBuilder clausulaWhere = new StringBuilder();
			StringBuilder consultaFinal = new StringBuilder(QUERY);
			
			Connection conn = DataSourceFactory.getOracleDataSource().getConnection();
			
			if(filtro.isRazaoSocialAlterado()) {
				clausulaWhere.append( filtro.COL_NmFantasia + " LIKE ? " );
			}
			
			
			if(filtro.isNumCapacidadeAlterado()) {
				clausulaWhere.append( filtro.COL_NumCapacidade + " = ? " );
			}
			
			if( clausulaWhere.length() > 0) {
				consultaFinal.append("\nWHERE\n");
				consultaFinal.append(clausulaWhere);
			}

			System.out.println(consultaFinal.toString());
			
			PreparedStatement psmt = conn.prepareStatement(consultaFinal.toString());

			if(filtro.isRazaoSocialAlterado()) {
				psmt.setString(1, filtro.getNmRazaoSocial());
			}
			
			if(filtro.isNumCapacidadeAlterado()) {
				psmt.setInt(2, filtro.getNumCapacidade());
			}
			
			ResultSet rs = psmt.executeQuery();
			
			Set hospitals = new HashSet();

			while (rs.next()) {
				VOHospital hospital = extractHospitalFromResultSet(rs);
				hospitals.add(hospital);
			}
			
			return hospitals;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


	private VOHospital extractHospitalFromResultSet(ResultSet rs) {
		VOHospital hospital = new VOHospital();
		
		try {
			hospital.setNomeFantasia(rs.getString(2) );
			hospital.setNumCapacidade(rs.getInt(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hospital;
	}
	
	
}
