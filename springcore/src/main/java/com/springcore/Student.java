package com.springcore;

public class Student {
	private int studentID;
	private String studentName;
	private String studentAddress;

	public void setStudentID(int studentID) {
		System.out.println("studentId");
		this.studentID = studentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting studentName");
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("studentAddress");
		this.studentAddress = studentAddress;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public Student(int studentID, String studentName, String studentAddress) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
