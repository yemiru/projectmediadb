package com.java.cmsc495.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.java.cmsc495.controller.pathVariable;
import com.java.cmsc495.model.Books;

@Service
public class BooksService {
	
	private List<Books> books = new ArrayList<Books>();
	public List<Books> getAllBooks() {
		return books;

	}

	public Books getBook(Integer id) {
		return books.stream().filter(b -> b.getBookId().equals(id)).findFirst().get();
	}

	public void addBooks(Books book) {
		books.add(book);

	}

	public void updateBooks(Integer id, Books book) {
			for(int i = 0; i <books.size(); i++) {
				Books b = books.get(i);
				if(b.getBookId().equals(id)) {
					books.set(i, book);
					return ;
				}
			}
			
		}

	public void deleteBooks(Integer id) {
			books.removeIf(b -> b.getBookId().equals(id));
			
		}

}
