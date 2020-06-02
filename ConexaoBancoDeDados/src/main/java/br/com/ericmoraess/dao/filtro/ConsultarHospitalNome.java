package br.com.ericmoraess.dao.filtro;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

import br.com.ericmoraess.conexao.DataSourceFactory;
import br.com.ericmoraess.entidade.VOHospital;

public class ConsultarHospitalNome {
	public static ConsultarHospitalNome instancia = new ConsultarHospitalNome();
	
	private static final String QUERY = "SELECT ";	
	
	
	public static ConsultarHospitalNome getInstancia() {
		if(instancia == null) {
			instancia = new ConsultarHospitalNome();
		}
		return instancia;
	}
	
	
	public Set<VOHospital> consultar(FiltroConsultarHospitalNome filtro){
		try {
			
			Connection conn = DataSourceFactory.getOracleDataSource().getConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
}
