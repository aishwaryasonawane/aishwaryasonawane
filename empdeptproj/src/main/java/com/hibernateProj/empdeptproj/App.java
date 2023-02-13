// One to One relation
package com.hibernateProj.empdeptproj;
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
       // System.out.println( "Hello World!" );
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	//is the session factory is closed?
    	// System.out.println(factory.isClosed());
    	
    	
    	//create the Student
    	Student s1=new Student();
    	s1.setId(101);
    	s1.setName("Amit");
    	
    	//creating the course 
    	Course c1=new Course();
    	c1.setCid(201);
    	c1.setCname("c programming");
    	s1.setCourse(c1); //setting the course for the student object
    	
    	Session session=factory.openSession();
    	// begin the transaction
    	Transaction tx=session.beginTransaction();
    	session.save(s1);
    	session.save(c1);
    	tx.commit();
    	session.close();
    	factory.close();
    }
}
