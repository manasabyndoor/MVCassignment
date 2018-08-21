package com.bank.app.service;

import java.util.List;

import com.bank.app.pojo.Customer;

public interface BankService {
	
	
	public List<Customer> viewAll();
	public void addNewCustomer(Customer customer);
	public Customer getCustomerById(String id);
	public void updateCustomerId(Customer customer, String customerId) ;
}
