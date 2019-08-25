package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Delivery;

/**
 * Servlet implementation class GetAssignDeliveryServlet
 */
@WebServlet("/GetAssignDeliveryServlet")
public class GetAssignDeliveryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAssignDeliveryServlet() {
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
		
		String delID = request.getParameter("updateDelID");
		String orderID = request.getParameter("orderID");
		String shopName = request.getParameter("shopName");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String bookID = request.getParameter("bookID");
		String qty = request.getParameter("quantity");
		String amount = request.getParameter("amount");
		String vehicle = request.getParameter("vehicle");
		String employee = request.getParameter("employee");
		String date = request.getParameter("date");
		
		Delivery d1 = new Delivery();
		
		d1.setDelID(delID);
		d1.setOrderID(orderID);
		d1.setShopName(shopName);
		d1.setAddress(address);
		d1.setEmail(email);
		d1.setBookID(bookID);
		d1.setQuantity(qty);
		d1.setAmount(amount);
		d1.setVehicleNo(vehicle);
		d1.setEmpID(employee);
		d1.setDate(date);
		
		request.setAttribute("getCid", d1);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddDelivery.jsp");
		dispatcher.forward(request,response);
		doGet(request, response);
	}

}
