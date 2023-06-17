package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDAO;
import com.spring.model.Student;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "My program started...");
//        //JDBC Template Object
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
//        
//        //insert query
//        String query = "insert into student(id,name,city) values(?,?,?)";
//        
//        //fire query
//        int result = template.update(query,456,"Laxmi","Hubli");
//        System.out.println("record inserted"+result);
    	
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	StudentDAO dao = context.getBean("student",StudentDAO.class);
    	
        //Inserting a data in to the table
    	Student s1 = new Student();
    	s1.setId(4);
    	s1.setName("Bindu");
    	s1.setCity("Gadag");
    	
    	int result = dao.insert(s1);
    	System.out.println(result);
    	
    	
    	//updating student data
//    	s1.setId(1);
//    	s1.setName("Anvitha");
//    	s1.setCity("Mumbai");
//    	int result = dao.update(s1);
//    	System.out.println("Update is sucessfull "+result);
    	
    	//deleting student data
//    	System.out.println("Enter student Id");
//    	Scanner sc = new Scanner(System.in);
//    	int id = sc.nextInt();
//    	s1.setId(id);
//    	
//    	int result = dao.delete(s1);
//    	System.out.println("deleted row "+ result);
    	
    	
    	//Selecting single operation 
//    	Student student = dao.select(1);
//    	System.out.println(student);
    	
    	System.out.println("-----------------");
    	List<Student> students = dao.selectAll(s1);
    	for(Student s:students) {
    		System.out.println(s);
    	} 	
    	
    }
}
