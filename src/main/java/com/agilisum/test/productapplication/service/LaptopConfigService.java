package com.agilisum.test.productapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agilisum.test.productapplication.model.LaptopConfiguration;
import com.agilisum.test.productapplication.model.Product;
import com.agilisum.test.productapplication.repository.LaptopConfigRepository;
import com.agilisum.test.productapplication.repository.ProductRepository;


@Service
public class LaptopConfigService {
	
	@Autowired
	LaptopConfigRepository LConfigRepos;
	
	public List<LaptopConfiguration> getAllLaptops(){
		List<LaptopConfiguration> LConf = new ArrayList<LaptopConfiguration>();
		LConfigRepos.findAll().forEach(LConf1 -> LConf.add(LConf1));
		return LConf;
	}
	
	public LaptopConfiguration getLaptopById(int id) {
		return LConfigRepos.findById(id).get();
		
	}
	
	public void saveOrUpdate(LaptopConfiguration LConf){
		
		LConfigRepos.save(LConf);
	}
	
	public void update(LaptopConfiguration LConf, int laptopId) {
		LConfigRepos.save(LConf);
	}
	
	public void delete(int id) {
		LConfigRepos.deleteById(id);
	}
	
}
