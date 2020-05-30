package br.com.ericmoraess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import br.com.ericmoraess.conexao.DataSourceFactory;
import br.com.ericmoraess.conexao.FabricaDeConexoes;
import br.com.ericmoraess.entidade.Hospital;

public class HospitalDAOImp implements HospitalDAO {

	public Set<Hospital> getAll() {

		try {
			//recuperar a conexão do DataSource
			Connection connection = DataSourceFactory.getOracleDataSource().getConnection();

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM hospital");
			Set hospitals = new HashSet();

			while (rs.next()) {
				Hospital hospital = extractHospitalFromResultSet(rs);
				hospitals.add(hospital);
			}

			connection.close();

			return hospitals;

		} catch (SQLException ex) {

			ex.printStackTrace();

		}

		return null;
	}

	private Hospital extractHospitalFromResultSet(ResultSet rs) throws SQLException {
		Hospital Hospital = new Hospital();
		// coloca o nome da coluna ou indice
		if (rs.getString(2) != null) {
			Hospital.setRazao_social(rs.getString(2));
		}
		Hospital.setCapacidade(rs.getInt(6));
		return Hospital;
	}

	public void insert(Hospital h) {
		// TODO Auto-generated method stub
		Connection connection = FabricaDeConexoes.getConnection();

		try {

			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO HOSPITAL");
			sb.append("(nome_fantasia, cnpj, data_abertura, razao_social, capacidade)");
			sb.append("VALUES");
			sb.append("(?,?,?,?,?)");

			PreparedStatement psmt = connection.prepareStatement(sb.toString());

			psmt.setInt(5, h.getCapacidade());
			psmt.setString(1, h.getNome_fantasia());
			psmt.setDate(3, h.getData_abertura());
			psmt.setString(2, h.getCnpj());
			psmt.setString(4, h.getRazao_social());

			boolean resultado = psmt.execute();

			connection.close();

		} catch (SQLException ex) {

			ex.printStackTrace();

		}

	}

	public void update(Hospital h) {
		// TODO Auto-generated method stub

	}

	public void delete(Hospital h) {
		// TODO Auto-generated method stub
		Connection connection = FabricaDeConexoes.getConnection();
		
		try {
			
			StringBuilder clausulaWhere = new StringBuilder();
			int indice = 0;
			
			StringBuilder sb = new StringBuilder();
			sb.append("DELETE HOSPITAL");
			sb.append("\nWHERE ");
			
			if(h.getRazao_social() != null) {
				clausulaWhere.append(" razao_social = ? ");
			}
			
			if(h.getCapacidade() >= 0) {
				clausulaWhere.append(" capacidade = ? ");
			}
			
			if(clausulaWhere.length() > 0 ) {
				sb.append(clausulaWhere);
			}

			PreparedStatement psmt = connection.prepareStatement(sb.toString());

			if(h.getRazao_social() != null) {
				indice++;
				psmt.setString(indice, h.getRazao_social());
			}
			
			if(h.getCapacidade() >= 0) {
				indice++;
				psmt.setInt(indice, h.getCapacidade());
			}

			boolean resultado = psmt.execute();

			connection.close();

		} catch (SQLException ex) {

			ex.printStackTrace();

		}

	}
}
