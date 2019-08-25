package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.DeliveryService;
import Service.DeliveryServiceImpl;

/**
 * Servlet implementation class DeleteDeliveryServlet
 */
@WebServlet("/DeleteDeliveryServlet")
public class DeleteDeliveryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDeliveryServlet() {
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
		
		String DelId = request.getParameter("deleteValue");
		
		DeliveryService delService = new DeliveryServiceImpl();
		
		boolean isDeleted = false;
		try {
			isDeleted = delService.deleteDelivery(DelId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(isDeleted == true) {
			PrintWriter out = response.getWriter();
			out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
			out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal ( 'Deleted Successfully' ,  '' ,  'success' );");
			out.println("});");
			out.println("</script>"); 
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ViewDelivery.jsp");
			dispatcher.include(request, response);
		}
		
		
	}

}
