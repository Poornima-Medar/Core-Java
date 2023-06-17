package com.hibernatePractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.hibernatePractice")
public class JavaConfig {
	
	@Bean("name")
	public Doctor doctor() {
		return new Doctor();
	}

}
