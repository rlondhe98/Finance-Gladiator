package com.lti.finance.daos;

import com.lti.finance.entity.Cart;
import com.lti.finance.exception.CartException;
import com.lti.finance.factories.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class CartDaoImpl implements CartDao
{
    private EntityManagerFactory factory;
    private EntityManager manager;
    public CartDaoImpl()
    {
        factory = JpaFactory.getFactory();
        manager = factory.createEntityManager();
    }

    @Override
    public List<Cart> veiwCart(int id) throws CartException {
        Query query = manager.createQuery("from Cart where userId = " + id);
        //query.setParameter(1, id);
        List<Cart> cart = query.getResultList();
        return cart;
    }

    @Override
    public boolean insertIntoCart(Cart cart) throws CartException {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(cart);
        transaction.commit();
        return true;
    }
}
