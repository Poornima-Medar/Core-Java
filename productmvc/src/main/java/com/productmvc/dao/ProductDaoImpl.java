package com.productmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.productmvc.model.Product;

import jakarta.transaction.Transactional;

@Component
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);	
	}

	@Override
	public List<Product> getProducts(Product product) {
		List<Product> list = new ArrayList<>();
		return list;
	} 
}
