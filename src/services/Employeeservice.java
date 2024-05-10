package com.example.demo.EmployeeManagement.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.EmployeeManagement.Entity.Employee;
@Service
public interface Employeeservice {

		void save(Employee em);
		public List<Employee> getAllemployee();
		Employee getById(Integer id);
	
		Employee updateeEmployee(Employee em, Integer id);
		//Employee updateemployee(Employee em, Integer id);
	    
	 }

