package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Address ad = (Address)session.get(Address.class, 1);
		System.out.println(ad);
		
		Person p = (Person)session.get(Person.class, 99873389);
		System.out.println(p);
		
		Address ad1 = (Address)session.load(Address.class, 2);
		System.out.println(ad1.getCity());
		
		
		Address ad2 = (Address) session.load(Address.class, 3);
		System.out.println(ad2);
		session.close();

	}

}
