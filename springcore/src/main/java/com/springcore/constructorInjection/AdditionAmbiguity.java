package com.springcore.constructorInjection;

public class AdditionAmbiguity {
	private int a;
	private int b;

	public AdditionAmbiguity(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructor int int is called");
	}

	public AdditionAmbiguity(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor double double is called");
	}

	public AdditionAmbiguity(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor string string is called");
	}

	public void doSum() {
		System.out.println("The value of a is " + ": " + this.a);
		System.out.println("The value of b is " + ": " + this.b);
		System.out.println("The sum of a and b is " + ": " + (this.a + this.b));
	}

}
