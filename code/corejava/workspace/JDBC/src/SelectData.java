import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {

	public static void main(String[] args) {
		try {
			String query = "select * from student";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			PreparedStatement stmt = con.prepareStatement(query);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString("email") + "\t");
				System.out.print(rs.getDouble("age") + "\n");
			}
			
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
