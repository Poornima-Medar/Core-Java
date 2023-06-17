package com.spring.dao;

import java.util.List;

import com.spring.model.Student;

public interface StudentDAO {
	
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student select(int studentId);
	
	public List<Student> selectAll(Student student);
	
}
