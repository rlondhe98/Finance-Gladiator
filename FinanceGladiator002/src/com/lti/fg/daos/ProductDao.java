package com.lti.fg.daos;

import java.util.List;

import com.lti.fg.entities.Product;
import com.lti.fg.exceptions.ProductException;

public interface ProductDao {

	 public List<Product> getAllProducts() throws ProductException;
	 public boolean insertNewProduct(Product product) throws ProductException;
	 public Product findProductById(int id) throws ProductException;
}
