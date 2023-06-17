package com.Animal;

public class Cat {
	@ImportantString
	String name;

	public Cat(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Cat runs fastly");
	}

	@RunImmediatly
	public void sound() {
		System.out.println("Meow");
	}

	public void drink() {
		System.out.println("Milk");
	}

}
