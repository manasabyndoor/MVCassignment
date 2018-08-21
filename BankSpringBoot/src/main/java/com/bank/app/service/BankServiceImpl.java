package com.bank.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.app.dao.BankDao;
import com.bank.app.dao.BankDaoImpl;
import com.bank.app.pojo.Customer;
@Service
public class BankServiceImpl implements BankService{

	BankDao dao=new BankDaoImpl();
	
	
	
public List<Customer> viewAll()
{
	
	return dao.viewAll();
	
}


public void addNewCustomer(Customer customer) {
	 dao.addNewCustomer(customer);
}


public Customer getCustomerById(String customerId) {
	return dao.getCustomerById(customerId);
}


public void updateCustomerId(Customer customer, String customerId) {
	 dao.updateCustomerId(customer,customerId);
}





	
}
