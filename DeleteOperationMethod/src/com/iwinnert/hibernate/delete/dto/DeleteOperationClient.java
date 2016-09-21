package com.iwinnert.hibernate.delete.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteOperationClient {

	
	public static void main(String[] args) {
		
	
		Configuration conf=new Configuration();
		conf=conf.configure("/mycfg-mysql.xml");
		SessionFactory sessionFactory=conf.buildSessionFactory();
		Session session=sessionFactory.openSession();

		
		Transaction tx=session.beginTransaction();
		//tx.begin();

		
/*		EmployeeDTO emp=new EmployeeDTO();
		emp.setEmpEmail("BS@gmail.com");
		emp.setEmpName("BS");
		emp.setId(40);
		*/

         EmployeeDTO ems=(EmployeeDTO)session.load(EmployeeDTO.class, 40);
         ems.setEmpName("Hyderabad");
		//emp.setEmpEmail("ins@gmail.com");
		session.update(ems);
		tx.commit();
		
	}
	
	
	
}
