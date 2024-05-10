package com.example.demo.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeManagement.Entity.Employee;
import com.example.demo.EmployeeManagement.service.Employeeservice;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class Employeecontroller {

	@Autowired
	private Employeeservice employeeservice;

	@PostMapping("/saveemployee")
	public void save(@RequestBody Employee em)
	{
		 employeeservice.save(em);
	}

	@GetMapping("/getAll")
	public List<Employee> getAllemployee() {
		//log.info("print here:");
		return employeeservice.getAllemployee();
	}

	@GetMapping("/employeeid/{id}")
	public Employee getById(@PathVariable("id")int id) 
	{
		return  employeeservice.getById(id);
	}

	@PutMapping("/updateemployee/{id}")
	public Employee updateemployee(@PathVariable("id")Integer id, @RequestBody Employee em) {
		return  employeeservice.updateeEmployee(em, id);
	}
}
