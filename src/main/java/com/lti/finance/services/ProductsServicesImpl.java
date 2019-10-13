package com.lti.finance.services;

import com.lti.finance.daos.ProductsDao;
import com.lti.finance.daos.ProductsDaoImpl;
import com.lti.finance.entity.Products;
import com.lti.finance.entity.Users;
import com.lti.finance.exception.ProductException;
import com.lti.finance.exception.UsersException;

import java.util.List;

public class ProductsServicesImpl implements ProductsServices
{
    private ProductsDao dao;
    public ProductsServicesImpl(){
        dao = new ProductsDaoImpl();
    }

    @Override
    public List<Products> getAllProducts() throws ProductException {
        return dao.getAllProducts();
    }

    @Override
    public boolean insertNewProduct(Products product) throws ProductException {
        return dao.insertNewProduct(product);
    }
}
