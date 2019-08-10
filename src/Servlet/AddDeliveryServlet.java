package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddDeliveryServlet
 */
@WebServlet("/AddDeliveryServlet")
public class AddDeliveryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDeliveryServlet() {
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
		
		String delID = request.getParameter("DeliveryID");
		String ordID = request.getParameter("OrderID");
		String shName = request.getParameter("ShopName");
		String addr = request.getParameter("address");
		String email = request.getParameter("email");
		String bkID = request.getParameter("bookID");
		//int qty = request.getParameter("qty");
		/*int qty = ge
		float amount = 
		String vehicleNo
		String empID
		String date*/
	}

}
