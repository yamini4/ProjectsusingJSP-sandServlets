package com.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DbUtil {

	public static SessionFactory getConn() {
		//SSR is used to map the config file and execute it                                             execute
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();		
		//Metadata in the config file should be executed		
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();	
		//go to session factory and execute the meta data
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		/*
		 * //Session is the place where write our crud operations Session
		 * s=sf.openSession(); //Transaction -saving all the crud operations on the db
		 * Transaction t=s.beginTransaction();
		 */
		return sf;
	}
}