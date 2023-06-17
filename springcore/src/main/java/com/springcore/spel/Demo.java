package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{ T(com.springcore.spel.Operation).square(25) }")
	private int a;

	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private int b;

	@Value("#{ T(com.springcore.spel.Operation).add(2,4) }")
	private int sum;

	@Value("#{ T(java.lang.Math).PI }")
	private double pi;

	@Value("#{ new String('Poornima Medar')}")
	private String name;
	
	@Value("#{ 8==8}")
	private boolean flag;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", sum=" + sum + ", pi=" + pi + ", name=" + name + ", flag=" + flag + "]";
	}

}
