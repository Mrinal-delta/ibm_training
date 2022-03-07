package anirbanjdbc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

import com.mysql.cj.jdbc.Driver;

public class A {

	public static void main(String[] args) {
		//String url = "jdbc:mysql://localhost:3306/training";
		
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
//			Connection conn =  DriverManager.getConnection(url,"root","Anirban24@743144");
			Connection conn = B.getConnection();
			System.out.println("Connection Succcessful");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB name : " + meta.getDatabaseProductName() );
			System.out.println("DB ver : "+ meta.getDatabaseProductVersion());
			System.out.println("Driver name : "+ meta.getDriverName());
			System.out.println("Driver ver : " + meta.getDriverVersion());
			}catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		
	}

}


