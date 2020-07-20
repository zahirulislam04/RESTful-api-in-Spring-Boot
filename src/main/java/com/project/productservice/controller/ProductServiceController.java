package com.project.productservice.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.productservice.model.Products;
import com.project.productservice.service.ProductServiceClass;

@RestController
@RequestMapping("/products")
public class ProductServiceController {

	@Autowired
	private ProductServiceClass service;
	
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})	
	public Collection<Products> getProducts() {		
		return service.getProducts();
	}
	
	@GetMapping(path = "/{Id}")
	public Products getProduct(@PathVariable("Id") int Id) {
		return service.getProduct(Id);
	}
	
	@PostMapping( consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
				  produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Collection<Products> addProduct(@RequestBody Products product){			
		service.saveProduct(product);
		return service.getProducts();
	}
	
	@PutMapping(  consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
				  produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Collection<Products> updateProducts(@RequestBody Products product){			
		service.saveProduct(product);
		return service.getProducts();
	} 
	
	@DeleteMapping(path = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Collection<Products> deleteProduct(@PathVariable("id") int id){
		service.deleteProduct(id);
		return service.getProducts();
	}
}
