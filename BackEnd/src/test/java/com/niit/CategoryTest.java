package com.niit;

import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.ShoppingCart.dao.Categorydao;
import com.niit.ShoppingCart.daoimpl.Categorydaoimpl;
import com.niit.ShoppingCart.entity.Category;

public class CategoryTest 
{ 
	@Ignore
	@Test
	public void TestAdd()
	{
		Categorydao categorydao = new Categorydaoimpl();
	
		Category category = new Category();	
		category.setCategoryId("102");
		category.setCategoryName("def");
		
		categorydao.addCategory(category);
	}
	
	 @Ignore
	 @Test
	  public void TestDelete()
	  { Categorydao categorydao = new Categorydaoimpl();
	    
	    Category category=categorydao.getCategoryById("3");
	    category.show(category);
	    categorydao.deleteCategory("3");
	  }
	 
	  @Ignore
	  @Test
	  public void TestUpdate()
	  { 
		  Categorydao categorydao = new Categorydaoimpl();
			
			Category category =categorydao.getCategoryById("102");
			category.setCategoryName("xyz");
			
			categorydao.updateCategory(category);
	  }
	  
	 @Ignore
	 @Test
	 public void Test1()
	 {
		  System.out.println(" GET By Id ");
		  Categorydao categorydao = new Categorydaoimpl();
		  Category category=categorydao.getCategoryById("102");
		  category.show(category);	 
	 }
	 
	 @Ignore
	 @Test
	 public void Test2()
	 {
		  Categorydao categorydao = new Categorydaoimpl();
		  List<Category> category=categorydao.getAllCategory();
		  Iterator<Category> item = category.iterator();
			
			while(item.hasNext())
			{
				Category catg = (Category) item.next();
				catg.show(catg);
			}	 
	 }
}
