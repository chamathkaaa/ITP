package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Delivery;

public class DeliveryServiceImpl implements DeliveryService{

	@Override
	public ArrayList<Delivery> getAllDeliveries() {
		// TODO Auto-generated method stub
		
		String sql = "Select * from stockOrder";

		return null;
	}

}
