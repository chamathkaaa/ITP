package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Delivery;
import Model.StockDelivery;
import Util.DBConnection;

public class DeliveryServiceImpl implements DeliveryService{

	private static Connection conn;
	
	public DeliveryServiceImpl() {
		
		conn = DBConnection.getConnection();
	}

	@Override
	public boolean addNewDelivery(Delivery del) throws SQLException  {
		
		String sql = "Insert into delivery values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setObject(1, del.getDelID());
		stm.setObject(2, del.getOrderID());
		stm.setObject(3, del.getShopName());
		stm.setObject(4, del.getAddress());
		stm.setObject(5, del.getEmail());
		stm.setObject(6, del.getBookID());
		stm.setObject(7, del.getQuantity());
		stm.setObject(8, del.getAmount());
		stm.setObject(9, del.getVehicleNo());
		stm.setObject(10, del.getEmpID());
		stm.setObject(11, del.getDate());
		
		int res = stm.executeUpdate();
		return res > 0;
	}
	
	@Override
	public ArrayList<StockDelivery> getAllDeliveries() throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "Select * from stockOrder";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<StockDelivery> stkList = new ArrayList<StockDelivery>();
		
		while(rst.next()) {
			StockDelivery stk = new StockDelivery();
			stk.setOrderId(rst.getString("order_id"));
			stk.setShopName(rst.getString("shop_name"));
			stk.setAddress(rst.getString("address"));
			stk.setEmail(rst.getString("email"));
			stk.setBookId(rst.getString("book_id"));
			stk.setQuantity(rst.getString("quantity"));
			stk.setAmount(rst.getString("amount"));
			
			stkList.add(stk);
			
			
		}

		return stkList;
	}

	@Override
	public ArrayList<Delivery> getViewDeliveries() throws SQLException {
		
		String sql = "Select * from delivery";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<Delivery> delList = new ArrayList<Delivery>();
		
		while(rst.next()) {
			Delivery del = new Delivery();
			del.setDelID(rst.getString("del_id"));
			del.setOrderID(rst.getString("order_id"));
			del.setShopName(rst.getString("shop_name"));
			del.setAddress(rst.getString("address"));
			del.setEmail(rst.getString("email"));
			del.setBookID(rst.getString("book_id"));
			del.setQuantity(rst.getString("quantity"));
			del.setAmount(rst.getString("amount"));
			del.setVehicleNo(rst.getString("vehicle_no"));
			del.setEmpID(rst.getString("emp_id"));
			del.setDate(rst.getString("date"));
			
			delList.add(del);
		}
		return delList;
	}

	@Override
	public boolean deleteDelivery(String delId) throws SQLException {
		
		String sql = "Delete from delivery where del_id='"+ delId+"'";
		Statement stm = conn.createStatement();
		
		return stm.executeUpdate(sql) > 0;
	}

	@Override
	public Delivery getDeliveryDetails(String searchId) throws SQLException {
		
		String sql = "Select * from delivery where = '"+searchId+"'";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<Delivery> delList = new ArrayList<Delivery>();
		Delivery del = new Delivery();
		
		while(rst.next()) {
			
			del.setDelID(rst.getString("del_id"));
			del.setOrderID(rst.getString("order_id"));
			del.setShopName(rst.getString("shop_name"));
			del.setAddress(rst.getString("address"));
			del.setEmail(rst.getString("email"));
			del.setBookID(rst.getString("book_id"));
			del.setQuantity(rst.getString("quantity"));
			del.setAmount(rst.getString("amount"));
			del.setVehicleNo(rst.getString("vehicle_no"));
			del.setEmpID(rst.getString("emp_id"));
			del.setDate(rst.getString("date"));
			
		}
		return del;
	}

}
