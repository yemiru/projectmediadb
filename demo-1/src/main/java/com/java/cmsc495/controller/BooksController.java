package com.java.cmsc495.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.cmsc495.model.Books;
import com.java.cmsc495.service.BooksService;

@RestController
public class BooksController {

	@Autowired
	private BooksService booksService;

	@RequestMapping(method = RequestMethod.GET, value = "/books")
	public List<Books> getAllBooks() {
		return booksService.getAllBooks();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/book/{id}")
	public Books getBook(@pathVariable Integer id) {
		return booksService.getBook(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/books")
	public void addBook(@RequestBody Books book) {
		booksService.addBooks(book);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
	public void updateBook(@RequestBody Books book, @pathVariable Integer id) {
		booksService.updateBooks(id, book);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/book/{id}")
	public void deleteBook(@pathVariable Integer id) {
		booksService.deleteBooks(id);
	}
}
