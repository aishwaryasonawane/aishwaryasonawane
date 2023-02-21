package com.hibernateassignment.HibernateAssignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	//is the session factory is closed?
    	// System.out.println(factory.isClosed());
    	
    	Student s=new Student();
    	s.setId(101);
    	s.setName("Aishwarya");
    	
    	Laptop l= new Laptop();
    	l.setL_id(1012);
    	l.setL_name("HP");
    	s.setLaptop(l);
    	l.setStudent(s);
    	
    	Session session=factory.openSession();
    	// begin the transaction
    	Transaction tx=session.beginTransaction();
    	
    	session.save(s);
    	session.save(l);
    	tx.commit();
    	session.close();
    	factory.close();
    	
    }	
}