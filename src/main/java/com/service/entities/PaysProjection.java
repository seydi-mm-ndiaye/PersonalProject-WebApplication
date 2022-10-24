package com.service.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="name", types=Country.class)
public interface PaysProjection { // Show countries' name : "http://localhost:8080/countries?projection=name" 
	public String getName(); 

}
