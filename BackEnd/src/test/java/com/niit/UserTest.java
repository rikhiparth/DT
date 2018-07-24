package com.niit;

import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.ShoppingCart.dao.Userdao;
import com.niit.ShoppingCart.daoimpl.Userdaoimpl;
import com.niit.ShoppingCart.entity.User;

public class UserTest 
{ 
  @Ignore
  @Test
  public void TestAdd()
  { Userdao userdao = new Userdaoimpl();
	
	User u = new User();
	u.setUserId("201111");
	u.setPassword("12345");
	u.setEmailId("rikhiparth@gmail.com");
	u.setAddress("Delhi");
	u.setPhoneno("9811403747");
	u.setEnabled(true);
	u.setRole("admin");
	u.setContact("niit1");
	
	userdao.add(u);
	}
  
  @Ignore
  @Test
  public void TestDelete()
  { Userdao userdao = new Userdaoimpl();
    
    User user=userdao.getUserById("103");
    user.show(user);
    userdao.delete("103");
  }  
  
  @Ignore
  @Test
  public void TestUpdate()
  { 
	Userdao userdao = new Userdaoimpl();
    User user=userdao.getUserById("201111");
    user.setAddress("Delhi");
    user.setEmailId("rikhiparth@yahoo.com");
    user.setContact("Parth");
    user.setPassword("234");
    user.setPhoneno("9811278126");
    user.setRole("user");
    user.show(user);
    
    userdao.update(user);
  }
  
  @Ignore
  @Test
  public void Test1()
  {
	    System.out.println(" GET By Email ");
	    Userdao userdao = new Userdaoimpl();
	    User user=userdao.getUserByUsername("parth.rikhi@yahoo.com");
	    user.show(user);
  }
  
  @Ignore
  @Test
  public void Test2()
  {
	  Userdao userdao = new Userdaoimpl();
	  List<User> user=userdao.getUserAll();
	  Iterator<User> item = user.iterator();
		
		while(item.hasNext())
		{
			User u = (User) item.next();
			u.show(u);
		}
  }
  
  @Ignore
  @Test
  public void Test3()
  {
	  System.out.println(" GET By UserId ");
	  Userdao userdao = new Userdaoimpl();
	  System.out.println("fvbzf1");
      User user=userdao.getUserById("201111");
      user.show(user);
      
  }
 }


