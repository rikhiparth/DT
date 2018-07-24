package com.niit.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.ShoppingCart.dao.Cartdao;
import com.niit.ShoppingCart.dao.Cartitemdao;
import com.niit.ShoppingCart.dao.Productdao;
import com.niit.ShoppingCart.dao.Shipmentdao;
import com.niit.ShoppingCart.dao.Userdao;
import com.niit.ShoppingCart.daoimpl.Productdaoimpl;
import com.niit.ShoppingCart.daoimpl.Shipmentdaoimpl;
import com.niit.ShoppingCart.daoimpl.Cartdaoimpl;
import com.niit.ShoppingCart.daoimpl.Cartitemdaoimpl;
import com.niit.ShoppingCart.daoimpl.Userdaoimpl;
import com.niit.ShoppingCart.entity.Cart;
import com.niit.ShoppingCart.entity.CartItem;
import com.niit.ShoppingCart.entity.Product;
import com.niit.ShoppingCart.entity.Shipment;
import com.niit.ShoppingCart.entity.User;

@Controller
public class UserController 
{
	boolean status;
	
	// Get User List
	@RequestMapping("/admin/getAllusers")
    public String getAllusers(Model model)
    {
	    System.out.println("**********************************");
		System.out.println("Controller getAllusers has been started");
		System.out.println("**********************************");
		
		Userdao dao = new Userdaoimpl();
		List<User> userlist = dao.getUserAll();
		model.addAttribute("userlist", userlist);
		return "/admin/userList";
    }
	
	// Delete user by userid
	@RequestMapping("/deleteuser/{uid}")
	public String deleteuser(@PathVariable String uid, Model model)
	{
		Userdao dao = new Userdaoimpl();
		
		dao.delete(uid);
		
		List<User> userlist = dao.getUserAll();
		model.addAttribute("userlist", userlist);
		return "/admin/userList";		
	}
	
	// AddCart option
	@RequestMapping("/user/createcart")
	public String create()
	{
		return "/user/create";
	}
	
	// Add a cart
	@RequestMapping(value="/addcart", method=RequestMethod.POST)
	public String addCart(Principal principal)
	{
		Userdao userdao = new Userdaoimpl();
		User user = userdao.getUserById(principal.getName());
		
		Cart cart = new Cart();
		Cartdao dao = new Cartdaoimpl();
		cart.setCartId(1);
		cart.setCartItemCount(0);
		cart.setGrandTotal(0);
		cart.setUser(user);
		
		dao.addCart(cart);
		System.out.println("Cart added");
	    return "/user/userindex";
	}
	
	// Get list of cartitems
	@RequestMapping("/user/getcartItems")
	public String getCartItem(Principal principal,Model model)
	{
			Userdao userdao = new Userdaoimpl();
			User user = userdao.getUserById(principal.getName());
			Cart cart = user.getCart();
			List<CartItem> cartitems = cart.getCartList();
			model.addAttribute("cartitems", cartitems);
			return "/user/cart";
	}
	
	// Back to previous button
	@RequestMapping(value = "/goback", method=RequestMethod.POST)
	public String result(Model model) 
	{	
		Productdao dao = new Productdaoimpl();
		List<Product> productlist = dao.getAllProducts();
		model.addAttribute("productlist", productlist);
		return "/user/userproductList";
	}
	
	// Back to previous button
	@RequestMapping(value = "/goback1", method=RequestMethod.POST)
	public String result1(Model model) 
	{	
		Productdao dao = new Productdaoimpl();
		List<Product> productlist = dao.getAllProducts();
		model.addAttribute("productlist", productlist);
		return "/user/userproductList";
	}
	
	// Add product to cart 
	@RequestMapping(value = "/user/addProductToCartItem/{pid}")
	public String addCartItem(@PathVariable("pid") String pid,Principal principal) 
	{	
		Userdao userdao = new Userdaoimpl();
		User user = userdao.getUserById(principal.getName());
		Cart cart = user.getCart();

		List<CartItem> cartitems = cart.getCartList();
		
		Productdao productdao = new Productdaoimpl();
		Product product = productdao.getProductbyProductId(pid);
		for (int i = 0; i < cartitems.size(); i++) {
			CartItem cartitem = cartitems.get(i);
			if (product.getProductid().equals(cartitem.getProduct().getProductid()))
			{
				int oldquantity = cartitem.getSellquantity();
				cartitem.setSellquantity(cartitem.getSellquantity() + 1);
				cartitem.setTotalprice(product.getProductprice() * cartitem.getSellquantity());
				cart.setGrandTotal(cart.getGrandTotal() + (cartitem.getSellquantity() - oldquantity) * product.getProductprice());
				System.out.println("Already in cart");
				return "/user/alreadyincart";
			}
		}
		Cartitemdao dao = new Cartitemdaoimpl();
		Cartdao dao1 = new Cartdaoimpl();
		CartItem cartitem = new CartItem();
		
		cartitem.setSellquantity(1);
		cartitem.setProduct(product);
		cartitem.setTotalprice(product.getProductprice() * 1);
		
		cart.setGrandTotal(cart.getGrandTotal() + cartitem.getTotalprice());
		cart.setCartItemCount(cart.getCartItemCount() + 1);
		dao1.updateCart(cart);
		
		cartitem.setCart(cart);
		
		dao.addCartItem(cartitem);
		System.out.println("Added to Cart");
		return "/user/addedtocart";
	}
	
