package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateImp 
{
	@SuppressWarnings("deprecation")
	public static SessionFactory getHibernateSessionFactory()
	{
		SessionFactory sessionFactory =null;
		try
		{
		System.out.println(" From Cfg File 11");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    System.out.println(" From Cfg File 22");
	  
	    sessionFactory = cfg.buildSessionFactory();
	    
		System.out.println(" hibernate.cfg.xml  File Found and configured " );
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e)
		{
			System.out.println(" Error in Configuration " + e);
		}
		  return  sessionFactory;
	}
}
