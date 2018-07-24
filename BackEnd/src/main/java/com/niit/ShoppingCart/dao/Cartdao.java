package com.niit.ShoppingCart.dao;

import com.niit.ShoppingCart.entity.Cart;

public interface Cartdao 
{
	public Cart getCartbycartId(int cartid);
	public boolean addCart(Cart cart);
	public boolean updateCart(Cart cart);
}
