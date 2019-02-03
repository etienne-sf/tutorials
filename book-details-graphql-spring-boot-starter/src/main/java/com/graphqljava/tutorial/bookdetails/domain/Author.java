package com.graphqljava.tutorial.bookdetails.domain;

/**
 * 
 * The class which used to map to the Author graphql type. <BR/>
 * <BR/>
 * Note: this type should be generated from the graphql schema. This will be added in a next version of this sample
 * 
 * @author EtienneSF
 *
 */
public class Author {
	String id;
	String firstName;
	String lastName;

	public Author(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
