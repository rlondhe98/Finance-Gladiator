package com.lti.finance.daos;

import com.lti.finance.entity.Products;
import com.lti.finance.entity.Users;
import com.lti.finance.exception.ProductException;
import com.lti.finance.factories.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class ProductsDaoImpl implements ProductsDao
{
    private EntityManagerFactory factory;
    private EntityManager manager;
    public ProductsDaoImpl()
    {
        factory = JpaFactory.getFactory();
        manager = factory.createEntityManager();
    }

    @Override
    public List<Products> getAllProducts() throws ProductException {
        Query query = manager.createNamedQuery("getAllProducts");
        List<Products> productsList = query.getResultList();
        return productsList;
    }

    @Override
    public boolean insertNewProduct(Products product) throws ProductException {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Products existingProduct = manager.find(Products.class, product.getProductId());
        if (existingProduct==null)
        {
            manager.persist(product);
            transaction.commit();
            //manager.close();
            return true;
        }
        return false;
    }
}
