import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;
public class Redirection extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String username=request.getParameter("username");
//		String userage=request.getParameter("userage");
//		String usergender=request.getParameter("usergender");
//		PrintWriter out= response.getWriter();
//		out.println("user name:"+username+" user age:"+userage+" user gender:"+usergender);
		PrintWriter out=response.getWriter();
		out.println("<table align=center border=1>");
		Enumeration<String> formFields = request.getParameterNames();
		while(formFields.hasMoreElements()){
			String feildname = formFields.nextElement();
			out.print("<tr><th align=right>"+feildname+":</th>");
			String feildvalue= request.getParameter(feildname);
			out.println("<td align=left>"+feildvalue+"</td></tr>");
		}
		out.println("</table>");
	}
}
