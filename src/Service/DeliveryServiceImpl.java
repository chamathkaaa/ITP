package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Delivery;
import Util.DBConnection;

public class DeliveryServiceImpl implements DeliveryService{

	private static Connection conn;
	
	public DeliveryServiceImpl() {
		
		conn = DBConnection.getConnection();
	}
	
	/*@Override
	public ArrayList<Delivery> getAllDeliveries() {
		// TODO Auto-generated method stub
		
		String sql = "Select * from stockOrder";

		return null;
	}*/

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

}