	// Delete a cartitem
	@RequestMapping("/deletecartitem/{id}")
	public String deleteproduct(@PathVariable int id, Model model,Principal principal)
	{
		Cartitemdao dao = new Cartitemdaoimpl();
		
		dao.deleteCartItem(id);
		
		Userdao userdao = new Userdaoimpl();
		User user = userdao.getUserById(principal.getName());
		Cart cart = user.getCart();

		List<CartItem> cartitems = cart.getCartList();
		model.addAttribute("cartitems", cartitems);
		return "/user/cart";
	}
	
	// Delete all cartitems
	@RequestMapping(value = "/deleteAllcartitems")
	public String deleteAll(Principal principal,Model model)
	{
		Cartdao cartdao = new Cartdaoimpl();
		Cartitemdao cartitemdao = new Cartitemdaoimpl();
		
		Userdao userdao = new Userdaoimpl();
		User user = userdao.getUserById(principal.getName());
		Cart cart = user.getCart();
		int id = cart.getCartId();
		
		Cart c = cartdao.getCartbycartId(id);
		cartitemdao.deleteAllCartItems(c);
		
		List<CartItem> cartitems = cart.getCartList();
		model.addAttribute("cartitems", cartitems);
		return "/user/cart";
	}
	
	// Increase product quantity by +1
	@RequestMapping(value = "user/plusOneProductQuantity/{pid}/{id}")
	public String plusOneProductQuantity(@PathVariable("id") int id,@PathVariable("pid") String pid ,Model model,Principal principal)
	{
		Userdao userdao = new Userdaoimpl();
		User user = userdao.getUserById(principal.getName());
		Cart cart = user.getCart();
		
		Cartitemdao cartitemdao = new Cartitemdaoimpl();
		Cartdao dao = new Cartdaoimpl();
		
		CartItem cartitem = cartitemdao.getCartItembyId(id);
		
		Productdao productdao = new Productdaoimpl();
		Product product = productdao.getProductbyProductId(pid);
		
		int oldquantity = cartitem.getSellquantity();
		cartitem.setSellquantity(cartitem.getSellquantity() + 1);
		cartitem.setTotalprice(product.getProductprice() * cartitem.getSellquantity());
		cartitemdao.updateCartItem(cartitem);
		cart.setGrandTotal(cart.getGrandTotal() + (cartitem.getSellquantity() - oldquantity) * product.getProductprice());
		
		dao.updateCart(cart);
		
		List<CartItem> cartitems = cart.getCartList();
		model.addAttribute("cartitems", cartitems);
		return "/user/cart";
	}
	
	// Decrease product quantity by -1
	@RequestMapping(value = "user/minusOneProductQuantity/{pid}/{id}")
	public String minusOneProductQuantity(@PathVariable("id") int id,@PathVariable("pid") String pid ,Model model,Principal principal)
	{
		Userdao userdao = new Userdaoimpl();
		User user = userdao.getUserById(principal.getName());
		Cart cart = user.getCart();
		
		Cartitemdao cartitemdao = new Cartitemdaoimpl();
		Cartdao dao = new Cartdaoimpl();
		
		CartItem cartitem = cartitemdao.getCartItembyId(id);
		
		Productdao productdao = new Productdaoimpl();
		Product product = productdao.getProductbyProductId(pid);
		
		int oldquantity = cartitem.getSellquantity();
		if(cart.getGrandTotal() > product.getProductprice())
		{ 
			cartitem.setSellquantity(cartitem.getSellquantity() - 1);
			cartitem.setTotalprice(product.getProductprice() * cartitem.getSellquantity());
			cartitemdao.updateCartItem(cartitem);
			cart.setGrandTotal(cart.getGrandTotal() + (cartitem.getSellquantity() - oldquantity) * product.getProductprice());
		
			dao.updateCart(cart);
		}
		List<CartItem> cartitems = cart.getCartList();
		model.addAttribute("cartitems", cartitems);
		return "/user/cart";
	}
	
	// Confirm details of user
	@RequestMapping(value = "/user/confirmdetails", method=RequestMethod.GET)
	public String confirmUser(Principal principal, Model model)
	{
		Userdao dao = new Userdaoimpl();
		
		User user = dao.getUserById(principal.getName());
		model.addAttribute("user",user);
		return "/user/confirmdetails";
	}
	
	// Add shipment option
	@RequestMapping(value="/user/addshipmentdetails")
	public String shipment()
	{
		return "/user/addshipmentdetails";
	}
	
	// Add a shipment of user
	@RequestMapping(value="/addshipment", method=RequestMethod.POST)
	public String addShipment(HttpServletRequest request, Principal principal, Model model)
	{
		String shid = request.getParameter("shippingAddressId");
		String addr = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zipcode = request.getParameter("zipcode");
		String country = request.getParameter("country");
		
		Shipmentdao dao = new Shipmentdaoimpl();
		Userdao dao1 = new Userdaoimpl();
		
		Shipment shipment = new Shipment();
		User u = dao1.getUserById(principal.getName());
		
		shipment.setAddressId(shid);
		shipment.setAddress(addr);
		shipment.setCity(city);
		shipment.setState(state);
		shipment.setZipcode(zipcode);
		shipment.setCountry(country);
		shipment.setUser(u);
		
		dao.add(shipment);
		
		Cart cart = u.getCart();
		List<CartItem> cartitems = cart.getCartList();
		model.addAttribute("cartitems", cartitems);
		return "/user/confirmation";
	}
	
	// User thankyou
	@RequestMapping(value = "/user/thank", method=RequestMethod.GET)
	public String confirmation(Principal principal, Model model)
	{
		Userdao dao = new Userdaoimpl();
		Shipmentdao dao1 = new Shipmentdaoimpl();
		User u = dao.getUserById(principal.getName());
		
		Shipment shipment = u.getShipment();
		String sid = shipment.getAddressId();
		
		dao1.delete(sid);
		return "/user/thank";
	}
}