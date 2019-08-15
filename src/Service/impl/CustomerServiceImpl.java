package com.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Customer;
import com.service.CustomerService;
import com.util.DBConnection;

public class CustomerServiceImpl implements CustomerService {

	private static Connection conn;
	
	public CustomerServiceImpl() {
		
		conn = DBConnection.getConnection();
		
	}
	
	@Override
	public boolean addNewCustomer(Customer c) throws SQLException {
		
		String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm = conn.prepareStatement(sql);
		
		stm.setObject(1, 0);
		stm.setObject(2, c.getFname());
		stm.setObject(3, c.getLname());
		stm.setObject(4, c.getEmail());
		stm.setObject(5, c.getAddress());
		stm.setObject(6, c.getContactNumber());
		stm.setObject(7, c.getPassword());
		stm.setObject(8, c.getConfirmPassword());
		
		int res = stm.executeUpdate();
				
		return res>0;
	}

	@Override
	public ArrayList<Customer> getAllCustomers() throws SQLException {
		
		String sql = "select * from customer";
		
		Statement stm = conn.createStatement();
		
		ResultSet rst = stm.executeQuery(sql);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		while(rst.next()) {
			
			Customer c = new Customer();
			
			c.setcId(Integer.parseInt(rst.getString("cId"))); 
			c.setFname(rst.getString("fname"));
			c.setLname(rst.getString("lname"));
			c.setEmail(rst.getString("email"));
			c.setAddress(rst.getString("address"));
			c.setContactNumber(rst.getString("contactNumber"));
			c.setPassword(rst.getString("password"));
			c.setConfirmPassword(rst.getString("confirmPassword"));
			
			customerList.add(c);
		}

		return customerList;
	}

	@Override
	public boolean deleteStudent(String cId) throws SQLException {
		
		String sql = "Delete from customer where cId = '"+cId+"'";
		
		Statement stm = conn.createStatement();
		
		return stm.executeUpdate(sql)>0;
	}

	@Override
	public Customer getCustomerDetails(String searchId) throws SQLException {
		
		String sql = "select * from customer where cId='"+searchId+"'";
		
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer c = new Customer();
		
		while(rst.next()) {
					
			c.setcId(Integer.parseInt(rst.getString("cId"))); 
			c.setFname(rst.getString("fname"));
			c.setLname(rst.getString("lname"));
			c.setEmail(rst.getString("email"));
			c.setAddress(rst.getString("address"));
			c.setContactNumber(rst.getString("contactNumber"));
			c.setPassword(rst.getString("password"));
				
		}

		return c;
		
	}

	@Override
	public Customer LoginFunction(String email, String password) throws SQLException {
		
		String sql2 ="select * from customer where email='"+email+"' AND password='"+password+"' ";
		
		Statement statement = conn.createStatement();
		
		ResultSet rst2 = statement.executeQuery(sql2);		
		
		Customer c1 = new Customer();
		
		if(rst2.next()) {
			
			c1.setcId(Integer.parseInt(rst2.getString("cId")));
			c1.setFname(rst2.getString("fname"));
			c1.setLname(rst2.getString("lname"));
			c1.setEmail(rst2.getString("email"));
			c1.setAddress(rst2.getString("address"));
			c1.setContactNumber(rst2.getString("contactNumber"));
			c1.setPassword(rst2.getString("password"));
			c1.setConfirmPassword(rst2.getString("confirmPassword"));
			
		}
		
		return c1;
		
	}

}
