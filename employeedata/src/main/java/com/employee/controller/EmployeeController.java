package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee saveEmployeeData(@RequestBody Employee employee) {
		return employeeService.saveEmployeeData(employee);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>>  findAllEmployee(){
		return new ResponseEntity<List<Employee>>(employeeService.findAllEmployee(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") int employeeId) {
		return employeeService.getEmployeeById(employeeId);
		
	}
	
	@GetMapping("/name/{name}")
	public Employee findEmployeeByFirstName(@PathVariable("name") String employeeFirstName){
		return employeeService.findEmployeeByFirstName(employeeFirstName);	
	}
	
	@GetMapping("/salary/{salary}")
	public List<Employee> findAllEmployeeBySalaryLessThan(@PathVariable("salary") Double salary){
		return employeeService. findAllEmployeeBySalaryLessThan(salary);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable("id") int employeeId,@RequestBody Employee employee) {
		return employeeService.updateEmployee(employeeId,employee);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployeeById(@PathVariable("id") int employeeId) {
		employeeService.deleteEmployeeById(employeeId);
		return "Data is deleted successfully";	
	}
	
}
