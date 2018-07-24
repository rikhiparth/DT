package com.niit;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.ShoppingCart.dao.Cartdao;
import com.niit.ShoppingCart.daoimpl.Cartdaoimpl;
import com.niit.ShoppingCart.entity.Cart;

public class CartTest 
{
  
  @Ignore
  @Test
  
  public void Test1()
  {
	  System.out.println(" GET By UserId ");
	  Cartdao cartdao = new Cartdaoimpl();
	  Cart cart = cartdao.getCartbycartId(1);
	  cart.show(cart);  
  }
  
  @Ignore
  @Test
  
  public void TestUpdate()
  { 
	Cartdao cartdao = new Cartdaoimpl();
    Cart cart = cartdao.getCartbycartId(1);
    
    cart.setCartItemCount(0);
    cart.setGrandTotal(0);
    
    cartdao.updateCart(cart);
  }
}
