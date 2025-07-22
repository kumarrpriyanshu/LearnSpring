package com.orm.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        // Create Hibernate configuration
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        
        
        // Build session factory
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Obtain session
        Session session = factory.openSession();
        
        // Begin transaction
        Transaction tx = session.beginTransaction();
        
        // Create Employee object
        Employee emp = new Employee();
        emp.setId(1);
  
        emp.setFirstName("Priyanshu");
        emp.setLastName("Jaiswal");
        
        // Save the object
       session.save(emp);
        
        session.persist(emp);
        
        // Commit transaction
        tx.commit();
        
        // Close session and factory
        session.close();
        factory.close();
        
        System.out.println("Employee record inserted successfully!");
    }
}
