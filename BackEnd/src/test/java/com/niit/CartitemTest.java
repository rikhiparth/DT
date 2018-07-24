package com.niit;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.ShoppingCart.dao.Cartitemdao;
import com.niit.ShoppingCart.daoimpl.Cartitemdaoimpl;
import com.niit.ShoppingCart.entity.CartItem;

public class CartitemTest 
{ 
	@Ignore
	@Test
	public void TestAdd()
	  { Cartitemdao cartitemdao = new Cartitemdaoimpl();
		
	    CartItem ci = new CartItem();
		ci.setCartitemId(3);
		ci.setSellquantity(50);
		ci.setTotalprice(100);
		
		cartitemdao.addCartItem(ci);
	  }
	
	 @Ignore
	 @Test
	  public void TestDelete()
	  { 
		Cartitemdao cartitemdao = new Cartitemdaoimpl();
	    CartItem cartitem = cartitemdao.getCartItembyId(3);
	    cartitem.show(cartitem);
	    cartitemdao.deleteCartItem(3);
	  }
	 
	 @Ignore
	 @Test
	 public void TestUpdate()
	 {  
		Cartitemdao cartitemdao = new Cartitemdaoimpl();
	    CartItem cartitem = cartitemdao.getCartItembyId(3);

	    cartitem.setSellquantity(70);
	    cartitem.setTotalprice(300);
	    cartitem.show(cartitem);
	    
	    cartitemdao.updateCartItem(cartitem);
	 }
	 
	 @Ignore
	 @Test
	 public void Test1()
	 {
		 System.out.println(" GET By CartitemId ");
		 Cartitemdao cartitemdao = new Cartitemdaoimpl();
		 CartItem cartitem = cartitemdao.getCartItembyId(2);
		 cartitem.show(cartitem);
	 }
}
