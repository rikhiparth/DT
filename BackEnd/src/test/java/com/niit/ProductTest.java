package com.niit;

import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.ShoppingCart.dao.Productdao;
import com.niit.ShoppingCart.daoimpl.Productdaoimpl;
import com.niit.ShoppingCart.entity.Product;

public class ProductTest 
{ 
  @Ignore
  @Test
  public void TestAdd()
  {
	  Productdao productdao = new Productdaoimpl();
	  
	  Product p = new Product();
	  p.setProductid("102");
	  p.setProductname("def");
	  p.setProductprice(300);
	  p.setProductqty(2);
	  p.setProductdetails("xyz");
	  
	  productdao.addProduct(p);
  }

  @Ignore
  @Test
  public void TestDelete()
  {  Productdao productdao = new Productdaoimpl();
    
     Product p = productdao.getProductbyProductId("P101");
     p.show(p);
     productdao.deleteProduct("P101");
  }
  
  @Ignore
  @Test
  public void TestUpdate()
  { 
    Productdao productdao = new Productdaoimpl();
    Product product=productdao.getProductbyProductId("P1001");
    
    product.setProductname("ghi");
    product.setProductprice(1000);
    product.setProductdetails("aa");
    
    productdao.updateProduct(product);
  }
  
  @Ignore
  @Test
  public void Test1()
  {
	  System.out.println(" GET By ProductId ");
	  Productdao productdao = new Productdaoimpl();
	  Product product=productdao.getProductbyProductId("101");
	  product.show(product);  
  }
  
  @Ignore
  @Test
  public void Test2()
  {
	  Productdao productdao = new Productdaoimpl();
	  List<Product> product=productdao.getAllProducts();
	  Iterator<Product> item = product.iterator();
		
		while(item.hasNext())
		{
			Product p = (Product) item.next();
			p.show(p);
		}
  }
}