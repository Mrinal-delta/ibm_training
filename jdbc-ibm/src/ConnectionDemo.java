import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) {
		
		try {
			//this for directly doing the connection
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
//			Connection conn = DriverManager.getConnection(url,"root","my$qlR00t7980");
			
			System.out.println("Connection successful");
			
			//this for directly doing the connection
//			DatabaseMetaData meta = conn.getMetaData();
			
			//this is done through factory
			DatabaseMetaData meta = JdbcFactory.getConnection().getMetaData();
			System.out.println("DB Name: "+ meta.getDatabaseProductName());
			System.out.println("DB Ver: "+meta.getDatabaseProductVersion());
			System.out.println("Driver Name: "+meta.getDriverName());
			System.out.println("Driver Ver: "+meta.getDriverVersion());
		} catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		
	}

}
