package Model;

public class StockDelivery {

	private String orderId;
	private String shopId;
	private String shopName;
	private String address;
	private String email;
	private String bookId;
	private String unitPrice;
	private String quantity;
	private String amount;
	
	public StockDelivery() {
		
	}

	public StockDelivery(String orderId, String shopId, String shopName, String address, String email, String bookId,
			String unitPrice, String quantity, String amount) {
		super();
		this.orderId = orderId;
		this.shopId = shopId;
		this.shopName = shopName;
		this.address = address;
		this.email = email;
		this.bookId = bookId;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.amount = amount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	
	
}
