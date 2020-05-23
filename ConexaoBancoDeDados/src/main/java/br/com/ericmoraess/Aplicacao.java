package br.com.ericmoraess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aplicacao {

	public static void main(String[] args) {
		
		try {
			
			Class driver = Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "fuctura", "123");
						
			String sql = "SELECT * FROM hospital";
			
			PreparedStatement pstm = conn.prepareStatement(sql);

			//ctrl + enter
			ResultSet rs = pstm.executeQuery();
			
			System.out.println("---------------RESULTADOS--------------------");
			
			while( rs.next() ) {
				System.out.println("NOME_FANTASIA: " + rs.getString(1) );
				System.out.println("CNPJ: " + rs.getString(2) );
				System.out.println("DATA_ABERTURA: " + rs.getDate(3));
				System.out.println("RAZAO_SOCIAL: " + rs.getString(4));
				System.out.println("CAPACIDADE: " + rs.getInt(5));
				System.out.println("-----------------------------------");
			}
			
			sql = "INSERT INTO hospital (NOME_FANTASIA, CAPACIDADE) VALUES ('MEMORIAL SAO JOSE', 500)";
			
			pstm = conn.prepareStatement(sql);
			pstm.executeQuery();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
				
	}

}