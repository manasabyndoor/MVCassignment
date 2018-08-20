package com.bank.service;

import java.util.List;

import com.bank.pojo.Customer;

public interface BankService {
	public long withdraw(int id, int amount2);
	 public long deposit(int id,int amount);
	 public long fundTransfer(int id1, int id2, int amount);
	public List<Customer> viewAll();
}
