package com.sopra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.sopra.repository.LibraryRepository;

//Test class

@SpringBootTest
public class BookServiceTest {
	
	
	ArrayList<Library> libraries=null;
	ArrayList<Library> library=null;
	
	@Mock
	private LibraryRepository libRepo;
	
	@InjectMocks
	private BookService helloService = new BookService();
	
	
	
	
	
	@BeforeEach
	void setMockOutput() {
		libraries = new ArrayList<Library>();
		libraries.add(new Library(1,"Merchant","Ankit","available"));
		libraries.add(new Library(2,"Merchant of","Ankit j","available"));
		when(helloService.findAll()).thenReturn(libraries);
	}

	
	@DisplayName("FindAll test")
	@Test
	void testfindAll() {
		library = new ArrayList<Library>();
		library.add(new Library(1,"Merchant","Ankit","available"));
		library.add(new Library(2,"Merchant of","Ankit j","available"));
		
		
		Iterator<Library> it1 = libraries.iterator();
		Iterator<Library> it2 = helloService.findAll().iterator();
		while (it1.hasNext() && it2.hasNext()) {
			assertEquals(it1.next().getId(), it2.next().getId());
		    
		}
	}

}
