package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployeeData(Employee employee);

	public List<Employee> findAllEmployee();
	
	public Employee getEmployeeById(int employeeId);

	public void deleteEmployeeById(int employeeId);

	public Employee findEmployeeByFirstName(String employeeFirstName);

	public List<Employee> findAllEmployeeBySalaryLessThan(Double salary);

	public Employee updateEmployee(int employeeId, Employee employee);	

}
