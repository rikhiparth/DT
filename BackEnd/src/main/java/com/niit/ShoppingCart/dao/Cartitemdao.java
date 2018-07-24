package com.niit.ShoppingCart.dao;

import com.niit.ShoppingCart.entity.Cart;
import com.niit.ShoppingCart.entity.CartItem;
import com.niit.ShoppingCart.entity.Product;

public interface Cartitemdao 
{
	public boolean addCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cartItem);
	public boolean deleteCartItem(int cartItemid);
	public void deleteAllCartItems(Cart cart);
	public CartItem getCartItembyId(int cartItemid);
	public CartItem getCartItembyUserIdandProductId(Cart cart, Product product);
}
