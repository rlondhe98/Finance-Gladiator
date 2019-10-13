package com.lti.finance.daos;

import com.lti.finance.entity.Cart;
import com.lti.finance.exception.CartException;

import java.util.List;

public interface CartDao
{
    public List<Cart> veiwCart(int id) throws CartException;

    public boolean insertIntoCart(Cart cart) throws CartException;
}
