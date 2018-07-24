package com.niit.ShoppingCart.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateImp;
import com.niit.ShoppingCart.dao.Cartitemdao;
import com.niit.ShoppingCart.entity.Cart;
import com.niit.ShoppingCart.entity.CartItem;
import com.niit.ShoppingCart.entity.Product;

public class Cartitemdaoimpl implements Cartitemdao 
{ 
	public boolean addCartItem(CartItem cartItem) 
	{
		 System.out.println(" In Add CartItem ");
		 boolean flag=false;
			
			try 
			{	
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				session.beginTransaction();
				session.save(cartItem);
				session.getTransaction().commit();
				session.close();
				
				System.out.println(" Data stored in CartItem Table ");
				flag = true;
			} 
			catch (Exception e) 
			{		
				System.out.println(" Error " + e);
	            flag =false;
			}
			return flag;
	}

	public boolean updateCartItem(CartItem cartitem) 
	{
		 System.out.println(" In update Cartitem ");
		 boolean flag=false;
			
			try 
			{
				System.out.println(" ************************************ ");
			    System.out.println(" Updation begin ");
			    System.out.println(" ************************************ ");
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				Transaction tx = session.beginTransaction();
				session.saveOrUpdate(cartitem);
				tx.commit();
				session.close();
				
				System.out.println(" Data updated in Cartitem Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in CartitemDaoImpl " + e);
	            flag =false;
			}
				
			return flag;
	}

	public boolean deleteCartItem(int cartItemid) 
	{ 
		boolean flag=false;
	
		try 
		{	
		  Session session = HibernateImp.getHibernateSessionFactory().openSession();
		  CartItem cartitem = (CartItem) session.get(CartItem.class,cartItemid);
		  
		  Transaction tx=session.beginTransaction();
		  session.delete(cartitem);
		  tx.commit();
		
		  System.out.println(" Data deleted in Cartitem Table ");
		  flag=true;
	    }
	    catch(Exception e)
		{
		  System.out.println("Error in Cartitemdaoimpl" +e);
		  flag=false;
		}
	    return flag;
	}

	public CartItem getCartItembyId(int cartItemid) 
	{	Session session = HibernateImp.getHibernateSessionFactory().openSession();
		CartItem ci = (CartItem) session.get(CartItem.class, cartItemid);
		session.close();
		return ci;
	}

	public void deleteAllCartItems(Cart cart) 
	{
		List<CartItem> cartItems = cart.getCartList();
		for (CartItem cartItem : cartItems)
		{
			deleteCartItem(cartItem.getCartitemId());			
		}
	}
	
	public CartItem getCartItembyUserIdandProductId(Cart cart, Product product)
	{
		String selectCartId = "FROM CartItem where cart= and product=";
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		CartItem cartitem = (CartItem)session.createQuery(selectCartId);
		tx.commit();
		session.close();
		return cartitem;
		
	}
}
