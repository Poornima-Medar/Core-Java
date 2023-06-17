package com.jdbc.model;

public class Department {
	private int dept_no;
	private String dept_name;
	private String dept_location;
	
	public Department(int dept_no, String dept_name, String dept_location) {
		super();
		this.dept_no = dept_no;
		this.dept_name = dept_name;
		this.dept_location = dept_location;
	}
	
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_location() {
		return dept_location;
	}
	public void setDept_location(String dept_location) {
		this.dept_location = dept_location;
	}
	
	

}
