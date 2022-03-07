package com.ibm.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {

		String sql1 = "insert into citizen values(90,'kim',31,'Kerala',5642)";
		String sql2 = "update citizen set age = 30 where id = 101";
		String sql3 = "delete from citizen where id = 104";
		
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			
			Statement stmt = conn.createStatement();
			//adding batch of queries to execute in one go
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			conn.setAutoCommit(false);//setting auto commit to false to ensure aicd properties
			
			stmt.executeBatch();//Executing all queries
			
			conn.commit();//commiting transaction on successful execution of all queries
			System.out.println("Successfully commited");
		} catch (SQLException e) {
			try {
				conn.rollback();//rollback transaction on successful execution of all queries
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	
		
	}

}
