package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;

@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int productId=Integer.parseInt(request.getParameter("productId"));
		
		try
		{
			dao.ProductDao productDao=new dao.ProductDao();
			
			if(productDao.deleteProduct(productId))
			{
				request.setAttribute("productlist",productDao.getProductList());
				
				 RequestDispatcher dispatcher=request.getRequestDispatcher("ProductDisplay.jsp");
				   dispatcher.forward(request, response);
			}
			else
			{
				 request.setAttribute("errorInfo", "Error while inserting the product!");
				 RequestDispatcher dispatcher=request.getRequestDispatcher("Error.jsp");
				   dispatcher.forward(request, response);
			}
		}
		catch(Exception e)
		{
			request.setAttribute("errorInfo","Exception Occured"+e.getMessage());
			 RequestDispatcher dispatcher=request.getRequestDispatcher("Error.jsp");
			   dispatcher.forward(request, response);
		}
	}

}
