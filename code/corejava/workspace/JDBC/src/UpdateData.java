import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID : ");
		int id = scan.nextInt();	
		System.out.println("Enter Email : ");
		String email = scan.next();
		scan.close();
		
		try {
			String query = "UPDATE student SET email=? WHERE id=?"; // Parameterized Query
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			
			PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, email);
				stmt.setInt(2, id);
			
			int count = stmt.executeUpdate();
			con.close();
			
			System.out.println(count + " : rows updated...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
