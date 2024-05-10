package com.example.demo.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.EmployeeManagement.Entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
