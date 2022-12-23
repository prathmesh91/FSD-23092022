

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-message")
public class UserMessage extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>Basic HTML</title>");
			out.print("</head>");
			out.print("<body>");
				out.print("<form action=''>");
					out.print("Enter Your Name: <input type='text' name='name'>");
					out.print("<br/><br/>");
					out.print("Enter Your Message: <input type='text' name='msg'>");
					out.print("<br/><br/>");
					out.print("<button type='Submit'>Send Message</button>");
				out.print("</form>");
			out.print("</body>");
		out.print("</html>");
	}

}
