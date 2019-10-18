package com.lti.hr.controllers;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.fg.entities.Cart;
import com.lti.fg.entities.Product;
import com.lti.fg.entities.User;
import com.lti.fg.exceptions.CartException;
import com.lti.fg.exceptions.ProductException;
import com.lti.fg.exceptions.UsersException;
import com.lti.fg.services.CartService;
import com.lti.fg.services.ProductService;
import com.lti.fg.services.UserService;


//http://localhost:8092/Spa020_JpaJstl/home.hr
/*
 * Controller
 *1. to interact with service layer to get the processed data
 * 2. after receipt of the data from service layer apply transformation
 * 3. create a data model
 * suggest name of  jsp
 * 
 * Abstract Controller
 * Simple form controller
 * multi action controller BEST HAI
 * 
 * 
 */
@Controller
public class HrController {
	
	@Resource
	private UserService userService;
	
	@Resource
	private ProductService productService;
	
	@Resource
	private CartService cartService;
	
	@RequestMapping("/home.hr")
	public String getHomePage() throws ProductException 
	{
		//System.out.println(productService.getAllProducts());
		return "Home";	
	}
	
	@RequestMapping("/UserDetails.hr")
	public ModelAndView getAllUsers() throws UsersException
	{
		ModelAndView mv = new ModelAndView("UserList");
		List<User> userList = userService.getAllUsers();
		System.out.println(userList);
		mv.addObject("userList", userList);
		return mv;
	}
	
	
	@RequestMapping("/preLogIn.hr")
	public ModelAndView getLogInPage()throws UsersException{
		ModelAndView mv= new ModelAndView("logIn");
		return mv;
	}
	
	@RequestMapping("/logIn.hr")
	public ModelAndView logIn(HttpServletRequest request) throws UsersException
	{
		ModelAndView mv= new ModelAndView();
		String uName= request.getParameter("uName");
		String uPass= request.getParameter("uPass");
		User user = new User();
		user.setUserName(uName);
		user.setUserPassword(uPass);
		boolean res= userService.logIn(user);
		if(res)
		{
			mv.setViewName("LogInSucess");
			return mv;
		}
		mv.setViewName("logIn");
		return mv;
	}
	
	@RequestMapping("/productDisplay.hr")
	public ModelAndView getProductPage() throws ProductException
	{
		List<Product> productList = productService.getAllProducts();
		ModelAndView mv = new ModelAndView("ProductDisplay");
		mv.addObject("productList", productList);
		return mv;
	}
	
	@RequestMapping("/productDetails.hr")
	public ModelAndView getProductById(@RequestParam("id") int id) throws ProductException
	{
		Product product = productService.findProductById(id);
		ModelAndView mv = new ModelAndView("ProductDetails");
		mv.addObject("product", product);
		return mv;
	}
	
	@RequestMapping("/addToCart.hr")
	public ModelAndView addToCart(@RequestParam("id") int id) throws CartException, ProductException
	{
		ModelAndView mv = new ModelAndView("ProductDetails");
		Cart cart = new Cart(101, id, 1);
		boolean isAdded = cartService.addToCart(cart);
		if(isAdded)
		{
			
			Product product = productService.findProductById(id);
			mv.addObject("product", product);
			return mv;
		}
		HrController control = new HrController();
		mv = control.getProductPage();
		return mv;
	}
	
	@RequestMapping("/viewCart.hr")
	public ModelAndView viewCart(HttpServletRequest request) throws UsersException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		List<Product> productList = userService.viewCartDetailsByUserId(userId);
		double cartCost = 0.0;
		for(Product product:productList) {
			cartCost+=product.getProductCost();
		}
		
		request.setAttribute("cartCost", cartCost);
		ModelAndView mv = new ModelAndView("ViewCart");
		mv.addObject("productList", productList);
		return mv;
		
	}
}
