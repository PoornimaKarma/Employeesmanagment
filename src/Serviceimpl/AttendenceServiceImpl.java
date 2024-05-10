package com.example.demo.EmployeeManagement.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeManagement.Entity.Attendence;
import com.example.demo.EmployeeManagement.Repository.AttendenceRepository;
import com.example.demo.EmployeeManagement.service.AttendenceService;
@Service
public class AttendenceServiceImpl implements AttendenceService {

	@Autowired
	private AttendenceRepository attendenceRepository;
    @Override
	public void save(Attendence attendence) {
		attendenceRepository.save(attendence);
	}

	@Override
	public List<Attendence> getAllattendence() {

		return attendenceRepository.findAll();
	}

	@Override
	public Attendence getById(Integer id) {

		return attendenceRepository.findById(id).get();
	}

    @Override
	public Attendence updateattendence(Attendence attendence, Integer id) {
		if (attendenceRepository.findById(id).isPresent()) {
			Attendence attendence1 = attendenceRepository.findById(id).get();

			attendence1.setDate(attendence.getDate());
			attendence1.setIsPresent(attendence.getIsPresent());
			attendence1.setEmployee(attendence.getEmployee());

			Attendence attendence2 = attendenceRepository.save(attendence1);
			return attendence2;
		} else {

			return null;
		}

	}

	


}

