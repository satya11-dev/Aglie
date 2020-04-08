package com.agilisum.test.productapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agilisum.test.productapplication.model.LaptopConfiguration;
import com.agilisum.test.productapplication.model.Product;
import com.agilisum.test.productapplication.service.LaptopConfigService;
import com.agilisum.test.productapplication.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@Autowired
	LaptopConfigService LConfS;

	@GetMapping("/products")
	private List<Product> getAllProducts() {
		return productservice.getAllProducts();
	}

	@GetMapping("/getproductdetails/{productId}")
	private Product getProduct(@PathVariable("productId") int Id) {
		return productservice.getProductById(Id);
	}

	@PostMapping("/products")
	private int saveProduct(@RequestBody Product products) {
		productservice.saveOrUpdate(products);
		return products.getProductId();
	}

	@PutMapping("/products")
	private Product updateProduct(@RequestBody Product products) {
		productservice.saveOrUpdate(products);
		return products;
	}

	@DeleteMapping("/products/{productId}")
	private void deleteProduct(@PathVariable("productId") int Id) {
		productservice.delete(Id);
	}
	
//========================================================================================//
	
	@GetMapping("/SystemConfig")
	private List<LaptopConfiguration> getAllLaptops() {
		return LConfS.getAllLaptops();
	}

	@GetMapping("/getconfigdetails/{LaptopId}")
	private LaptopConfiguration getLaptop(@PathVariable("LaptopId") int Id) {
		return LConfS.getLaptopById(Id);
	}

	@PostMapping("/SystemConfig")
	private int saveLaptop(@RequestBody LaptopConfiguration LC) {
		LConfS.saveOrUpdate(LC);
		return LC.getLaptopId();
	}

	@PutMapping("/SystemConfig")
	private LaptopConfiguration updateLaptop(@RequestBody LaptopConfiguration LC) {
		LConfS.saveOrUpdate(LC);
		return LC;
	}

	@DeleteMapping("/SystemConfig/{LaptopId}")
	private void deleteLaptop(@PathVariable("LaptopId") int Id) {
		LConfS.delete(Id);
	}
	
	

}
