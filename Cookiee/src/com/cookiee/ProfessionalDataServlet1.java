package com.cookiee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfessionalDataServlet
 */
public class ProfessionalDataServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfessionalDataServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String strCompanyName= request.getParameter("cname");
		String strSalary= request.getParameter("sal");
		
		Cookie cookie3= new Cookie("comName",strCompanyName);
		Cookie cookie4= new Cookie("sal",strSalary);
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		Cookie[] ck  = request.getCookies();
		pw.println("<html>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("<form action='third'> ");
		for(int i =0 ; i <ck.length ; i++)
		{
			pw.println("<h1>"+ck[i].getName() +"....."+ck[i].getValue()+"<br>");
		}
		pw.println("<input type='submit' value='deepak'");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
