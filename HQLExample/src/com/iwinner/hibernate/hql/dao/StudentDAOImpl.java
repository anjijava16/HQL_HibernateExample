package com.iwinner.hibernate.hql.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iwinner.hibernate.hql.model.Student;
import com.iwinner.hibernate.hql.utils.HibernateUtils;



public class StudentDAOImpl implements StudentDAO {

	@Override
	public void updateStudents() {

		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("update Student s set s.marks=800 where s.branchName='ece'");
		int i=query.executeUpdate();
		tx.commit();
		session.close();
		System.out.println("====================");
	}

	@Override
	public void selectStudents() {
		
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		Query query=session.createQuery("from Student s");
		List list=query.list();
		Iterator it=list.iterator();
		while(it.hasNext()){
			
			Student s=(Student)it.next();
		System.out.println("=========");
		System.out.println("Student Name:"+s.getStudentName());
		System.out.println("Marks:"+s.getMarks());
		System.out.println("------------------");
		
		}
		
		

	}

}
