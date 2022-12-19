import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStaticData {

	public static void main(String[] args) {
		String query = "INSERT INTO student VALUES(9,'Demo1', 'demo1@gmail.com',22.1)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			PreparedStatement stmt = con.prepareStatement(query);
			int count = stmt.executeUpdate();
			con.close();
			
			System.out.println(count + " : Rows Inserted...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
