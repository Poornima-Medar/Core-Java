package com.springcore.lifecycle;

public class ImplWithXML {

	private String name;

	public void setName(String name) {
		System.out.println("Setting the value");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ImplWithXML(String name) {
		this.name = name;
	}

	public ImplWithXML() {
		super();
	}

	public String toString() {
		return this.name;
	}
	
	//name of the init method can be anything(not compulsory init)
	public void init() {
		System.out.println("init method is callled");
	}
	
	//name of the destroy method can be anything(not compulsory destroy)
	public void destroy() {
		System.out.println("destroy method is called");
	}

}
