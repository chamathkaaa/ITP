package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Customer;

public interface CustomerService {

	boolean addNewCustomer(Customer c) throws SQLException;

	public ArrayList<Customer> getAllCustomers() throws SQLException;

	boolean deleteStudent(String cId) throws SQLException;

	public Customer getCustomerDetails(String searchId) throws SQLException;

	public Customer LoginFunction(String email, String password) throws SQLException;
	
}
