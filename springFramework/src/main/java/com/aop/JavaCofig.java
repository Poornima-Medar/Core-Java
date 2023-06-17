package com.aop;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class JavaCofig {
	
	@Bean("app")
	public Application application() {
		return new Application();
	}
	
	@Bean("aop")
	public AopDemo aopDemo() {
		return new AopDemo();
	}
	

}
