 package com.example.demo.EmployeeManagement.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String employeeName;
	private String emailid;
	private Integer contactNumber;	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Attendence> attendence;

	public Employee(Integer id, String employeeName, String emailid, Integer contactNumber,
			List<Attendence> attendence) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.emailid = emailid;
		this.contactNumber = contactNumber;
		this.attendence = attendence;
	}
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Attendence> getAttendence() {
		return attendence;
	}

	public void setAttendence(List<Attendence> attendence) {
		this.attendence = attendence;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", emailid=" + emailid + ", contactNumber="
				+ contactNumber + ", attendence=" + attendence + "]";
	}

}