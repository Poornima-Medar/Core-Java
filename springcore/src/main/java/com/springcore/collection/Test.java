package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Employee employee1 = (Employee)context.getBean("employee1");
		System.out.println(employee1);
		System.out.println(employee1.hashCode());
		
		Employee employee2 = (Employee)context.getBean("employee1");
		System.out.println(employee2.hashCode());

	}

}
