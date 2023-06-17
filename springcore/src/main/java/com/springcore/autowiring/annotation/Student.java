package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("s")
	private Information studentInfo;

	public Information getStudentInfo() {
		return studentInfo;
	}

	
	public void setStudentInfo(Information studentInfo) {
		System.out.println("Setter called");
		this.studentInfo = studentInfo;
	}
	
	
	public Student(Information studentInfo) {
		super();
		System.out.println("Constructor called");
		this.studentInfo = studentInfo;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentInfo=" + studentInfo + "]";
	}

}
