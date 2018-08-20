package com.bank.app.test;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.pojo.Customer;
import com.bank.app.service.BankServiceImpl;

@RestController
public class BankController {
	BankServiceImpl service=new BankServiceImpl();
@RequestMapping("/view")
	public List<Customer> viewAll()
	{
	System.out.println(service.viewAll());
		return service.viewAll();
	}
	@RequestMapping(method=RequestMethod.POST,value="/view")
	public void addNewCustomer(@RequestBody Customer customer)
	{
		service.addNewCustomer(customer);
	}
}
