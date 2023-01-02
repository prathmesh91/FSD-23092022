

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth-user")
public class ValidateUser extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from student where email=? AND password=?");
			stmt.setString(1, name);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				request.setAttribute("id", rs.getInt("id"));
				request.setAttribute("name", rs.getString("name"));
				request.setAttribute("email", rs.getString("email"));
				flag = true;
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	
		if(flag) {
			// Home Page
			RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
			dis.forward(request, response);
		} else {
			// Login Page with Error Msg
			response.sendRedirect("login.jsp?code=-1"); // URL rewriting.
		}
		
		
		
	}

}
