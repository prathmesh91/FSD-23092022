import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID : ");
		int id = scan.nextInt();
		scan.close();
		
		try {
			String query = "DELETE FROM student WHERE id=?"; // Parameterized Query
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			
			PreparedStatement stmt = con.prepareStatement(query);
				stmt.setInt(1, id);
			
			int count = stmt.executeUpdate();
			con.close();
			
			System.out.println(count + " : rows DELETED...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
