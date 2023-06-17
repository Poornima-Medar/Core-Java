package com.springcore.collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/standalone/standaloneconfig.xml");
	Person p = context.getBean("Person1",Person.class);
	System.out.println(p);
	System.out.println(p.getName().getClass().getName());
	System.out.println(p.getAddress().getClass().getName());
	System.out.println(p.getCourse().getClass().getName());
	System.out.println(p.getProperty().getClass().getName());

	}

}
