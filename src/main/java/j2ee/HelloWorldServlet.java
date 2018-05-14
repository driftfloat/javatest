package j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		message = "Hello World";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer count = (Integer)request.getSession().getAttribute("count");
		count = (count== null)?1:++count ;
		request.getSession().setAttribute("count", count);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
		out.println("Your count times:"+count);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
