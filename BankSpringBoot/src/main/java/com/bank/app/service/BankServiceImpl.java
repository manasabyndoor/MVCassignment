package com.bank.app.service;

import java.util.List;

import com.bank.app.dao.BankDao;
import com.bank.app.dao.BankDaoImpl;
import com.bank.app.pojo.Customer;

public class BankServiceImpl implements BankService{

	BankDao dao=new BankDaoImpl();
	
	
	@Override
	public long withdraw(int id,int amount) {
		
		return dao.withdraw(id,amount);
	}

	@Override
	public long deposit(int id,int amount) {
		return dao.deposit(id,amount);
		
	}
public List<Customer> viewAll()
{
	
	return dao.viewAll();
	
}


@Override
public long fundTransfer(int id1, int id2, int amount) {
	return dao.fundTransfer(id1, id2, amount);
}

public void addNewCustomer(Customer customer) {
	dao.addNewCustomer(customer);
}

	
}
