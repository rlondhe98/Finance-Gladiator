package com.lti.finance.daos;

import com.lti.finance.entity.Products;
import com.lti.finance.exception.ProductException;

import java.util.List;

public interface ProductsDao
{
    public List<Products> getAllProducts() throws ProductException;

    public boolean insertNewProduct(Products product) throws ProductException;
}
