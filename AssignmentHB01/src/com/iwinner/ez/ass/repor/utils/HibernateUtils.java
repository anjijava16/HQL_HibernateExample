package com.iwinner.ez.ass.repor.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * It is HibernateUtils it is providing SessionFactory connection information
 * 
 * @author anjaiahspr
 * @version 1.0
 * @since 22nd July,2016
 * 
 *
 *
 */
public class HibernateUtils {

	/**
	 * It is provide the sessionFactory connection infromation based on the
	 * database it is getting configuration xml from mycfg-mysql.xml file
	 * 
	 * @author anjaiahsp
	 * @since 22nd July,2016
	 * @return {@link SessionFactory}
	 */
	public static SessionFactory getSessionFactory() {

		// First Step 1:: BootStartp Class invoke framework
		Configuration conf = new Configuration();
		// Setting the config file
		conf = conf.configure("/mycfg-mysql.xml");
		// conf.configure("/mycfg-mysql.xml");

		// High level Object
		SessionFactory sessionFactory = conf.buildSessionFactory();
		// SesssionFactoryImpl

		return sessionFactory;
	}

}
