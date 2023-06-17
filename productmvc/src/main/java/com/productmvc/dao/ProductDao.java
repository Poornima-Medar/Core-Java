package com.productmvc.dao;

import java.util.List;

import com.productmvc.model.Product;

public interface ProductDao {
	
	public void createProduct(Product product);
	
    public List<Product> getProducts(Product product);
}
