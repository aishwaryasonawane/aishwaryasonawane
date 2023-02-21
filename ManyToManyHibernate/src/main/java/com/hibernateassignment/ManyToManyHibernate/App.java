package com.hibernateassignment.ManyToManyHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

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
    	//is the session factory closed?
    	//System.out.println(factory.isClosed());
    	
    	Employee e1=new Employee();
    	e1.setId(101);
    	e1.setName("Aishwarya");
    	
    	Employee e2=new Employee();
    	e2.setId(102);
    	e2.setName("Vaishnavi");
    	
    	
    	
    	Project p1=new Project();
    	p1.setPid(1);
    	p1.setPname("Currency Convertor");
    	
    	Project p2=new Project();
    	p2.setPid(2);
    	p2.setPname("Banking Application");
    	
    	Project p3=new Project();
    	p3.setPid(3);
    	p3.setPname("Library Management System");
    	
    	
    	List<Project> proj1=new ArrayList<Project>();
    	List<Employee> emp1=new ArrayList<Employee>();
    	proj1.add(p1);
    	proj1.add(p2);
    	proj1.add(p3);
    	e1.setProject(proj1);
    	
    	emp1.add(e1);
    	emp1.add(e2);
    	p1.setEmployee(emp1);
    	
    	
    	
    	
        Session session=factory.openSession();
        //begin the transaction
        Transaction tx=session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        session.save(p3);
        
        tx.commit();
        session.close();
        factory.close();
    	
    }
}

