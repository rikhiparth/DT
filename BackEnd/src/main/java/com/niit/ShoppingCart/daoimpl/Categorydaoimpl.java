package com.niit.ShoppingCart.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateImp;
import com.niit.ShoppingCart.dao.Categorydao;
import com.niit.ShoppingCart.entity.Category;

public class Categorydaoimpl implements Categorydao
{

	@SuppressWarnings("unchecked")
	public List<Category> getAllCategory() {
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		List<Category> categ=	 session.createCriteria(Category.class).list();
		System.out.println(categ);
		session.close();
		return categ;
	}

	public Category getCategoryById(String categoryId) 
	{
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		Category category = (Category) session.get(Category.class, categoryId);
		session.close();
		return category;
	}

	public boolean addCategory(Category category) 
	{
		System.out.println(" In Add Category ");
	    boolean flag=false;
			
			try 
			{
				System.out.println("  Category id  "+ category.getCategoryId());
				System.out.println("  Category Name "+ category.getCategoryName());
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				session.beginTransaction();
				session.save(category);
				session.getTransaction().commit();
				session.close();
				
				System.out.println(" Data stored in Category Table ");
				flag = true;
			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in Categorydaoimpl  " + e);
	            flag =false;
			}
				
			return flag;
	}

	public boolean updateCategory(Category category) 
	{
		System.out.println(" In update Category ");
		boolean flag=false;
			
			try 
			{
				System.out.println(" ************************************ ");
			    System.out.println(" Updation begin ");
			    System.out.println(" ************************************ ");
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				Transaction tx = session.beginTransaction();
				session.saveOrUpdate(category);
				tx.commit();
				session.close();
				
				System.out.println(" Data updated in Category Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in Categorydaoimpl " + e);
	            flag =false;
			}
				
			return flag;
	}

	public boolean deleteCategory(String categoryId) 
	{ 
		boolean flag=false;
		
		try 
		{	
			Session session = HibernateImp.getHibernateSessionFactory().openSession();
			Category category = (Category) session.get(Category.class,categoryId);
			
			Transaction tx = session.beginTransaction();
			session.delete(category);
			tx.commit();
			flag=true;
			
		}
		catch(Exception e)
		{
			System.out.println("Error" +e);
			flag=false;
		}
		return flag;
		
	} 

}
