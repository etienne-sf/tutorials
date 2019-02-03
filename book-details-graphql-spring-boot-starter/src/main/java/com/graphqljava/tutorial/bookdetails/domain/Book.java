package com.graphqljava.tutorial.bookdetails.domain;

/**
 * 
 * The class which used to map to the Book graphql type. <BR/>
 * <BR/>
 * Note: this type should be generated from the graphql schema. This will be added in a next version of this sample
 * 
 * @author EtienneSF
 *
 */
public class Book {

	String id;
	String name;
	int pageCount;
	Author author;

	public Book(String id, String name, int pageCount, Author author) {
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
