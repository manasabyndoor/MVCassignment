package com.bank.app.dao;

import java.util.List;

import com.bank.app.pojo.Customer;


public interface BankDao {
 public long withdraw(int id,int amount);
 public long deposit(int id1,int amount);
public Customer searchById(int id);
public List<Customer> viewAll();
public long fundTransfer(int id1, int id2, int amount);
public void addNewCustomer(Customer customer);
 
}
