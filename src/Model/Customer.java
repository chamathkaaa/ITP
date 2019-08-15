package com.model;

public class Customer {

	private int cId;
	private String fname;
	private String lname;
	private String email;
	private String address;
	private String contactNumber;
	private String password;
	private String confirmPassword;
	
	public Customer() {
		
	}

	public Customer(int cId, String fname, String lname, String email, String address, String contactNumber,
			String password, String confirmPassword) {
		super();
		this.cId = cId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
	
	
	
	
}
