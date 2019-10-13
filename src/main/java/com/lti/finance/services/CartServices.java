package com.lti.finance.services;

import com.lti.finance.entity.Cart;
import com.lti.finance.exception.CartException;

import java.util.List;

public interface CartServices
{
    public List<Cart> veiwCart(int id) throws CartException;

    public boolean addToCart(Cart cart) throws CartException;
}
