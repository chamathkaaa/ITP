package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.Delivery;

public interface DeliveryService {

	//public ArrayList<Delivery> getAllDeliveries();

	 boolean addNewDelivery(Delivery del) throws SQLException;
}
