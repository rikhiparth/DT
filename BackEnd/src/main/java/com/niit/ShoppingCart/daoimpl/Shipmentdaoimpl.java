package com.niit.ShoppingCart.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateImp;
import com.niit.ShoppingCart.dao.Shipmentdao;
import com.niit.ShoppingCart.entity.Shipment;

public class Shipmentdaoimpl implements Shipmentdao
{
	public boolean add(Shipment shipment) 
	{	
		System.out.println(" In Add Shipment ");
		boolean flag=false;
		
		try 
		{
			System.out.println(" Shipment id: "+ shipment.getAddressId());
			
			Session session = HibernateImp.getHibernateSessionFactory().openSession();
			session.beginTransaction();
			session.save(shipment);
			session.getTransaction().commit();
			session.close();
			
			System.out.println(" Data stored in Shipment Table ");
			flag = true;

		} 
		catch (Exception e) 
		{		
			System.out.println(" Error in Shipmentdaoimpl  " + e);
            flag =false;
		}
		
		return flag;
	}
	
	public boolean delete(String sid) 
	{
		boolean flag=false;
		
		try 
		{	
			Session session = HibernateImp.getHibernateSessionFactory().openSession();
			Shipment shipment = (Shipment) session.get(Shipment.class,sid);
			
			Transaction tx=session.beginTransaction();
			session.delete(shipment);
			tx.commit();
			
			System.out.println(" Data deleted in Shipment Table ");
			flag=true;
			
		}
		catch(Exception e)
		{
			System.out.println("Error" +e);
			flag=false;
		}
		
		return flag;
	}
	
	public Shipment getShipmentById(String shid)
	{	
		Session session = HibernateImp.getHibernateSessionFactory().openSession();
		Shipment shipment = (Shipment) session.get(Shipment.class, shid);
		session.close();
		
		return shipment;
	}
}
