package com.gabriellenoel.ss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "loginServlet", value = "/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
        
	    String un = request.getParameter("username");  
	    String pw = request.getParameter("password");  
		
        String dbUsername = "gabalexa";
        String dbPassword = "password";
        
        if(un.equals(dbUsername) && pw.equals(dbPassword)) {  
        	System.out.println("if");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/loggedin.html");
            requestDispatcher.forward(request, response);
        } else{ 
            RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
            rd.include(request, response);  
            System.out.println("else");
        }  
	}

}
