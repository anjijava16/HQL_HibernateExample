package com.iwinnert.hibernate.delete.dto;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iwinnert.hibernate.utils.SessionUtils;

public class MergeVSUpdate {

	
	public static void main(String[] args) {
		
		Session session1=SessionUtils.getSessionFactoryUtil().openSession();
		
		EmployeeDTO emp=(EmployeeDTO)session1.get(EmployeeDTO.class, 10);
		
		System.out.println("Emp Object is created ");
		session1.close();
		emp.setEmpName("Sabya");
		
		
		Session session2=SessionUtils.getSessionFactoryUtil().openSession();

		EmployeeDTO ems=(EmployeeDTO)session2.get(EmployeeDTO.class, 10);
		
		Transaction tx=session2.beginTransaction();
		tx.begin();
		
		session2.merge(emp);
		
		tx.commit();
		
		
	}
}
