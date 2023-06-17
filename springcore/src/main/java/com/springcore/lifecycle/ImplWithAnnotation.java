package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ImplWithAnnotation {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ImplWithAnnotation(String name) {
		super();
		this.name = name;
	}

	public ImplWithAnnotation() {
		super();
	}

	@Override
	public String toString() {
		return "ImplWithAnnotation [name=" + name + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Init method..");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroy method");
	}

}
