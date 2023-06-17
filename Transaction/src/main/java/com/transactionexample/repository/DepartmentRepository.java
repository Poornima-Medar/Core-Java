package com.transactionexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transactionexample.enitity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
