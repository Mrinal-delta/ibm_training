package com.ibm.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class QueryAnalyser {

	public static void main(String[] args) throws SQLException {
		String sql = "select name,age from citizen";
		
		Connection conn = JdbcFactory.getConnection();
		ResultSet rs = conn.createStatement().executeQuery(sql);
		ResultSetMetaData meta = rs.getMetaData();
		
		for (int i = 1; i<=meta.getColumnCount();i++) 
			System.out.print(meta.getColumnName(i).toUpperCase()+"\t");
		System.out.println();
		
		while(rs.next()) {
			for(int i = 1;i<=meta.getColumnCount();i++)
				System.out.print(rs.getString(i)+"\t");
			System.out.println();
		}
	}

}
