package Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Delivery;
import Service.DeliveryService;
import Service.DeliveryServiceImpl;

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
		
		String del_id = request.getParameter("DeliveryID");
		String ordID = request.getParameter("OrderID");
		String shName = request.getParameter("ShopName");
		String addr = request.getParameter("address");
		String email = request.getParameter("email");
		String bkID = request.getParameter("bookID");
		String qty = request.getParameter("qty");
		String amount = request.getParameter("amount");
		String vehicleNo = request.getParameter("vehicle");
		String empID = request.getParameter("employee");
		String date = request.getParameter("date");
		
		Delivery del = new Delivery();
		
		del.setDelID(del_id);
		del.setOrderID(ordID);
		del.setShopName(shName);
		del.setAddress(addr);
		del.setEmail(email);
		del.setBookID(bkID);
		del.setQuantity(qty);
		del.setAmount(amount);
		del.setVehicleNo(vehicleNo);
		del.setEmpID(empID);
		del.setDate(date);
		
		DeliveryService delService = new DeliveryServiceImpl();
		
		try {
			boolean isAdded = delService.addNewDelivery(del);
			
			if(isAdded == true) {
				
				System.out.println("Successfull !");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
