package com.aop;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;


//@Component
@Aspect
public class AopDemo {
	
	@Before("execution(* com.aop.Application.check())")
	public void loging() {
		System.out.println("Logged");
	}
	
	@After("execution(* com.aop.Application.check())")
	public void loggedOf() {
		System.out.println("loogedOf");
	}

}
