package com.iwinner.hibernate.annotations;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLSelection {

	
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
		 
		 Query query=session.createQuery("From EmployeeDTO");   // see if u have 100 Records in EmployeeDTO 
		 
		 List list=query.list();
		 
		 System.out.println("Size of List is :::>>>"+list.size());
		 
		 List<EmployeeDTO> listEmp=(List<EmployeeDTO>)query.list();
		 
		 
		 for(EmployeeDTO empDTO:listEmp){
			 
			 
			 
			 System.out.println(empDTO.getId()+"  "+empDTO.getEmpName());
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		 
		 
	}
}
