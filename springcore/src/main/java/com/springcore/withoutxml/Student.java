package com.springcore.withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	@Autowired
	public void study(Name name) {
		System.out.println(name+" is Studing");
	}
}
