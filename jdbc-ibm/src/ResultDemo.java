import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class ResultDemo {

	public static void main(String[] args) {

		String sql = "select * from citizen";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			
			//passing predefined querry
//			Statement stmt = conn.createStatement();
//			
//			ResultSet rs = stmt.executeQuery(sql);
			
			//passing modified query
			/*scrollable and insensitive to change - which means it is changable and can move back and
			*forth the cursor in the below while loop will also start from the begining*/
//			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			ResultSet rs = stmt.executeQuery("select * from citizen");
			
			/*unscrollable and insensitive to change - which means it is changable but  can't move back and
			*forth the cursor in the below while loop will start from the position t has previously been halted
			*at or may have been stopped to make some changes. thus it does not starts from the begining in 
			*each iteration*/
//			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			ResultSet rs = stmt.executeQuery("select * from citizen");
			
			/*scrollable and insensitive to change - which means it is unchangable and can move back and
			*forth the cursor in the below while loop will also start from the begining */
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("select * from citizen");
			
			ResultSetMetaData meta = rs.getMetaData();
			
			for(int c =1;c<=meta.getColumnCount();c++)
				System.out.print(meta.getColumnName(c)+"\t");
			System.out.println();
			
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getLong(5));
		
			//for scrollable and selecting specified columns name and age
//			while(rs.next())
//				System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
//			
			//for updating a row data
			rs.absolute(6);
			rs.updateString("name", "Jerome");
			rs.updateRow();
			
			//for inserting a row data
//			rs.moveToInsertRow();
//			rs.updateInt(1, 108);
//			rs.updateString(2, "Holi");
//			rs.updateInt(3, 35);
//			rs.updateString(4, "Patna");
//			rs.updateLong(5, 1002345678);
//			rs.insertRow();
//			rs.moveToCurrentRow();
			
			{
			//in the following case the id does not a have default value so it will generate an error
//			rs.moveToInsertRow();
////			rs.updateInt(1, 108);
//			rs.updateString(2, "Holi");
//			rs.updateInt(3, 35);
//			rs.updateString(4, "Patna");
//			rs.updateLong(5, 1002345678);
//			rs.insertRow();
//			rs.moveToCurrentRow();
			}
			
			
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getLong(5));
//				System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
