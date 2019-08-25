package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.Delivery;
import Model.StockDelivery;

public interface DeliveryService {

	 boolean addNewDelivery(Delivery del) throws SQLException;
	 
	 public ArrayList<StockDelivery> getAllDeliveries() throws SQLException;
	 
	 public ArrayList<Delivery> getViewDeliveries() throws SQLException;

	boolean deleteDelivery(String delId) throws SQLException;

	Delivery getDeliveryDetails(String searchId) throws SQLException;
}
