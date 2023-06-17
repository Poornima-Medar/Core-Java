package com.employee.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

      public Employee findByEmployeeFirstName(String employeeFirstName);

      public List<Employee> findBySalaryLessThan(Double salary);
      
      public List<Employee> findByBirthDate(LocalDate birthDate);
      
      

}
