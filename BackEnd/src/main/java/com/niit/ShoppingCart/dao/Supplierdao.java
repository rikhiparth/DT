package com.niit.ShoppingCart.dao;

import java.util.List;

import com.niit.ShoppingCart.entity.Supplier;

public interface Supplierdao 
{
	public boolean addSupplier(Supplier supplier);
	public boolean deleteSupplier(String supplierid);
	public boolean updateSupplier(Supplier supplier);
	public Supplier getSupplierbysupplierId(String supplierid);
    public List<Supplier> getAllSupplier();     
}
