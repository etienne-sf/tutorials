/**
 * 
 */
package com.graphqljava.tutorial.bookdetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqljava.tutorial.bookdetails.domain.Author;
import com.graphqljava.tutorial.bookdetails.domain.Book;

/**
 * @author EtienneSF
 */
@Component
public class Query implements GraphQLQueryResolver {

	final List<Book> books = new ArrayList<Book>();
	final List<Author> authors = new ArrayList<Author>();

	public Query() {
		authors.add(new Author("author-1", "Joanne", "Rowling"));
		authors.add(new Author("author-2", "Herman", "Melville"));
		authors.add(new Author("author-3", "Anne", "Rice"));

		books.add(new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, authors.get(0)));
		books.add(new Book("book-2", "Moby Dick", 635, authors.get(1)));
		books.add(new Book("book-3", "Interview with the vampire", 371, authors.get(2)));
	}

	public Book bookById(String id) {
		return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
	}

}
