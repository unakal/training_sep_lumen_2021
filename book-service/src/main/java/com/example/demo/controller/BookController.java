package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;


@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping(path = "book/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return this.service.getBookById(id);
	}
}
