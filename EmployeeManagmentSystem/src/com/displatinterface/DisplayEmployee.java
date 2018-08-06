package com.displatinterface;

import com.acceptinterface.Accept;


public class DisplayEmployee implements Display {
	
	private Accept a;
	

	@Override
	public void displaydata() {
		System.out.print(a.getname());
		System.out.println(a.getid());
		System.out.println(a.getsalary());
		
	
	}


	@Override
	public void set(Accept a) {
		this.a=a;
		
	}
}
