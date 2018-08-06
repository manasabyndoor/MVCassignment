package com.dao;

import java.util.HashSet;
import java.util.Set;

import com.pojo.Employee;

public abstract class BankAccountServices {
	private static Set<Employee> employee;
	static {
		employee = new HashSet<>();
	}
	public void addEmplyoyeeid(Employee employee_id) {
		employee.add(employee_id);
	}
	public void addEmplyoyeename(Employee name) {
		employee.add(name);
	}
	public void addEmplyoyeesalary(Employee salary) {
		employee.add(salary);
	}
	public Set<Employee> viewAll(){
		return employee;
	}
	

}
