package com.restapi.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Department;
import com.restapi.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String demo() {
		return "Hi Poornima, Good Morning";
	}

	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/departments")
	public List<Department> fecthDepartmentList() {
		return departmentService.fecthDepartmentList();
	}

	@GetMapping("/departments/{id}")
	public Department fectgDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.fectgDepartmentById(departmentId);

	}

	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "department record is deleted successfully";
	}

	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department) {
		return departmentService.updateDepartment(departmentId,department);
	}
	
	@GetMapping("/departments/name/{name}")
	public List<Department> fectchDepartmentByName(@PathVariable("name") String departmentName){
		return departmentService.fectchDepartmentByName(departmentName);
		
	}
	

}
