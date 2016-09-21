package com.iwinner.hibernate.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveClient {
	public static void main(String[] args) throws Exception
	{
		
		
		// First Step 1:: BootStartp Class invoke framework
		Configuration conf=new Configuration();
		// Setting the config  file
		 conf=conf.configure("/mycfg-mysql.xml");
		 //conf.configure("/mycfg-mysql.xml");
		 
		 // High level Object
		 SessionFactory sessionFactory=conf.buildSessionFactory();
		 // SesssionFactoryImpl
		 
		 Session session=sessionFactory.openSession();
		 session.getTransaction().begin();;
		 //Create new Employee object
	      EmployeeEntity emp = new EmployeeEntity();
	      emp.setEmployeeId(2200);
	      emp.setFirstName("Lokesh");
	      emp.setLastName("Gupta");
	       
	      session.flush();
	      //Save employee
	      session.save(emp);
	       
	      session.getTransaction().commit();
	}
}
