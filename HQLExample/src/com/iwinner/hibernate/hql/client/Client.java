package com.iwinner.hibernate.hql.client;
import com.iwinner.hibernate.hql.dao.StudentDAO;
import com.iwinner.hibernate.hql.dao.StudentDAOFactory;
public class Client {
	public static void main(String[] args) {
		StudentDAO dao=StudentDAOFactory.getInstance();
		//dao.updateStudents();
		dao.selectStudents();
	}
}
