package com.niit.ShoppingCart.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {

	@Id
	private String categoryId;
	
	private String categoryName;
	
	@ManyToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="categoryid")
	private List<Product> productList = new ArrayList<Product>(0);
	
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
    public void show(Category category) 
	{
		System.out.println(" CATEGORIES SHOW ");
		
		System.out.println(category.getCategoryId());
		System.out.println(category.getCategoryName());
	}
}
