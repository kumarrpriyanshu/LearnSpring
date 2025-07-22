package com.orm.crud;

import org.hibernate.cfg.Configuration ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		// 1. storing
//		Student s1= new Student();
//		s1.setId(3);
//		s1.setName("piyush");
//		s1.setTech(" fsd");
//		// hbernate  need a session to store them and session come from orm and sessionFactory is interface that provides session
//		Configuration config= new Configuration().addAnnotatedClass(com.orm.crud.Student.class).configure("LearnORM.xml");
//		SessionFactory sf= config.buildSessionFactory();
//		Session session= sf.openSession();
//		Transaction transaction= session.beginTransaction();// for fetching it is not required it is for storing 
//		session.persist(s1);                          // to save or store data
//		transaction.commit();
//		 System.out.println(s1);
//		session.close();
//		sf.close();
//		
		
		 //2. fetching
//		Configuration config= new Configuration().addAnnotatedClass(com.orm.crud.Student.class).configure("LearnORM.xml");
//		SessionFactory sf= config.buildSessionFactory();
//		Session session= sf.openSession();
//		Student s1= session.get(Student.class, 3)   ;      // to fetch data by eager fetching
//		 Student s1= session.byId(Student.class).load(3)   ;   // another way of fetching data by lazy fetching
//		 System.out.println(s1);
//		session.close();
//		sf.close();
		
		
		//3.updating
//		Student s1= new Student();
//		s1.setId(4);
//		s1.setName("abahy");
//		s1.setTech(" mern");
//		Configuration config= new Configuration().addAnnotatedClass(com.orm.crud.Student.class).configure("LearnORM.xml");
//		SessionFactory sf= config.buildSessionFactory();
//		Session session= sf.openSession();
//		Transaction transaction= session.beginTransaction();
//		session.merge(s1); // for updating if obj present it will update else if it will create new if obj not present
//		transaction.commit();
//		 System.out.println(s1);
//		session.close();
//		sf.close();
		
		//4.delete
		Configuration config= new Configuration().addAnnotatedClass(com.orm.crud.Student.class).configure("LearnORM.xml");
		SessionFactory sf= config.buildSessionFactory();
		Session session= sf.openSession();
		Transaction transaction= session.beginTransaction();
		Student s1= session.find(Student.class, 4);
		session.remove(s1);// for deleting data
		transaction.commit();
		 System.out.println(s1);
		session.close();
		sf.close();
		
		
	}

}
