package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/configaration.xml");

		// register shutdown hook
		context.registerShutdownHook();

		ImplWithXML s = (ImplWithXML) context.getBean("s1");
		System.out.println(s);

		System.out.println("-----------------------------------------");

		ImplWithInterface i = (ImplWithInterface) context.getBean("i1");
		System.out.println(i);

		System.out.println("-----------------------------------------");

		ImplWithAnnotation a = (ImplWithAnnotation) context.getBean("a1");
		System.out.println(a);

	}

}
