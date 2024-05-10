package com.example.demo.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeManagement.Entity.Attendence;

@Repository
public interface AttendenceRepository extends JpaRepository<Attendence, Integer>
{



	
}

