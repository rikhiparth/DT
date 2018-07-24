package com.niit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller  
public class HomeController {  
    
  @RequestMapping(value="/", method=RequestMethod.GET)  
  public String home() {  
	  
	  System.out.println("**********************************");
	  System.out.println("Controller has been started");
	  System.out.println("**********************************");
	  
      return "index";  
  }
  
  // Home page
  @RequestMapping(value="index", method=RequestMethod.GET)  
  public String home1() {  
	  
	  System.out.println("**********************************");
	  System.out.println("Controller index has been started");
	  System.out.println("**********************************");
	  
      return "index";  
  }  
  
  // About us option
  @RequestMapping("/about")
	public String sayAbout() {
		return "about";
  }
  
  // Product grid option
  @RequestMapping("/productgrid")
  public String productgrid()
  {
	  return "productgrid";
  }
  
  @RequestMapping("/user/userabout")
  public String sayAbout1() 
  {
	  return "/user/userabout";
  }
  
  @RequestMapping("/user/userproductgrid")
  public String productgrid1()
  {
	  return "/user/userproductgrid";
  }
  
  @RequestMapping("/user/userproductList")
  public String productList1()
  {
	  return "/user/userproductList";
  }
  
  @RequestMapping("/admin/adminabout")
  public String sayAbout2() 
  {
		return "/admin/adminabout";
  }
  
  @RequestMapping("/admin/adminproductgrid")
  public String productgrid2()
  {
	  return "/admin/adminproductgrid";
  }
  
  @RequestMapping("/admin/adminproductList")
  public String productList2()
  {
	  return "/admin/adminproductList";
  }
  
  @RequestMapping("/myregister")
	public String register() 
  {  
	  System.out.println("**********************************");
	  System.out.println("Controller myregister has been started");
	  System.out.println("**********************************");
	  
	  return "register";
  }
  
    @RequestMapping("/mylogin")
 	public String mylogin()
  {
      System.out.println("**********************************");
	  System.out.println("Controller mylogin has been started ");
	  System.out.println("**********************************");
	  
 	  return "login";
 }
  
  @RequestMapping(value="admin/adminindex")  
  public String privateHome() 
  {  
      return "/admin/adminindex";    
  }
  
  @RequestMapping(value="user/userindex")  
  public String privateHome1()
  {  
      return "/user/userindex";    
  }
}
  
