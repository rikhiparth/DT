package com.niit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.ShoppingCart.dao.Userdao;
import com.niit.ShoppingCart.daoimpl.Userdaoimpl;
import com.niit.ShoppingCart.entity.User;

@Controller
public class LoginController 
{
	Userdao userdao;

	// Admin User login
	@RequestMapping(value="/LoginProcess", method = RequestMethod.POST)
	public String login(HttpServletRequest request)
	{
		userdao = new Userdaoimpl();
		
		String uid = request.getParameter("userid");
		String pwd = request.getParameter("psw");
		
		User u = userdao.getUserById(uid);
		
		String id = u.getUserId();
		String pwd1 = u.getPassword();
		
		System.out.println("Entered user id:"+uid);
		System.out.println("Entered password:"+pwd);
		System.out.println(id);
		System.out.println(pwd1);
		
		if(uid.equals(id) && pwd.equals(pwd1))
		{
			if(u.getRole().equals("admin"))
				return "/admin/adminindex";
			if(u.getRole().equals("user"))
				return "/user/userindex";
		}
		return "wronglogin";
	}
	
	// Login option
	@RequestMapping(value="login")
 	public String mylogin()
  {
      System.out.println("**********************************");
	  System.out.println("Controller mylogin has been started ");
	  System.out.println("**********************************");
	  
 	  return "login";
 }
}