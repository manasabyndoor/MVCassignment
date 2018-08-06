package com.pojo;

public class Employee {
private  int employee_id;
@Override
public String toString() {
	return "Employee [employee_id=" + employee_id + ", name=" + name + ", salary=" + salary + "]";
}
public Employee(int employee_id, String name, double salary) {
	super();
	this.employee_id = employee_id;
	this.name = name;
	this.salary = salary;
}
private String name;
private double salary;
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name ="manasa";
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = 10000;
}

	
	
}
