package com.lti.fg.services;

import java.util.List;

import com.lti.fg.entities.Cart;
import com.lti.fg.exceptions.CartException;

public interface CartService {

	public List<Cart> veiwCart(int id) throws CartException;
    public boolean addToCart(Cart cart) throws CartException;
}
