package com.inheritance.hibernateinheritance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project extends Employee{

	private int projectId;
	@Column(length = 20)
	private String projectName;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Project(int employeeId, String employeeName, int projectId, String projectName) {
		super(employeeId, employeeName);
		this.projectId = projectId;
		this.projectName = projectName;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + "]";
	}
	
	

}
