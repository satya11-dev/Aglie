package com.agilisum.test.productapplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agilisum.test.productapplication.model.LaptopConfiguration;
import com.agilisum.test.productapplication.model.Product;


public interface LaptopConfigRepository extends CrudRepository<LaptopConfiguration, Integer>{
	
	

}
