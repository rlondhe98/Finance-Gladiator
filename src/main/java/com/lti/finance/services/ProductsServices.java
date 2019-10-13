package com.lti.finance.services;

import com.lti.finance.entity.Products;
import com.lti.finance.exception.ProductException;

import java.util.List;

public interface ProductsServices
{
    public List<Products> getAllProducts() throws ProductException;

    public boolean insertNewProduct(Products product) throws ProductException;
}
