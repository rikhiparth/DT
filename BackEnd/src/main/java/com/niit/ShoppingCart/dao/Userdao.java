package com.niit.ShoppingCart.dao;

import java.util.List;

import com.niit.ShoppingCart.entity.User;

public interface Userdao 
{
	public User getUserByUsername(String email);
	public boolean add(User user);
	public boolean delete(String userid);
	public User getUserById(String string);
	public List<User> getUserAll();
	public boolean update(User user);
	
}
