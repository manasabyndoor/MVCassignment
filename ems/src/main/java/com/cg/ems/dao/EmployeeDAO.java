package com.cg.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.bean.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
	@Query("Select * from emp")
	public List<Employee> findalsknfkusdvuig(int empId, String empName);
	
}