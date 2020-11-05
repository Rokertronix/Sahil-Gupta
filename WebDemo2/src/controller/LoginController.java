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
		
		try
		{
	    dao.UserDao userDao= new dao.UserDao();
	    model.User tempuser=userDao.checkLogin(userobj);
	    
		
		if(tempuser!=null)
	   {
		  request.setAttribute("loginId",Login);
		  request.setAttribute("userInfo", tempuser);
		  
		  RequestDispatcher dispatcher=request.getRequestDispatcher("Success.jsp");
		  dispatcher.forward(request, response);
	   }
	   else
	   {
		   request.setAttribute("errorInfo", "Invalid Login Id and Password");
		   RequestDispatcher dispatcher=request.getRequestDispatcher("Error.jsp");
		   dispatcher.forward(request, response);
	   }
		}
		catch(Exception e)
		{
			System.out.println(e);

			request.setAttribute("errorInfo","Exception Occured"+e.getMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
			dispatcher.forward(request, response);
		}
		
		}
	}
