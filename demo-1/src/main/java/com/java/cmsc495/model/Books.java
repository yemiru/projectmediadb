package com.java.cmsc495.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the books database table.
 * 
 */
@Entity
@Table(name = "books")
@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
public class Books implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "book_id")
	private Integer bookId;

	private String format;

	private int pages;

	private String publisher;

	@Temporal(TemporalType.DATE)
	private Date year;

	// bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Persons person;

	public Books() {
	}

	public Persons getPerson() {
		return this.person;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer id) {
		this.bookId = bookId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public void setPerson(Persons person) {
		this.person = person;
	}

}