package com.example.demo.EmployeeManagement.service;

import java.util.List;

import com.example.demo.EmployeeManagement.Entity.Attendence;

public interface AttendenceService {

	void save(Attendence attendence);

	List<Attendence> getAllattendence();
    
	Attendence updateattendence(Attendence attendence, Integer id);

	Attendence getById(Integer id);

		}

