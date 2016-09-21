package com.iwinnert.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtils {

	public static SessionFactory getSessionFactoryUtil() {

		Configuration conf = new Configuration();
		conf = conf.configure("/mycfg-mysql.xml");
		SessionFactory sessionFactory = conf.buildSessionFactory();

		return sessionFactory;
	}
}
