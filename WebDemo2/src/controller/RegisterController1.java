package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterController1")
public class RegisterController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String loginId=request.getParameter("loginId");
		String password=request.getParameter("passwd");
		String customerName=request.getParameter("customerName");
		String emailId=request.getParameter("emailId");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String country=request.getParameter("country");
		
		model.User userObj= new model.User();
		userObj.setloginId(loginId);
		userObj.setPassword(password);
		userObj.setCustomerName(customerName);
		userObj.setEmailId(emailId);
		userObj.setMobile(mobile);
		userObj.setAddress(address);
		userObj.setCountry(country);
	
		
		try 
		{
			dao.UserDao userDao= new dao.UserDao();
			if(userDao.insertCustomer(userObj))
			{
				request.setAttribute("loginId", loginId);
				RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
				dispatcher.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo","Problem Occured");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
				dispatcher.forward(request, response);
			
			}
			
		
		} 
		catch (Exception e) 
		
		{
		//	System.out.println("Exception arised:"+e);
			request.setAttribute("errorInfo","Exception Occured"+e.getMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
			dispatcher.forward(request, response);
		
		
		}
		
	}

}
