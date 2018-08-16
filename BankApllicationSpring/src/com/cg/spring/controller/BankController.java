package com.cg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.service.BankService;
import com.bank.service.BankServiceImpl;

@Controller
public class BankController {
	BankService service=new BankServiceImpl();
	
	public BankController() {
		System.out.println("hey");
	}
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/withdraw")
	public String withdraw()
	{
		return "withdraw";
	}

	@RequestMapping("/balance")
	public String balance(@RequestParam("custid") String customerId, @RequestParam("amount") String amount,Model model)
	{
		System.out.println("gdfg");
		int res=(int) service.withdraw(Integer.parseInt(customerId),Integer.parseInt(amount));
		System.out.println(res);
		model.addAttribute("result",res);
		return "balance";
		
		
	}
	@RequestMapping("/deposit")
	public String deposit()
	{
		return "deposit";
	}

	@RequestMapping("/depositbalance")
	public String depositbalance(@RequestParam("id") String customerId, @RequestParam("depositamount") String amount,Model model)
	{
		
		int res=(int) service.deposit(Integer.parseInt(customerId),Integer.parseInt(amount));
		System.out.println(res);
		model.addAttribute("result",res);
		return "depositbalance";
		
		
	}
	
	
	
	
	
	
}
