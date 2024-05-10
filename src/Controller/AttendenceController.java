package com.example.demo.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeManagement.Entity.Attendence;
import com.example.demo.EmployeeManagement.service.AttendenceService;

@RestController
//@RequestMapping("/api")
public class AttendenceController {
    
	@Autowired
	AttendenceService attendenceService;

	@PostMapping("/saveattendence")
	public void save(@RequestBody Attendence attendence)
	{
		 attendenceService.save(attendence);
	}

	@GetMapping("/getAll1")
	public List<Attendence> getAllemployee() {
		return attendenceService.getAllattendence();
	}

	@GetMapping("/attendenceid/{id}")
	public Attendence getById(@PathVariable("id")Integer id) 
	{
		return  attendenceService.getById(id);
	}
	
	@PutMapping("/updateattendence/{id}")
	public Attendence updateattendencd(@PathVariable("id")Integer id, @RequestBody Attendence attendence) 
	{
		return  attendenceService.updateattendence(attendence, id);
	}
}

