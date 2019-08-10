package Model;

public class Delivery {

	private String delID;
	private String orderID;
	private String shopName;
	private String address;
	private String email;
	private String bookID;
	private int quantity;
	private float amount;
	private String vehicleNo;
	private String empID;
	private String date;
	
	public Delivery() {
		
	}
	
	public Delivery(String delID, String orderID, String shopName, String address, String email, String bookID,
			int quantity, float amount, String vehicleNo, String empID, String date) {
		super();
		this.delID = delID;
		this.orderID = orderID;
		this.shopName = shopName;
		this.address = address;
		this.email = email;
		this.bookID = bookID;
		this.quantity = quantity;
		this.amount = amount;
		this.vehicleNo = vehicleNo;
		this.empID = empID;
		this.date = date;
	}

	public String getDelID() {
		return delID;
	}

	public void setDelID(String delID) {
		this.delID = delID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
