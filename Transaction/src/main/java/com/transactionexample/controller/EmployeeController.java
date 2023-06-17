package com.transactionexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transactionexample.dto.EmployeeRequestDto;
import com.transactionexample.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public String saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {
		return employeeService.saveEmployee(employeeRequestDto);
	}

}
