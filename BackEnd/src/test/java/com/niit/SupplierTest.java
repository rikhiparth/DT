package com.niit;

import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.ShoppingCart.dao.Supplierdao;
import com.niit.ShoppingCart.daoimpl.Supplierdaoimpl;
import com.niit.ShoppingCart.entity.Supplier;

public class SupplierTest 
{ 
	@Ignore
	@Test
    public void TestAdd()
	{
		Supplierdao supplierdao = new Supplierdaoimpl();
		  
		Supplier sp = new Supplier();
		sp.setSupplierid("1");
		sp.setSuppliername("ram");
		sp.setSupplieraddr("Dwarka");
		sp.setSupplieremail("ram654@gmail.com");
		
		supplierdao.addSupplier(sp);
	}
	
	@Ignore
	@Test
	public void TestDelete()
	{
		Supplierdao supplierdao = new Supplierdaoimpl();
	    
		Supplier supplier=supplierdao.getSupplierbysupplierId("1001");
		supplier.show(supplier);
		supplierdao.deleteSupplier("1001");	
	}
	
	@Ignore
    @Test
	public void TestUpdate()
    { 
	  Supplierdao supplierdao = new Supplierdaoimpl();
			
	  Supplier supplier =supplierdao.getSupplierbysupplierId("1001");
	  
	  supplier.setSuppliername("Raj");
	  supplier.setSupplieraddr("UP");
	  supplier.setSupplieremail("raj1000@gmail.com");
			
	  supplierdao.updateSupplier(supplier);
	  }
	
	 @Ignore
	 @Test
	 public void Test1()
	 {
		  System.out.println(" GET By Id ");
		  Supplierdao supplierdao = new Supplierdaoimpl();
		  Supplier supplier=supplierdao.getSupplierbysupplierId("1001");
		  supplier.show(supplier);	 
	 }
	 
	@Ignore
	@Test
	
	public void Test2()
	{ 
	  Supplierdao supplierdao = new Supplierdaoimpl();
      List<Supplier> supplier=supplierdao.getAllSupplier();
	  Iterator<Supplier> item = supplier.iterator();
			
   	  while(item.hasNext())
	  {
   		Supplier sup = (Supplier) item.next();
		sup.show(sup);
  	  }	
	}
}
