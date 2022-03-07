package com.ibm.transaction;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import com.mysql.cj.jdbc.Driver;

public final class JdbcFactory {
	private JdbcFactory() {}
	
	public static Connection getConnection() throws SQLException{
		Properties p = new Properties();
		try {
			p.load(new FileReader("src/dbinfo.properties"));
		} catch (IOException e) {
			throw new SQLException(e.getMessage());
		}
		 
		try {
			//registering the driver with driver name
			Class.forName(p.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
		Connection conn = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("pass"));
		return conn;
	}
}
