package com.tcs;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException{
//		PrintWriter out = response.getWriter();
////		writer.println("Dummy Stuff");
////		writer.println("Dummy Stuff 2");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Yahoo!!!!!!!!</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My First Servlet yahoo");
//		out.println("</body>");
//		out.println("</html>");
		
//		System.out.println(request.getParameter("name"));
		String name = request.getParameter("name");
		
		request.setAttribute("name", name);
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
}
