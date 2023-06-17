package com.inheritance.hibernateinheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory sessionFactory = cfg.buildSessionFactory();
      
      Employee e1 = new Employee();
      e1.setEmployeeName("Poornima");
      
      Department d1 = new Department();
      d1.setDepartmentId(11);
      d1.setDepartmentName("It");
      d1.setEmployeeName("Poornima");
      
      
      Project p1 = new Project();
      p1.setProjectId(13);
      p1.setProjectName("Transit");
      p1.setEmployeeName("Naresh");
     
      
      Session session = sessionFactory.openSession();
      Transaction t = session.beginTransaction();
     
      session.persist(e1);
      session.persist(d1);
      session.persist(p1);
      
      t.commit();
      session.close();
      
      
    }
}
