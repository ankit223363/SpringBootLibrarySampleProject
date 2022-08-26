package com.sopra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sopra.BookService;
import com.sopra.Library;
import com.sopra.repository.LibraryRepository;

@Controller
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	@Autowired
	private BookService bookService;
	
	
	
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("appName", "Library Management Web Application");
		System.out.println("home");
		return "STY";
	}
	@RequestMapping("add")
	public String add(Model model)
	{
		model.addAttribute("appName", "Library Management Web Application");
		System.out.println("add");
		return "addBook";
	}
	
	@PostMapping("/addbk")
	public String create(@ModelAttribute Library library, Model model) {

		libraryRepository.save(library);

		List<Library> librarys = (List<Library>) libraryRepository.findAll();
		model.addAttribute("library", library);
		model.addAttribute("msg", "Book has been added.");
		System.out.println("addbk");

		return displayLibraryInfo(model);
	}
	
	

	
	@RequestMapping("/display")
	public String displayLibraryInfo(Model model)
	{
		List<Library> libraries = (List<Library>) bookService.findAll();
		model.addAttribute("libraries",libraries);
		model.addAttribute("msg", "Welcome to Library Management System");
		return "displaylibrary";
	}
	
	@RequestMapping("/borrow/{id}")
	public String borrow(Model model , @PathVariable String id)
	{	Library lib = libraryRepository.findById(Integer.parseInt(id)).get();
				
					lib.setStatus("not available");
				
					
				libraryRepository.save(lib);
		
		return displayLibraryInfo(model);
	}
	
	@RequestMapping("/return/{id}")
	public String ret(Model model , @PathVariable String id)
	{	Library lib = libraryRepository.findById(Integer.parseInt(id)).get();
				
					lib.setStatus("available");
				
					
				libraryRepository.save(lib);
		
		return displayLibraryInfo(model);
	}

	
	

	
	
	
}
