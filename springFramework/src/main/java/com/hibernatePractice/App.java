package com.hibernatePractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("com/hibernatePractice/config.xml");
//    	Doctor d = context.getBean("doctor",Doctor.class);
//    	d.specialist();
    	
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	Doctor d = context.getBean("name",Doctor.class);
    	d.specialist();
    	System.out.println(d.getName());
    	
    	
    }
}
