package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Customer;
import com.service.CustomerService;
import com.service.impl.CustomerServiceImpl;
import com.util.DBConnection;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
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

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		CustomerService cs = new CustomerServiceImpl();
		

		try {
			
			Customer c1 = cs.LoginFunction(email,password);
			
			HttpSession session = request.getSession();
			
			if(c1.getcId() < 0) {
				
				String sessionError = "Email or Password is Invalid";
				session.setAttribute("sessionError","Email or Password is Invalid");
				
				response.sendRedirect("index.jsp");
			}
			else {
				
				//check the position
				
				if(email.equals("admin@gmail.com") && password.equals("admin")) {
					
					System.out.println("Welcome Admin!");
					
					PrintWriter out = response.getWriter();
					out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
					out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
					out.println("<script>");
					out.println("$(document).ready(function(){");
					out.println("swal ( 'Successfully Logged In...! Welcome Admin!' ,  '' ,  'success' );");
					out.println("});");
					out.println("</script>"); 
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminView.jsp");
					dispatcher.include(request, response);
					
				}
				else {
					
					session.setAttribute("cId",c1.getcId());
					session.setAttribute("fname",c1.getFname());
					session.setAttribute("lname",c1.getLname());
					session.setAttribute("email",c1.getEmail());
					session.setAttribute("address", c1.getAddress());
					session.setAttribute("contactNumber", c1.getContactNumber());
					session.setAttribute("password", c1.getPassword());
					session.setAttribute("confirmPassword", c1.getConfirmPassword());
					
					System.out.println("Successfully Logged In");
					System.out.println("Welcome Customer!");
					
					
					session.setAttribute("Login", "Logged In");		
					
					
					PrintWriter out = response.getWriter();
					out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
					out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
					out.println("<script>");
					out.println("$(document).ready(function(){");
					out.println("swal ( 'Successfully Logged In...! Welcome Customer!' ,  '' ,  'success' );");
					out.println("});");
					out.println("</script>"); 
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CustomerAcc.jsp");
					dispatcher.include(request, response);;;;
					
				}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doGet(request, response);		
		
	}

}
