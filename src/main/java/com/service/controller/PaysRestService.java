package com.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.service.dao.PaysRepository;
import com.service.entities.Country;

@RestController
public class PaysRestService {

	
	@Autowired
	private PaysRepository paysRepository; 
	
	@GetMapping(value="/listPays")
	public List<Country> listPays() {
		return paysRepository.findAll();
	}
	
	@GetMapping(value="/listPays/{id}")
	public Country getPays(@PathVariable(name="id") Long id) {
		return paysRepository.findById(id).get();
	}
	
	@PostMapping(value="/listPays/")
	public Country save(@RequestBody Country p) {
		return paysRepository.save(p);
	}
	
	@PutMapping(value="/listPays/{id}")
	public Country update(@PathVariable(name="id") Long id, @RequestBody Country p) {
		p.setId(id); 
		return paysRepository.save(p); 
	}
	
	@DeleteMapping(value="/listPays/{id}")
	public void delete(@PathVariable(name="id") Long id) {
		paysRepository.deleteById(id); 
	}
}



