package com.niit.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.ShoppingCart.dao.Userdao;
import com.niit.ShoppingCart.daoimpl.Userdaoimpl;
import com.niit.ShoppingCart.entity.User; 

@Controller 
public class RegisterController 
{	
	// Add a user by registration
	@RequestMapping(value="/RegisterProcess", method=RequestMethod.POST)  
	public String RegisterProcess(HttpServletRequest request)
	{  
		  
		  System.out.println("**********************************");
		  System.out.println("Controller RegisterProcess has been started");
		  System.out.println("**********************************");
		 		  
		  String userid = request.getParameter("userId");
		  String email = request.getParameter("emailId");
		  String contact = request.getParameter("contact");
		  String password = request.getParameter("password");
		  String address = request.getParameter("address");
		  String role = request.getParameter("role");
		  String phoneno = request.getParameter("phoneno");
		  
		  System.out.println("The entered User Id is" +userid);
		  try
		  {
			System.out.println("OKK0000000000000");
			Userdao userdao = new Userdaoimpl();

			System.out.println("OKK11111111111");
			User u = new User();
			u.setUserId(userid);
			u.setPassword(password);
			u.setEmailId(email);
			u.setAddress(address);
			u.setPhoneno(phoneno);
			u.setEnabled(true);
			u.setRole(role);
			u.setContact(contact);
			
			System.out.println("OKKKKKKKKKKKKKKKKK");
			userdao.add(u);
		  }
		  catch(Exception e)
		  {
			  System.out.println("Error"+e);
		  }
	      return "RegResult";    
	  }  
	
	  // Login option
	  @RequestMapping(value="login", method=RequestMethod.GET)  
	  public String mylogin1() {  
		  
		  System.out.println("**********************************");
		  System.out.println("Controller mylogin has been started");
		  System.out.println("**********************************");
		  
	      return "login";  
	  }
}