package com.lti.fg.services;

import java.util.List;

import com.lti.fg.entities.Product;
import com.lti.fg.exceptions.ProductException;

public interface ProductService {

	public List<Product> getAllProducts() throws ProductException;
    public boolean insertNewProduct(Product product) throws ProductException;
    public Product findProductById(int id) throws ProductException;
}
