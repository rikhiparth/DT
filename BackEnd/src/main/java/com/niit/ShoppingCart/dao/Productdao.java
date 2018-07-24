package com.niit.ShoppingCart.dao;

import java.util.List;

import com.niit.ShoppingCart.entity.Product;

public interface Productdao 
{
	public Product getProductbyProductId(String productid);
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(String productid);
	public List<Product> getAllProducts();
}
