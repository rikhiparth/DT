package com.niit.ShoppingCart.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateImp;
import com.niit.ShoppingCart.dao.Cartdao;
import com.niit.ShoppingCart.entity.Cart;

public class Cartdaoimpl implements Cartdao
{	
	public Cart getCartbycartId(int cartid) 
	{
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		Cart cart = (Cart) session.get(Cart.class, cartid);
		System.out.println(cart);
		session.close();
		return cart;
	}

	public boolean updateCart(Cart cart) 
	{
	 	 System.out.println(" In update Cart ");
		 boolean flag=false;
			
			try 
			{
				System.out.println(" ************************************ ");
			    System.out.println(" Updation begin ");
			    System.out.println(" ************************************ ");
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				Transaction tx = session.beginTransaction();
				session.saveOrUpdate(cart);
				tx.commit();
				session.close();
				
				System.out.println(" Data updated in Cart Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in Cartdaoimpl " + e);
	            flag =false;
			}
			
			return flag;
	}

	public boolean addCart(Cart cart) 
	{
		System.out.println(" In Add Cart ");
		boolean flag=false;
			
			try 
			{
				System.out.println(" Cart id:  "+ cart.getCartId());
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				session.beginTransaction();
				session.save(cart);
				session.getTransaction().commit();
				session.close();
				
				System.out.println(" Data stored in Cart Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in Cartdaoimpl  " + e);
	            flag =false;
			}
			return flag;
	}
}
