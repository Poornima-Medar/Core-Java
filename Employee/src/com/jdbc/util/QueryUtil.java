package com.jdbc.util;

public class QueryUtil {

	public static String insertEmployeeQuery() {
		return "insert into employee_information (employee_name,employee_address,employee_salary,dept_no) values(?,?,?,?)";
	}

	public static String selectAllEmployeeQuery() {
		return "select * from employee_information ";
	}

	public static String selectEmployeeById(int employeeId) {
		return "select * from employee_information where employee_id = " + employeeId;
	}

	public static String deleteEmployeeById(int employeeId) {
		return "delete from employee_information where employee_id = " + employeeId;
	}

	public static String updateEmployeeQuery(int employeeId) {
		return "update employee_information set employee_name = ?, employee_address = ?, employee_salary = ?, dept_no = ?  where employee_id = "
				+ employeeId;
	}
	
	public static String insertDepartmentQuery() {
		return "insert into department (dept_no,dept_name,dept_location) values(?,?,?)";
	}
	
	public static String selectAllDepartment() {
		return "select * from department";
	}
	
	public static String updateDepartmentQuery(int dept_no) {
		return "update department set dept_name = ?, dept_location = ? where dept_no = "
				+ dept_no;
	}
	
	public static String selectDepartmentByDeptNo(int deptNo) {
		return "select * from department where dept_no = "+deptNo;
	}

}


//and delete * from employee_information
