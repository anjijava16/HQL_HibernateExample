package com.iwinner.hibernate.annotations;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NonSelectHQLQuery {

	
	public static void main(String[] args) {
		
		
		// First Step 1:: BootStartp Class invoke framework
		Configuration conf=new Configuration();
		// Setting the config  file
		 conf=conf.configure("/mycfg-mysql.xml");
		 //conf.configure("/mycfg-mysql.xml");
		 
		 // High level Object
		 SessionFactory sessionFactory=conf.buildSessionFactory();
		 // SesssionFactoryImpl
		 
		 Session session=sessionFactory.openSession();
		
		 
		 // Here Please note we are creating Query Object means Hibernate Query Object
		 
		 // if we are go with single row or multi row must be require session Object
		 
		 Query query=session.createQuery("delete from EmployeeDTO where id=173");   // see if u have 100 Records in EmployeeDTO
		 
		 int status= query.executeUpdate();
		 
		 System.out.println("Delete Status is ::>>>>"+status);
		
	}
}
