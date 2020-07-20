package com.project.productservice.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.productservice.dao.ProductRepository;
import com.project.productservice.model.Products;

@Service
public class ProductServiceClass {
	@Autowired
	private ProductRepository repo;
	
	public Collection<Products> getProducts() {
		List<Products> products = new ArrayList<Products>();
		for(Products p: repo.findAll()) {
			products.add(p);
		}
		return products;
	}
	
	public Products getProduct(int id) {
		return repo.findById(id).get();
	}
	
	public void saveProduct(Products p) {
		repo.save(p);		
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}
	
}
