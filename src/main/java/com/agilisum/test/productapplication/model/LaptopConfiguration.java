package com.agilisum.test.productapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LaptopConfiguration {
	
	@Id
	@Column
	private int laptopId;
	
	
	@Column
	private String laptopName;
	
	
	@Column
	private int laptopRam;
	
	@Column
	private String laptopProcessor;
	
	@Column
	private String laptopOS;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public int getLaptopRam() {
		return laptopRam;
	}

	public void setLaptopRam(int laptopRam) {
		this.laptopRam = laptopRam;
	}

	public String getLaptopProcessor() {
		return laptopProcessor;
	}

	public void setLaptopProcessor(String laptopProcessor) {
		this.laptopProcessor = laptopProcessor;
	}

	public String getLaptopOS() {
		return laptopOS;
	}

	public void setLaptopOS(String laptopOS) {
		this.laptopOS = laptopOS;
	}


}
