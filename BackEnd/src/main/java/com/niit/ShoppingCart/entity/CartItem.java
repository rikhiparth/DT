package com.niit.ShoppingCart.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Cartitem")
public class CartItem implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartitemId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="productid")
	private Product product;
	
	//@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Cart cart;
	
	private int sellquantity;
	private int totalprice;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public int getCartitemId() {
		return cartitemId;
	}

	public void setCartitemId(int cartitemId) {
		this.cartitemId = cartitemId;
	}

	public int getSellquantity() {
		return sellquantity;
	}

	public void setSellquantity(int sellquantity) {
		this.sellquantity = sellquantity;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
	public void show(CartItem cartitem)
	{
		System.out.println(" CARTITEM MODEL SHOW ");
		
		System.out.println(cartitem.getCart());
		System.out.println(cartitem.getProduct());
		System.out.println(cartitem.getCartitemId());
		System.out.println(cartitem.getSellquantity());
		System.out.println(cartitem.getTotalprice());
	}
}


