package com.niit.ShoppingCart.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="cart")
public class Cart implements Serializable
{
	private final static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int cartId;
	private int cartItemCount;

	private int grandTotal;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "userid")
	private User user;
	
	@JsonBackReference
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "cart")
	private List<CartItem> cartList = new ArrayList<CartItem>(0);

	public int getCartItemCount() {
		return cartItemCount;
	}

	public void setCartItemCount(int cartItemCount) {
		this.cartItemCount = cartItemCount;
	}
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItem> getCartList() {
		return cartList;
	}

	public void setCartList(List<CartItem> cartList) {
		this.cartList = cartList;
	}

	public void show(Cart cart)
	{
		System.out.println(cart.getCartId());
		System.out.println(cart.getCartItemCount());
		System.out.println(cart.getGrandTotal());
		System.out.println(cart.getCartList());
		System.out.println(cart.getUser());
	}
}

