package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Delivery;
import Util.DBConnection;

public class DeliveryServiceImpl implements DeliveryService{

	private static Connection conn;
	
	public DeliveryServiceImpl() {
		
		conn = DBConnection.getConnection();
	}
	
	@Override
	public ArrayList<Delivery> getAllDeliveries() {
		// TODO Auto-generated method stub
		
		String sql = "Select * from stockOrder";

		return null;
	}

	@Override
	public boolean addNewDelivery(Delivery del) {
		
		String sql = "Insert into delivery values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setObject(1, del.getOrderID());
		stm.setObject(2, del.getShopName());
		stm.setObject(3, del.getAddress());
		stm.setObject(4, del.getEmail());
		stm.setObject(5, del.getBookID());
		return false;
	}

}
