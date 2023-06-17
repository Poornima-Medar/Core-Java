package com.transactionexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.transactionexample.dto.EmployeeRequestDto;
import com.transactionexample.enitity.Department;
import com.transactionexample.enitity.Employee;
import com.transactionexample.repository.DepartmentRepository;
import com.transactionexample.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	@Transactional
	public String saveEmployee(EmployeeRequestDto employeeRequestDto) {
		
		Department department = new Department();
		department.setDepartmentName(employeeRequestDto.getDepartmentName());
		department.setDepartmentCode(employeeRequestDto.getDepartmentName());

		Integer departmentId = departmentRepository.save(department).getDepartmentId();
		
		Employee employee = new Employee();
		
		employee.setEmployeeName(employeeRequestDto.getDepartmentName());
		employee.setEmployeeAddress(employeeRequestDto.getEmployeeAddress());
		employee.setDepartmentId(departmentId);
		
		employeeRepository.save(employee);
		
		return "Employee is saved with Employee Id: "+ employee.getEmployeeId();
	}

	

}
