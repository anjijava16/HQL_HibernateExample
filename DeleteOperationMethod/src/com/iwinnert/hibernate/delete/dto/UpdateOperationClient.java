package com.iwinnert.hibernate.delete.dto;

import org.hibernate.Session;

import com.iwinnert.hibernate.utils.SessionUtils;

public class UpdateOperationClient {

	public static void main(String[] args) {
		
		// Session Object is ready 
		Session session=SessionUtils.getSessionFactoryUtil().openSession();
		
		//Select Operation
		
		EmployeeDTO empDTO=(EmployeeDTO)session.load(EmployeeDTO.class, 40);
		
		session.beginTransaction().begin();
		
		empDTO.setEmpEmail("Test@gmail.com");
		session.save(empDTO);
		
		session.beginTransaction().commit();
		System.out.println(empDTO);
		System.out.println(empDTO.toString());//com.iwinnert.hibernate.delete.dto.EmployeeDTO@2716630b
		
	}
}
