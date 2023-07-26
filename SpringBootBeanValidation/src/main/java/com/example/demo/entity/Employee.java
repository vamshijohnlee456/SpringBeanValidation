package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer empId;
	
	@NotEmpty(message="employee name should not be empty or null")
	@Size(min=3, max = 15, message = "employee name should be above condition")
	private String empName;
	//@NotEmpty(message="employee salary should not be empty or null")
	//@Min(value = 10000)
	private Integer empSalary;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	
}
