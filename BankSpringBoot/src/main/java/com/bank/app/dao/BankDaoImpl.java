package com.bank.app.dao;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bank.app.pojo.Customer;

public class BankDaoImpl implements BankDao {

	static Customer customer = new Customer();
	List<Customer> list = new ArrayList<>(Arrays.asList(new Customer("55", "manasa", 44456, "mans@hd.com", "Indian", "female", 1000),
			new Customer("54", "sangi", 435456, "mabc@hd.com", "Indian", "female", 3757),
			new Customer("fgd", "naksha", 48856, "jdk@hd.com", "Indian", "female", 43975) ,
			new Customer("dth", "manu", 49806, "mans@hd.com", "Indian", "female", 6776)));

	



	@Override
	public List<Customer> viewAll() {
		
		return list;

	}

	
	@Override
	public void addNewCustomer(Customer customer) {
		list.add(customer);
		
	}

	@Override
	public Customer getCustomerById(String id) {
		return list.stream().filter(t->t.getCustomerId().equals(id)).findFirst().get();
	}


	@Override
	public void updateCustomerId(Customer customer,String customerId) {
		for(int i=0;i<list.size();i++)
		{
			Customer cust=list.get(i);
			if(cust.getCustomerId().equals(customerId))
				list.set(i, cust);
		}
	}


	
}
