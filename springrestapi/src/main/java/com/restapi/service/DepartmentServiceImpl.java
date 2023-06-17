package com.restapi.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.Department;
import com.restapi.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fecthDepartmentList() {
		return departmentRepository.findAll();
	}

	@Override
	public Department fectgDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);

	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department depDB = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
		}
		

		if (Objects.nonNull(department.getDepartmentLocation()) && !"".equalsIgnoreCase(department.getDepartmentLocation())) {
			depDB.setDepartmentLocation(department.getDepartmentLocation());
		}
		

		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDB.setDepartmentCode(department.getDepartmentCode());
		}
			
		
		return departmentRepository.save(depDB);
	}

	@Override
	public List<Department> fectchDepartmentByName(String departmentName) {	
		return departmentRepository.findByDepartmentName(departmentName);
	}

}
