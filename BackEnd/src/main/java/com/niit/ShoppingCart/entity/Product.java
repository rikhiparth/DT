package com.niit.ShoppingCart.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Product")
public class Product implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String productid;
	
	@NotBlank(message = "Product name can't be empty!")
	private String productname;
	
	@NotBlank(message = "Product details can't be empty!")
	private String productdetails;
	
	@NotNull(message = "Product price can't be empty!")
	private int productprice;
	
	@NotNull(message = "Product quantity can't be empty!")
	private int productqty;

	@Transient
	private MultipartFile productImage;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Category categoryid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Supplier supplierid;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "product")
	private CartItem cartitem;
	
	public CartItem getCartitem() {
		return cartitem;
	}

	public void setCartitem(CartItem cartitem) {
		this.cartitem = cartitem;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProductqty() {
		return productqty;
	}

	public void setProductqty(int productqty) {
		this.productqty = productqty;
	}
	
	public Category getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Category categoryid) {
		this.categoryid = categoryid;
	}

	public Supplier getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Supplier supplierid) {
		this.supplierid = supplierid;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
	
	public void show(Product product)
	{
		System.out.println(" PRODUCT MODEL SHOW ");
		
		System.out.println(product.getProductImage());
		System.out.println(product.getCategoryid());
		System.out.println(product.getSupplierid());
		System.out.println(product.getProductid());
		System.out.println(product.getProductname());
		System.out.println(product.getProductprice());
		System.out.println(product.getProductqty());
		System.out.println(product.getProductdetails());
	}
}

