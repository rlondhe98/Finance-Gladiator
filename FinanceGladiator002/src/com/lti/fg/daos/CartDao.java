package com.lti.fg.daos;

import java.util.List;

import com.lti.fg.entities.Cart;
import com.lti.fg.exceptions.CartException;

public interface CartDao {
	 
	public List<Cart> veiwCart(int id) throws CartException;
	 public boolean insertIntoCart(Cart cart) throws CartException;
	
}
