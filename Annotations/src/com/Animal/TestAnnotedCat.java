package com.Animal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotedCat {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Cat cat = new Cat("stella");

		for (Method method : cat.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(RunImmediatly.class)) {
				RunImmediatly annotation = method.getAnnotation(RunImmediatly.class);
				for (int i = 0; i < annotation.times(); i++) {
					method.invoke(cat);
				}
			}
		}

		for (Field field : cat.getClass().getDeclaredFields()) {
			Object stringObject = field.get(cat);
			if (stringObject instanceof String stringValue) {
				System.out.println(stringValue.toUpperCase());
			}
		}
	}

}
