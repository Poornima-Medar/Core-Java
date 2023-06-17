package com.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import com.employee.EmployeedataApplication;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@SpringBootTest(classes = EmployeedataApplication.class)
class EmployeeServiceTest {
	
	@SpyBean
	private EmployeeService employeeService;
	
	@MockBean
	private EmployeeRepository employeeRepository;

	Employee mockEmployee1;
	Employee mockEmployee2;
	List<Employee> employeeList = new ArrayList<>();
	Optional<Employee> emOptional;
	
	@BeforeEach
	public void setup() {
		mockEmployee1 = new Employee(1,"Poornima","Medar",LocalDate.of(2000, 11, 06),10000.0);
		mockEmployee2 = new Employee(2,"John","L",LocalDate.of(2001, 01, 06),20000.0);
		emOptional = Optional.of(mockEmployee1);
		
		employeeList.add(mockEmployee1);
		employeeList.add(mockEmployee2);
	}
	
	@Test
	public void testSaveEmployeeData() {
		//Employee employee = new Employee(1,"Poornima","Medar",LocalDate.of(2000, 11, 06),10000.0);
		Mockito.when(employeeRepository.save(any())).thenReturn(mockEmployee1);	
		employeeService.saveEmployeeData(new Employee());
		verify(employeeRepository, times(1)).save(any());
	}
	
	@Test
	public void testFindAllEmployee() {
		Mockito.when(employeeRepository.findAll()).thenReturn(employeeList);
		List<Employee> employees = employeeService.findAllEmployee();
		assertEquals(2, employees.size());	
	}
	
	@Test
	public void testGetEmployeeById() {
		Mockito.when(employeeRepository.findById(1)).thenReturn(emOptional);
		Employee e  = employeeService.getEmployeeById(1);
		assertEquals(1,e.getEmployeeId());
	}
	
	@Test
	public void testFindEmployeeByFirstName() {
		Mockito.when(employeeRepository.findByEmployeeFirstName(anyString())).thenReturn(mockEmployee1);
		Employee e =  employeeService.findEmployeeByFirstName("John");
		assertNotEquals("John", e.getEmployeeFirstName());
	}

}
