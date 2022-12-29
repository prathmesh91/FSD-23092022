

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-info")
public class SaveStudInfo extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		
		int count = 0;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd23sept","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into studinfo values(0,?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, contact);
			stmt.setString(3, email);
			count = stmt.executeUpdate();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(count>0) {
			out.print("<h1 style='color:green'>Student Information Save Successfully</h1>");
		} else {
			out.print("<h1 style='color:red'>Student Information Fail to Save</h1>");
		}
		
	}
}
