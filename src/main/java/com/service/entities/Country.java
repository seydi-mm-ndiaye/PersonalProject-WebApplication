package com.service.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long id; 
	private String name; 
	private String capital; 
	private String region; 
	private double size;
	
	
	public Country(Long id, String name, String capital, String region, double size) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.region = region;
		this.size = size;
	}

	public Country() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capitalName) {
		this.capital = capitalName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Pays [id=" + id + ", name=" + name + ", capital=" + capital + ", region=" + region
				+ ", size=" + size + "]";
	} 
	
	
	
	
	
}
