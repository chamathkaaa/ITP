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

import Model.Delivery;
import Service.DeliveryService;
import Service.DeliveryServiceImpl;

/**
 * Servlet implementation class SearchDeliveryServlet
 */
@WebServlet("/SearchDeliveryServlet")
public class SearchDeliveryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchDeliveryServlet() {
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
		
		String searchId = request.getParameter("searchDelivery");
		System.out.println("ffff: " +searchId);
		
		DeliveryService delService = new DeliveryServiceImpl();
		
		try {
			Delivery del = delService.getDeliveryDetails(searchId);
			
			if(del != null)
			{
				PrintWriter write = response.getWriter();
				
				/*write.println("<tr>");
				write.println("<td>");
				write.println("<div class=\"img-container\">");
				write.println("<img src=\"assets/img/aven.jpg\" alt=\"...\">");
				write.println("</div>");
				write.println("</td>");
				write.println("<td class=\"td-name\">"+del.getName() +"</td>");
				write.println("<%=v.getName() %>");
				write.println("</td>");
				write.println("<td class=\"td-name\" style=\"font-size: 16px;\">"+videoList.getDescription()+"</td>");
				
				write.println("</td>");
				write.println("</tr>");*/
				
				request.setAttribute("delivery", del);
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ViewDelivery.jsp");
				dispatcher.forward(request, response);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
