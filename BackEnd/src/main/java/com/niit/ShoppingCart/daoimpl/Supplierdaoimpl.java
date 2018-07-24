package com.niit.ShoppingCart.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateImp;
import com.niit.ShoppingCart.dao.Supplierdao;
import com.niit.ShoppingCart.entity.Supplier;

public class Supplierdaoimpl implements Supplierdao
{

	public boolean addSupplier(Supplier supplier)
	{
		System.out.println(" In Add Supplier ");
		boolean flag=false;
			
			try 
			{
				System.out.println(" Supplier id  "+ supplier.getSupplierid());
				System.out.println(" Supplier Name "+ supplier.getSuppliername());
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				session.beginTransaction();
				session.save(supplier);
				session.getTransaction().commit();
				session.close();
				
				System.out.println(" Data stored in Supplier Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in SupplierDaoImpl  " + e);
	            flag =false;
			}
				
			return flag;
	}

	public boolean deleteSupplier(String suppid) 
	{
		boolean flag=false;
		
		try 
		{	
			Session session = HibernateImp.getHibernateSessionFactory().openSession();
			Supplier supplier = (Supplier) session.get(Supplier.class,suppid);
			
			Transaction tx=session.beginTransaction();
			session.delete(supplier);
			tx.commit();
			
			System.out.println(" Data deleted in Supplier Table ");
			flag=true;
			
		}
		catch(Exception e)
		{
			System.out.println("Error" +e);
			flag=false;
		}
		return flag;
	}

	public boolean updateSupplier(Supplier supplier) 
	{
		 System.out.println(" In update supplier ");
		 boolean flag=false;
			
			try 
			{
				System.out.println(" ************************************ ");
			    System.out.println(" Updation begin ");
			    System.out.println(" ************************************ ");
				
				Session session = HibernateImp.getHibernateSessionFactory().openSession();
				Transaction tx = session.beginTransaction();
				session.saveOrUpdate(supplier);
				tx.commit();
				session.close();
				
				System.out.println(" Data updated in Supplier Table ");
				flag = true;

			} 
			catch (Exception e) 
			{		
				System.out.println(" Error in Supplierdaoimpl " + e);
	            flag =false;
			}
				
			return flag;
	}

	public Supplier getSupplierbysupplierId(String supplierid) 
	{
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		Supplier supplier = (Supplier) session.get(Supplier.class, supplierid);
		session.close();
		return supplier;
	}

	@SuppressWarnings("unchecked")
	public List<Supplier> getAllSupplier() 
	{ 
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		List<Supplier> supplier = session.createCriteria(Supplier.class).list();
		System.out.println(supplier);
		session.close();
		return supplier;
	}
}
