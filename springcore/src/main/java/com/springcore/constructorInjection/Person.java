package com.springcore.constructorInjection;

import java.util.List;

public class Person {
	private int personId;
	private String name;
	private Certificate certi;
	private List<String> list;
	
	public Person(int personId, String name, Certificate certi, List<String> list) {
		this.personId = personId;
		this.name = name;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return name+" : "+personId+" {"+this.certi.name+"}"+" "+this.list;
	}
	
	

}
