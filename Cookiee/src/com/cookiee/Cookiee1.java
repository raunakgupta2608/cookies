package com.cookiee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookiee1
 */
public class Cookiee1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Cookiee1() {
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
		String strFirstName= request.getParameter("firstname");
		String strSecondName= request.getParameter("secondname");
		String strAge= request.getParameter("age");
		
		//create the cookie object
		Cookie cookie1= new Cookie("FirstName",strFirstName);
		Cookie cookie2= new Cookie("SecondName",strSecondName);
		
 cookie1.setMaxAge(30);
	 int i= cookie1.getMaxAge();
	 int j = cookie2.getMaxAge();
	 
	 response.addCookie(cookie1);
	 response.addCookie(cookie2);
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<form action='sec'> ");
		pw.println("<h2> enter name of company</h2>");
		pw.println("<input type='text' name ='cname'>");
		pw.println("<h2> enter name of salary</h2>");
		pw.println("<input type='text' name ='sal'>");
		pw.println("<h2> enter name of department</h2>");
		pw.println("<input type='text' name ='dname'>");
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
