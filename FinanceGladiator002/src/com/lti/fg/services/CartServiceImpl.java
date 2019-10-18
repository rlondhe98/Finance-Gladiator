package com.lti.fg.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.fg.daos.CartDao;
import com.lti.fg.entities.Cart;
import com.lti.fg.exceptions.CartException;


@Service
@Transactional(propagation=Propagation.REQUIRED)
public class CartServiceImpl implements CartService{
	
	@Resource
	private CartDao dao;
	    
	 
	    @Override
	    public List<Cart> veiwCart(int id) throws CartException {
	        return dao.veiwCart(id);
	    }

	    @Override
	    public boolean addToCart(Cart cart) throws CartException {
	        return dao.insertIntoCart(cart);
	    }
}
