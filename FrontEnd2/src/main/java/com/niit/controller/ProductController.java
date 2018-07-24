package com.niit.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShoppingCart.dao.Categorydao;
import com.niit.ShoppingCart.dao.Productdao;
import com.niit.ShoppingCart.dao.Supplierdao;
import com.niit.ShoppingCart.daoimpl.Categorydaoimpl;
import com.niit.ShoppingCart.daoimpl.Productdaoimpl;
import com.niit.ShoppingCart.daoimpl.Supplierdaoimpl;
import com.niit.ShoppingCart.entity.Category;
import com.niit.ShoppingCart.entity.Product;
import com.niit.ShoppingCart.entity.Supplier;

@Controller
public class ProductController 
{ 
	// Add product option
	@RequestMapping("/admin/addproduct")
	public String getAddProductForm()
	{
		System.out.println("**********************************");
		System.out.println("Controller getproductform has been started");
		System.out.println("**********************************");
		  
		return "/admin/addproduct";
	}
	
	// Add a product
	@RequestMapping(value="/addproductprocess", method=RequestMethod.POST)
	public String AddProductForm(HttpServletRequest request)
	{
		System.out.println("**********************************");
		System.out.println("Controller Add Product has been started");
		System.out.println("**********************************");
		
		String pid = request.getParameter("productid");
		String pname = request.getParameter("productname");
		String pdetails = request.getParameter("productdetails");
		int pprice = Integer.parseInt(request.getParameter("productprice"));
		int pqty = Integer.parseInt(request.getParameter("productqty"));
		
		String cid = request.getParameter("categoryid");
		Categorydao cdao = new Categorydaoimpl();
		
		Category c = cdao.getCategoryById(cid);
		
		String sid = request.getParameter("supplierid");
        Supplierdao sdao = new Supplierdaoimpl();
		
        Supplier s = sdao.getSupplierbysupplierId(sid);
		
		try 
		{
		   System.out.println("OKK0000000000000");
		   Productdao productdao = new Productdaoimpl();
		
		   System.out.println("OKK11111111111");
		   Product p = new Product();
		   
		   p.setProductid(pid);
		   p.setProductname(pname);
		   p.setProductdetails(pdetails);
		   p.setProductprice(pprice);
		   p.setProductqty(pqty);
		   p.setSupplierid(s);
		   p.setCategoryid(c);
		
		   System.out.println("OKKKKKKKKKKKKKKKKK");
		   productdao.addProduct(p);
		}
		catch(Exception e)
		{
		   System.out.println("Error"+e);
		}
		return "/admin/addproduct";	
	}
	
	// Get list of products by admin
	@RequestMapping("/admin/admingetAllproducts")
	public String getAllproducts(Model model)
	{
		System.out.println("**********************************");
		System.out.println("Controller getAllproducts has been started");
		System.out.println("**********************************");
		
		Productdao dao = new Productdaoimpl();
		List<Product> productlist = dao.getAllProducts();
		model.addAttribute("productlist", productlist);
		return "/admin/adminproductList";
	}
	
	// Get list of products by user
	@RequestMapping("/user/usergetAllproducts")
	public String usergetAllproducts(Model model)
	{
		System.out.println("**********************************");
		System.out.println("Controller getAllproducts has been started");
		System.out.println("**********************************");
		
		Productdao dao = new Productdaoimpl();
		List<Product> productlist = dao.getAllProducts();
		model.addAttribute("productlist", productlist);
		return "/user/userproductList";
	}
	
	// View a product by admin
	@RequestMapping(value="/adminviewproduct/{pid}", method=RequestMethod.GET)
	public String admingetProductbyId(@PathVariable String pid,Model model)
	{
		Productdao dao = new Productdaoimpl();
		
		Product product = dao.getProductbyProductId(pid);
		model.addAttribute("product",product);
		return "/admin/adminviewproduct";	
	}
	
	// View a product by user
	@RequestMapping(value="/userviewproduct/{pid}", method=RequestMethod.GET)
	public String usergetProductbyId(@PathVariable String pid,Model model)
	{
		Productdao dao = new Productdaoimpl();
		
		Product product = dao.getProductbyProductId(pid);
		model.addAttribute("product",product);
		return "/user/userviewproduct";	
	}
	
	// Delete a product
	@RequestMapping("/deleteproduct/{pid}")
	public String deleteproduct(@PathVariable String pid, Model model)
	{
		Productdao dao = new Productdaoimpl();
		
		dao.deleteProduct(pid);
		
		List<Product> productlist = dao.getAllProducts();
		model.addAttribute("productlist", productlist);
		return "/admin/adminproductList";		
	}
	
