package com.iwinner.hibernate.hql.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {

		if (factory == null) {

			factory = new Configuration().configure(
					"com/iwinner/hibernate/hql/config/hibernate.cfg.xml")
					.buildSessionFactory();

		}

		return factory;

	}

}
