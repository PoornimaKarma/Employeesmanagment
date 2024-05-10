package com.example.demo.EmployeeManagement.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeManagement.Entity.Employee;
import com.example.demo.EmployeeManagement.Repository.EmployeeRepository;
import com.example.demo.EmployeeManagement.service.Employeeservice;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class Employee_Serviceimple implements Employeeservice {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void save(Employee em) {
		//log.info("hello2");
		employeeRepository.save(em);
	}

	@Override
	public List<Employee> getAllemployee() {
		//log.info("hello");
		return  employeeRepository.findAll();
	}

	@Override
	public Employee getById(Integer id) {

		//log.info("hello3");
		return employeeRepository.getById(id);//findById(id).get();
	}

	@Override
	public Employee updateeEmployee(Employee em,Integer id) {
		if (employeeRepository.findById(id).isPresent())
		{
			Employee em1 = employeeRepository.findById(id).get();
			em1.setContactNumber(em.getContactNumber());
			em1.setEmailid(em.getEmailid());
			em1.setEmployeeName(em.getEmployeeName());
			Employee em2 = employeeRepository.save(em1);
			return em2;
		} else {
		
		return null;
	}

}
}