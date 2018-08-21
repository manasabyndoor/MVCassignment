package com.bank.app.dao;

import java.util.List;

import com.bank.app.pojo.Customer;


public interface BankDao {
 

public List<Customer> viewAll();

public void addNewCustomer(Customer customer);
public Customer getCustomerById(String customerId);

public void updateCustomerId(Customer customer, String customerId) ;
 
}
