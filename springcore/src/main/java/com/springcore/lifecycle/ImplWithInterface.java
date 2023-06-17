package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ImplWithInterface implements InitializingBean, DisposableBean {
	private int x;

	public void setX(int x) {
		System.out.println("setting value");
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public ImplWithInterface(int x) {
		super();
		this.x = x;
	}

	public ImplWithInterface() {
		super();
	}

	@Override
	public String toString() {
		return "ImplWithInterface [x=" + x + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inti method called");

	}

	public void destroy() throws Exception {
		System.out.println("Destroy method is called");

	}
}
