package com.lti.fg.daos;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.fg.entities.Cart;
import com.lti.fg.exceptions.CartException;


@Repository
public class CartDaoImpl implements CartDao{
	
	@PersistenceContext
    private EntityManager manager;
	   
	    @Override
	    public List<Cart> veiwCart(int id) throws CartException {
	        Query query = manager.createQuery("from Cart where userId = " + id);
	        //query.setParameter(1, id);
	        List<Cart> cart = query.getResultList();
	        return cart;
	    }

	    @Override
	    public boolean insertIntoCart(Cart cart) throws CartException {
	    	Query query = manager.createQuery("select MAX(cartId) from Cart");
	    	Integer cartId = (Integer)query.getSingleResult();
	    	if(cartId == null)
	    		cartId=0;
	    	cartId+=1;
	    	System.out.println(cartId);
	    	cart.setCartId(cartId);
	        manager.persist(cart);
	        return true;
	    }
	    
	    
}