	// Delete a category
	@RequestMapping("/deletecategory/{cid}")
	public String deletecategory(@PathVariable String cid, Model model)
	{
		Categorydao dao = new Categorydaoimpl();
		
		dao.deleteCategory(cid);
		
		List<Category> categorylist = dao.getAllCategory();
		model.addAttribute("categorylist", categorylist);
		return "/admin/categoryList";		
	}
	
	// Delete a supplier
	@RequestMapping("/deletesupplier/{sid}")
	public String deletesupplier(@PathVariable String sid, Model model)
	{
		Supplierdao dao = new Supplierdaoimpl();
		
		dao.deleteSupplier(sid);
		
		List<Supplier> supplierlist = dao.getAllSupplier();
		model.addAttribute("supplierlist", supplierlist);
		return "/admin/supplierList";		
	}
	
	// Update a product
	@RequestMapping(value="/editsave", method=RequestMethod.POST)
	public String editProduct(@ModelAttribute (value="productObj") Product product)
	{
		System.out.println("bfvhjB");
		Productdao dao = new Productdaoimpl();
		System.out.println("bfvhj");
		dao.updateProduct(product);
		
		return "/admin/admingetAllproducts";
	}
	
	// Update product option
	@RequestMapping("/editproduct/{pid}")
	public ModelAndView geteditProductform(@PathVariable String pid,Model model)
	{
		Productdao productdao = new Productdaoimpl();
		
		Product product = productdao.getProductbyProductId(pid);
		
		return new ModelAndView("/admin/editproduct","productObj",product);
	}
	
	// Add category option
	@RequestMapping("/admin/addcategory")
	public String getCategoryform()
	{
		return "/admin/addcategory";
	}
	
	// Add a category for product
	@RequestMapping(value="/addcategoryprocess", method=RequestMethod.POST)
	public String AddCategoryform(HttpServletRequest request)
	{
		System.out.println("**********************************");
		System.out.println("Controller Add Category has been started");
		System.out.println("**********************************");
		
		String catid = request.getParameter("categoryId");
		String catname = request.getParameter("categoryName");
		
		try
		{
			Categorydao dao = new Categorydaoimpl();
			Category c = new Category();
			
			c.setCategoryId(catid);
			c.setCategoryName(catname);
			
			dao.addCategory(c);
		}
		catch(Exception e)
		{
		   System.out.println("Error"+e);
		}
		return "/admin/addproduct";
	}
	
	// Get list of categories
	@RequestMapping(value="/getAllcategories")
	public String getAllcategories(Model model)
	{
		System.out.println("**********************************");
		System.out.println("Controller getAllcategories has been started");
		System.out.println("**********************************");
		
		Categorydao dao = new Categorydaoimpl();
		List<Category> categorylist = dao.getAllCategory();
		model.addAttribute("categorylist",categorylist);
		return "/admin/categoryList";
	}
	
	// Add supplier option
	@RequestMapping("/admin/addsupplier")
	public String getSupplierform()
	{
		return "/admin/addsupplier";
	}
	
	// Add a supplier for product
	@RequestMapping(value="/addsupplierprocess",  method=RequestMethod.GET)
	public String AddSupplierform(HttpServletRequest request)
	{
		System.out.println("**********************************");
		System.out.println("Controller Add Supplier has been started");
		System.out.println("**********************************");
		
		String suppid = request.getParameter("supplierid");
		String suppname = request.getParameter("suppliername");
		String suppemail = request.getParameter("supplieremail");
		String suppaddress = request.getParameter("supplieraddr");
		
		try
		{
			Supplierdao dao = new Supplierdaoimpl();
			Supplier s = new Supplier();
			
			s.setSupplierid(suppid);
			s.setSuppliername(suppname);
			s.setSupplieremail(suppemail);
			s.setSupplieraddr(suppaddress);
			
			dao.addSupplier(s);
		}
		catch(Exception e)
		{
		   System.out.println("Error"+e);
		}
		return "/admin/addproduct";
	}
	
	// Get list of suppliers
	@RequestMapping(value="/getAllsuppliers")
	public String getAllsuppliers(Model model)
	{
		System.out.println("**********************************");
		System.out.println("Controller getAllsuppliers has been started");
		System.out.println("**********************************");
		
		Supplierdao dao = new Supplierdaoimpl();
		List<Supplier> supplierlist = dao.getAllSupplier();
		model.addAttribute("supplierlist",supplierlist);
		return "/admin/supplierList";
	}
}