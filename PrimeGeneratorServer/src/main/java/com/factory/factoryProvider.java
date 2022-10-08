package com.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class factoryProvider {

	public static SessionFactory factory;

	public static SessionFactory getfactory() {

		if (factory == null) {
			factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		}

		return factory;
	}

	public static void closeFactory() {

		if (factory.isOpen()) {
			factory.close();
		}

	}
	
}
