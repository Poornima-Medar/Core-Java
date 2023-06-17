package com.springcore.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		Student s = new Student();
		return s;
	}
	
	@Bean
	public Name name() {
		return new Name();
	}
}
