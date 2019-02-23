package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormDisp1
 */
public class FormDisp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormDisp1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    /*
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name= request.getParameter("name");
		pw.println("Welcome"+name);
		pw.close();
		
	}
}
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		   // response.sendRedirect("https://chandanhub.github.io/");
		  //  String n=request.getParameter("userName");  
		    String p=request.getParameter("userPass");  
		          
		    if(p.equals("servlet")){  
		        RequestDispatcher rd=request.getRequestDispatcher("Welcome");  
		        rd.forward(request, response);  
		    }  
		    else{  
		    	response.sendRedirect("https://chandanhub.github.io/");
		        out.print("Sorry UserName or Password Error!");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		        rd.include(request, response);  
		                      
		        } 
	}
	
}

//}
