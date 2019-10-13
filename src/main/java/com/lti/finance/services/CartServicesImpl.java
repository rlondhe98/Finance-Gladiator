package com.lti.finance.services;

import com.lti.finance.daos.CartDao;
import com.lti.finance.daos.CartDaoImpl;
import com.lti.finance.entity.Cart;
import com.lti.finance.exception.CartException;

import java.util.List;

public class CartServicesImpl implements CartServices
{
    private CartDao dao;
    public CartServicesImpl()
    {
        dao = new CartDaoImpl();
    }
    @Override
    public List<Cart> veiwCart(int id) throws CartException {
        return dao.veiwCart(id);
    }

    @Override
    public boolean addToCart(Cart cart) throws CartException {
        return dao.insertIntoCart(cart);
    }
}
