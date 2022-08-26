package com.sopra.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sopra.Library;

public interface LibraryRepository extends CrudRepository<Library,Integer>{
	
	List<Library> findByName(String name);

	

}
