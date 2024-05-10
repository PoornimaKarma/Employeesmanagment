package com.example.demo.EmployeeManagement.Entity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendence")
public class Attendence
 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer a_id;
	private Date date;
	private String isPresent;
	@ManyToOne
	@JoinColumn//(name="emp_id")  
	private Employee employee;
	
  	public Attendence()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendence(Integer a_id, Date date, String isPresent, Employee employee) {
		super();
		this.a_id = a_id;
		this.date = date;
		this.isPresent = isPresent;
		this.employee = employee;
	}

	public Integer getA_id() {
		return a_id;
	}

	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(String isPresent) {
		this.isPresent = isPresent;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Attendence [a_id=" + a_id + ", date=" + date + ", isPresent=" + isPresent + ", employee=" + employee
				+ "]";
	}
 } 

