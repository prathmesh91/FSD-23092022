import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID : ");
		int id = scan.nextInt();
		System.out.println("Enter Name : ");
		String name = scan.next();
		System.out.println("Enter Email : ");
		String email = scan.next();
		System.out.println("Enter Age : ");
		double age = scan.nextDouble();
		scan.close();
		
		try {
			String query = "INSERT INTO student VALUES(?,?,?,?)"; // Parameterized Query
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			
			PreparedStatement stmt = con.prepareStatement(query);
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, email);
				stmt.setDouble(4, age);
			
			int count = stmt.executeUpdate();
			con.close();
			
			System.out.println(count + " : rows inserted...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
