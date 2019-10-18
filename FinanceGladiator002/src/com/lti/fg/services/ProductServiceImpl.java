package com.lti.fg.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.fg.daos.ProductDao;
import com.lti.fg.entities.Product;
import com.lti.fg.exceptions.ProductException;
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService{
	
	@Resource
	private ProductDao dao;
	
	@Override
    public List<Product> getAllProducts() throws ProductException {
        return dao.getAllProducts();
    }

    @Override
    public boolean insertNewProduct(Product product) throws ProductException {
        return dao.insertNewProduct(product);
    }

	@Override
	public Product findProductById(int id) throws ProductException {
		return dao.findProductById(id);
	}
}
