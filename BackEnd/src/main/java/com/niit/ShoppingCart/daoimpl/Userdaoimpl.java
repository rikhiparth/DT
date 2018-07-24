package com.niit.ShoppingCart.daoimpl;

import com.hibernate.HibernateImp;
import com.niit.ShoppingCart.dao.Userdao;
import com.niit.ShoppingCart.entity.User;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Userdaoimpl implements Userdao {
	
	@SuppressWarnings("unchecked")
	public List<User> getUserAll() {
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		List<User> users=	 session.createCriteria(User.class).list();
		System.out.println(users);
		session.close();
		return users;
	}
	
	public User getUserByUsername(String emailId) 
	{
		System.out.println(" User email ********** " + emailId);
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from User where emailId ='" + emailId + "'";

		System.out.println(" From getuser by email 111");
		User user = (User) session.createQuery(hql).uniqueResult();
		user.show(user);
		System.out.println(" From getuser by email 222");
		
		tx.commit();
		session.flush();
		session.close();
		
		return user;
	}

	public boolean add(User user) 
	{	
		System.out.println(" In Add User ");
		boolean flag=false;
		
		try 
		{
			System.out.println(" User id: "+ user.getUserId());
			System.out.println(" User Name: "+ user.getContact());
			
			Session session = HibernateImp.getHibernateSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			
			System.out.println(" Data stored in User Table ");
			flag = true;

		} 
		catch (Exception e) 
		{		
			System.out.println(" Error in Userdaoimpl  " + e);
            flag =false;
		}
			
		return flag;
	}

	public boolean delete(String userid) 
	{
		boolean flag=false;
		
		try 
		{	
			Session session = HibernateImp.getHibernateSessionFactory().openSession();
			User user = (User) session.get(User.class,userid);
			
			Transaction tx=session.beginTransaction();
			session.delete(user);
			tx.commit();
			
			System.out.println(" Data deleted in User Table ");
			flag=true;
			
		}
		catch(Exception e)
		{
			System.out.println("Error" +e);
			flag=false;
		}
		return flag;
	}

	public User getUserById(String userid) {
		
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		User user = (User) session.get(User.class, userid);
		session.close();
		
		user.show(user);
		return user;
	}

	public boolean update(User user) 
	{ 
		    System.out.println(" In update user");
		    boolean flag=false;
		
		    try
			{ 
		    	System.out.println(" ************************************ ");
			    System.out.println(" Updation begin ");
			    System.out.println(" ************************************ ");
			
			    Session session = HibernateImp.getHibernateSessionFactory().openSession();
			    Transaction tx = session.beginTransaction();
			    session.saveOrUpdate(user);
		  	    tx.commit();
			    session.close();
			
			    System.out.println(" Data updated in User Table ");	
				flag=true;
	        }
		    catch (Exception e) 
		    {		
	        	System.out.println(" Error in Userdaoimpl " + e);
                flag =false;
	        }
		     
		    return flag;
	}	
}
