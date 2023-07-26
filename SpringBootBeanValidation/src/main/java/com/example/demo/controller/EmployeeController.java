package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping
	public Employee saveEmp(@Valid @RequestBody Employee employee) {
		return  employeeRepository.save(employee);
		
		
	}

}
