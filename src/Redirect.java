import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Redirect extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Enumeration<String> formFields = request.getParameterNames();
	String urlQuery = "/URLQueryWriting/Redirection?";
	while(formFields.hasMoreElements()){
		String feildname = formFields.nextElement();
		urlQuery+=feildname+"="+request.getParameter(feildname)+"&";
	}
		response.sendRedirect(urlQuery);
	
	}
}
