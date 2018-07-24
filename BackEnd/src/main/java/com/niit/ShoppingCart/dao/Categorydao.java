package com.niit.ShoppingCart.dao;

import java.util.List;

import com.niit.ShoppingCart.entity.Category;

public interface Categorydao 
{ 
  public List<Category> getAllCategory();
  public Category getCategoryById(String categoryId);
  public boolean addCategory(Category category);
  public boolean updateCategory(Category category);
  public boolean deleteCategory(String categoryId);

}
