

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message")
public class Message extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<form action='display'>");
			out.print("Enter Name : <input type='text' name='name'>");
			out.print("<br/><br/>");
			out.print("Enter Message : <input type='text' name='msg'>");
			out.print("<br/><br/>");
			out.print("Select City : ");
			out.print("<select name='city'>");	
				out.print("<option value='Pune'>Pune</option>");
				out.print("<option value='Mumbai'>Mumbai</option>");
				out.print("<option value='Delhi'>Delhi</option>");
				out.print("<option value='Nagpur'>Nagpur</option>");
			out.print("</select>");
			out.print("<br/><br/>");
			out.print("<input type='submit' value='send'>");
		out.print("</form>");
	}

}
