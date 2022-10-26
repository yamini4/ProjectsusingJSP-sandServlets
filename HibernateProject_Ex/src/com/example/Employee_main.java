package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/*1.StandardServiceRegistry
2.Metadata
3.SessionFactory
4.Session
5.Transaction
6.Close the connection 
 * */


public class Employee_main {

	public static void main(String[] args) {
		//SSR is used to map the configuration file and execute it                                  execute
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    //Metadata in the configuration file should be executed
		Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
		//go to session factory and execute the meta data
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		//Session is the place where write our crud operations
		Session s=sf.openSession();
		//Transaction - saving all the crud operations on the db
		Transaction t = s.beginTransaction();
		
		Employee e = new Employee();
		e.setEmpNo(1);
		e.setEmpName("vamsi");
		e.setEmpEmail("vas@c.mvv");
		
		//insert
		//s.save(e);
		//s.persist(e);
		//update
		//s.saveOrUpdate(e);


         Employee e1=s.load(Employee.class,1);
         System.out.println(e1);

		
		t.commit();
		s.close();
		sf.close();
	}

}
