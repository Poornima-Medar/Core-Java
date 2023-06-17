package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Connecting to the database");

		// SessionFactory sessionFactory = new
		// Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println(sessionFactory);

		// Person Object
		Person person = new Person();
		person.setId(99873389);
		person.setFirstName("Prasad");
		person.setLastName("Hubli");
		person.setAge(23);
		person.setDate(new Date());

		// Address Object
		Address address = new Address();
		address.setCountry("India");
		address.setCity("Dharwad");
		address.setStreet("abc");

		FileInputStream fis = new FileInputStream("src/main/java/background.jpeg");
		byte[] image = new byte[fis.available()];
		fis.read(image);

		address.setImage(image);

		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.persist(person);
		session.persist(address);
		t.commit();
		session.close();

	}
}
