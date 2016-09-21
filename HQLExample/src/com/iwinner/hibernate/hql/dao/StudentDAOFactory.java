package com.iwinner.hibernate.hql.dao;

public class StudentDAOFactory {

	public static StudentDAO getInstance(){
		
		return new StudentDAOImpl();

	}
}
