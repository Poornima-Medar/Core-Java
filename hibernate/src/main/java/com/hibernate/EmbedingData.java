package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedingData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Person person = new Person();
		person.setId(3144444);
		person.setFirstName("Chetan");
		person.setLastName("M");
		person.setAge(25);
		person.setDate(new Date());

		Parent parent = new Parent();
		parent.setFatherName("xyz");
		parent.setMotherName("abc");

		person.setParents(parent);

		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		session.persist(person);

		t.commit();
		session.close();

	}

}
