package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constructorConfig.xml");
	Person p = (Person)context.getBean("person");
	System.out.println(p);
	
	AdditionAmbiguity add = (AdditionAmbiguity) context.getBean("add");
	add.doSum();

	}

}
