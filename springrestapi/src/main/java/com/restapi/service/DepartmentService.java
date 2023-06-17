package com.restapi.service;

import java.util.List;

import com.restapi.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fecthDepartmentList();

	public Department fectgDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public List<Department> fectchDepartmentByName(String departmentName);

}
