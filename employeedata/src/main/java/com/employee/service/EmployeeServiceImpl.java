package com.employee.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public Employee saveEmployeeData(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Optional<Employee> emOptional = employeeRepository.findById(employeeId);
		return emOptional.get();
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public Employee findEmployeeByFirstName(String employeeFirstName) {
		return employeeRepository.findByEmployeeFirstName(employeeFirstName);
	}

	@Override
	public List<Employee> findAllEmployeeBySalaryLessThan(Double salary) {
		return employeeRepository.findBySalaryLessThan(salary);
	}

	@Override
	public Employee updateEmployee(int employeeId, Employee employee) {
	    Employee e = employeeRepository.findById(employeeId).get();
	    
	    if(Objects.nonNull(employee.getEmployeeFirstName()) && !"".equals(employee.getEmployeeFirstName())) {
	    	e.setEmployeeFirstName(employee.getEmployeeFirstName());
	    }
	    
	    if(Objects.nonNull(employee.getEmployeeLastName()) && !"".equals(employee.getEmployeeLastName())){
	    	e.setEmployeeLastName(employee.getEmployeeLastName());
	    }
	    
	    if(Objects.nonNull(employee.getBirthDate())&& !"".equals(employee.getBirthDate())) {
	    	e.setBirthDate(employee.getBirthDate());
	    }
	    
	    if(Objects.nonNull(employee.getSalary()) && !"".equals(employee.getSalary())) {
	    	e.setSalary(employee.getSalary());
	    }
	    
		return e;
	}

}
