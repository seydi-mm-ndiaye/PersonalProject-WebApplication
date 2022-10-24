package com.service.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.service.entities.Country;

@CrossOrigin("*")
@RepositoryRestResource // generate the web service
public interface PaysRepository  extends JpaRepository<Country, Long>{
	
	@RestResource(path="/byName") // Customized method to find specific designation using keywords
	public List<Country> findByNameContains(@Param("kw") String name); // url:countries/search/byName?kw=pattern
	@RestResource(path="/byNamePage")
	public Page<Country> findByNameContains(@Param("kw") String name, Pageable pageable);

}
