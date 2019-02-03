package com.graphqljava.tutorial.bookdetails;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphqljava.tutorial.bookdetails.domain.Author;
import com.graphqljava.tutorial.bookdetails.domain.Book;

/**
 * 
 * @author EtienneSF
 */
@Component
public class BookResolver implements GraphQLResolver<Book> {

	public Author getCase(Book book) {
		return book.getAuthor();
	}

}
