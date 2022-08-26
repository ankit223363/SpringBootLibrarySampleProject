package com.sopra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.repository.LibraryRepository;

@Service
public class BookService {
	@Autowired
	LibraryRepository repo;
	
	public Iterable<Library> findAll(){
		return repo.findAll();
	}

}
