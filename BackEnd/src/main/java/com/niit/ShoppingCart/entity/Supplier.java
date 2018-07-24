package com.niit.ShoppingCart.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Supplier")
public class Supplier implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String supplierid;
	
	@NotBlank(message = "Supplier name can't be empty!")
	private String suppliername;
	
	@NotBlank(message = "Supplier address can't be empty!")
	private String supplieraddr;
	
	@NotBlank(message = "Supplier email can't be empty!")
	private String supplieremail;
	
	@ManyToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="supplierid")
	private List<Product> productList = new ArrayList<Product>(0);

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getSupplieraddr() {
		return supplieraddr;
	}

	public void setSupplieraddr(String supplieraddr) {
		this.supplieraddr = supplieraddr;
	}

	public String getSupplieremail() {
		return supplieremail;
	}

	public void setSupplieremail(String supplieremail) {
		this.supplieremail = supplieremail;
	}
	
	public void show(Supplier supplier) 
	{
		System.out.println(" SUPPLIER MODEL SHOW ");
		
		System.out.println(supplier.getSupplierid());
		System.out.println(supplier.getSuppliername());
		System.out.println(supplier.getSupplieraddr());
		System.out.println(supplier.getSupplieremail());
	}
}
