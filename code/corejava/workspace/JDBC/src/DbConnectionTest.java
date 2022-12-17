
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionTest {

	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Create Connection
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			
			System.out.println("Database Connection Successfully done.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
