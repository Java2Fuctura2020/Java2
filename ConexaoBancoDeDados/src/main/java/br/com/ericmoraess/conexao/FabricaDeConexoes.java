package br.com.ericmoraess.conexao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Cria e gerencia as conexões
 */
public class FabricaDeConexoes {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USUARIO = "fuctura";
	public static final String SENHA = "123";

	/**
	 * 
	 * Obtem uma conexão para o banco de dados
	 * 
	 * @return Connection object
	 * 
	 */

	public static Connection getConnection() {
		try {
			Driver oracleDriver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(oracleDriver);
			return DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException ex) {
			throw new RuntimeException("Erro conectando ao banco de dados.", ex);
		}
	}

	/**
	 * 
	 * Testa a conexão
	 * 
	 */
	public static void main(String[] args) {
		Connection connection = FabricaDeConexoes.getConnection();
	}

}
