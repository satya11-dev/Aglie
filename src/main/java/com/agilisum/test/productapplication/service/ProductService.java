package com.agilisum.test.productapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilisum.test.productapplication.model.Product;
import com.agilisum.test.productapplication.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		productRepository.findAll().forEach(products1 -> products.add(products1));
		return products;
	}
	
	public Product getProductById(int id) {
		return productRepository.findById(id).get();
		
	}
	
	public void saveOrUpdate(Product products){
		
		productRepository.save(products);
	}
	
	public void update(Product products, int productId) {
		productRepository.save(products);
	}
	
	public void delete(int id) {
		productRepository.deleteById(id);
	}
	
}
