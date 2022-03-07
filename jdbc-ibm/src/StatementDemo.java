import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		
		String sql = "insert into citizen values (105,'Jack',24,'Delhi',1032456784)";
//		String sql = "insert into citizen values (";
//		for(Object i: args) {
//			if(i instanceof Integer)
//				sql.concat(i+",");
//			else
//				sql.concat("'"+i+"'");
//			}
//		sql.concat(")");
		try {
			Connection conn = JdbcFactory.getConnection();
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
