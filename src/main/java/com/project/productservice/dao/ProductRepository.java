package com.project.productservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.productservice.model.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {

}
