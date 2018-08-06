package com.acceptinterface;

import com.pojo.Employee;

public class AcceptEmployee implements Accept {
/*
	@Override
	public void getdata() {
		
String name;
Employee e1=new Employee(0, null, 0);
e1.getEmployee_id();
name=e1.getName();
double salary=e1.getSalary();
int id=e1.getEmployee_id();
System.out.println(name);*/
	//}

	@Override
	public int getid() {
			return 12;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return "manasa";
	}


	@Override
	public double getsalary() {
		// TODO Auto-generated method stub
		return 567890;
	}

	
}
