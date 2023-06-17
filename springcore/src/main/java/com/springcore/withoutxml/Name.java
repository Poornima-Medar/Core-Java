package com.springcore.withoutxml;

import org.springframework.beans.factory.annotation.Value;

public class Name {
	@Value("#{'Laxmi'}")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	

}
