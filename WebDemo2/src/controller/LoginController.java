package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Login=request.getParameter("loginId");
		String Password=request.getParameter("Password");
		
		model.User userobj=new model.User();
		userobj.setloginId(Login);
		userobj.setPassword(Password);
		
	   if(userobj.checkLogin())
	   {
		  request.setAttribute("loginId",Login);
		  request.setAttribute("passwd", Password);
		  RequestDispatcher dispatcher=request.getRequestDispatcher("Success.jsp");
		  dispatcher.forward(request, response);
	   }
	   else
	   {	
		   RequestDispatcher dispatcher=request.getRequestDispatcher("Failure.jsp");
		   dispatcher.forward(request, response);
	   }
		   
	}

}