package com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.bank.pojo.Customer;


public class BankDaoImpl implements BankDao {
	List<Integer> fundlist=new ArrayList<Integer>();

	static Customer customer = new Customer();

	Customer customer1 = new Customer(123, "manasa", 435456, "mans@hd.com", "Indian", "female", 1000);
	Customer customer2 = new Customer(124, "dghjf", 435456, "mans@hd.com", "Indian", "female", 3757);
	Customer customer3 = new Customer(125, "dfg", 435456, "mans@hd.com", "Indian", "female", 43975);
	Customer customer4 = new Customer(126, "rt", 435456, "mans@hd.com", "Indian", "female", 6776);

	List<Customer> list = new ArrayList<>();

	
	
	
	
	@Override
	public long withdraw(int id,int amount) {

viewAll();


Customer c=searchById(id);

c.setBalance(c.getBalance()-amount);
return c.getBalance();

	}
	
	@Override
	public long deposit(int id1,int amount) {
		Customer c=searchById(id1);
		c.setBalance(c.getBalance()+amount);
		
		return c.getBalance();
	}

	@Override
	public List<Customer> viewAll() {
		list.add(customer1);
		list.add(customer2);

		list.add(customer3);
		list.add(customer4);
		return list;

	}

	public long fundTransfer(int id1,int id2,int amount)
	{
		long res=withdraw(id1,amount);
		System.out.println(res);
		long res2=deposit(id2,amount);
		return res;
	}


	@Override
	public Customer searchById(int id) {

		Customer c=null;
		for(Customer customer : list)
		{
			if(customer.getCustomerId()==id)
				c=customer;
		}
		return c;
	}

}
