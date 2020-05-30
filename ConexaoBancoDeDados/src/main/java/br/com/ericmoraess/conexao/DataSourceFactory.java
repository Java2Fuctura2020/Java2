package br.com.ericmoraess.conexao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import br.com.ericmoraess.AplicacaoDAO;
import oracle.jdbc.pool.OracleDataSource;

public class DataSourceFactory {
	
	//Acoplamento com banco de dados Oracle
	public static DataSource getOracleDataSource() {
		Properties props = new Properties();
		InputStream is = null;
		OracleDataSource dataSource = null;
		try {
			is = AplicacaoDAO.class.getClassLoader().getResourceAsStream("db.properties");
			props.load(is);
			dataSource = new OracleDataSource();
			dataSource.setURL(props.getProperty("DB_URL"));
			dataSource.setUser(props.getProperty("DB_USERNAME"));
			dataSource.setPassword(props.getProperty("DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dataSource;
	}
}
