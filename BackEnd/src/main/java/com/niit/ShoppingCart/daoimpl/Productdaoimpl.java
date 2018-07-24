package com.niit.ShoppingCart.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateImp;
import com.niit.ShoppingCart.dao.Productdao;
import com.niit.ShoppingCart.entity.Product;

public class Productdaoimpl implements Productdao{

	public Product getProductbyProductId(String productid) 
	{
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		Product product = (Product) session.get(Product.class, productid);
		session.close();
		return product;
	}

	public boolean addProduct(Product product) 
	{
		System.out.println(" In Add Product ");
		boolean flag=false;
			
			try 
			{
				System.out.println("  Product id  "+ product.getProductid());
				System.out.println("  Product Name "+ product.getProductname());
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				session.beginTransaction();
				session.save(product);
				session.getTransaction().commit();
				session.close();
				
				System.out.println(" Data stored in Product Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in Productdaoimpl " + e);
	            flag =false;
			}
				
			return flag;
	}

	public boolean updateProduct(Product product) 
	{
		 System.out.println(" In update Product ");
		 boolean flag=false;
			
			try 
			{
				System.out.println(" ************************************ ");
			    System.out.println(" Updation begin ");
			    System.out.println(" ************************************ ");
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				Transaction tx = session.beginTransaction();
				session.saveOrUpdate(product);
				tx.commit();
				session.close();
				
				System.out.println(" Data updated in Product Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in Productdaoimpl " + e);
	            flag =false;
			}
				
			return flag;
	}

	public boolean deleteProduct(String productid) 
	{
		boolean flag=false;
		
		try 
		{	
			Session session = HibernateImp.getHibernateSessionFactory().openSession();
			Product product = (Product) session.get(Product.class,productid);
			
			Transaction tx=session.beginTransaction();
			session.delete(product);
			tx.commit();
			
			System.out.println(" Data deleted in Product Table ");
			flag=true;
			
		}
		catch(Exception e)
		{
			System.out.println("Error" +e);
			flag=false;
		}
		return flag;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		List<Product> products= session.createCriteria(Product.class).list();
		System.out.println(products);
		session.close();
		return products;
	}

}
