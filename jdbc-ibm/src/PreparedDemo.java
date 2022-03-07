import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {

	public static void main(String[] args) {
		
		String sql = "insert into citizen values (?,?,?,?,?)";//? are called place holder
	
		try {
			Connection conn = JdbcFactory.getConnection();
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.setString(4, args[3]);
			stmt.setLong(5, Long.parseLong(args[4]));
			
			stmt.executeUpdate();
			System.out.println("Record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
