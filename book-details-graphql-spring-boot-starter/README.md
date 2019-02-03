# Book details example, based on graphql-spring-boot-starter  


## Introduction

This project is an adaptation of the https://github.com/graphql-java/tutorials/tree/master/book-details tutorial. 
The main differences are:
* book_details is based on the graphql-java-spring-boot-starter-webmvc, whereas this sample is based on graphql-java-spring-boot-starter (not the 'lack' of webmvc at the end). The main impacts are:
    * The boiler plate code of the GraphQLProvider class is no more required. It is internally managed by graphql-java-spring-boot-starter
    * Will automatically load all .graphqls schema file which are on the classpath
    * Allows to use the **standard graphql terms** Query, Mutation, Resolver classes, instead of DataFetcher which is specific to graphql-java-spring-boot-starter-webmvc
* Removed dependencies like Google guava (for maps...) and spring-boot-starter-web (useless)
* Add of graphiql-spring-boot-starter, to deploy the graphi interface and test request from the server (URL: /graphisql) 
* This tutorial uses POJO (Plain Old Java Object) instead of maps. This is nearer to real case, when you use tools like Hibernate to load data from databases

You can find the relevant documentation here: [https://www.graphql-java-kickstart.com/spring-boot/][graphql-java-kickstart]


[graphql-java-kickstart]: https://www.graphql-java-kickstart.com/spring-boot/


## What you have to code for graphql

In this sample, you can see how simple it is to create a graphsql server.

Everything is in the com.graphqljava.tutorial.bookdetails package:
* **BookDetailsApplication**: Create your application. One line of code, the only boiler code here!  (thanks to Spring Boot)
* **Query**: Contains one method for each query you defined in your schema. The parameter must have the same name than the one in the graphql schema
* **BookResolver**: The graphql's trick to manage fields that are not scalar, but another graphql type. Very simple indead (much watch the performance issue here, more information on that on the graphql-java documentation)  

You're graphql server is done in three lines of code.

Ok, I didn't count the data initialization, and the java class, method and field definition...  ;-)

## How to test?

* Starts the **BookDetailsApplication** as a java application.
    * Thanks to Spring boot it starts in web server in a few seconds.
* Connect to [http://localhost:8080/graphiql/][localgrahiql]
     * The graphiql interface allows you to test your graphql server, thanks to the graphiql-spring-boot-starter project dependency. You can of course remove it from a production server

Enjoy...


To help you, here are some graphql queries you can try:

	{
	  bookById(id: "book-2") {
	    name
	    pageCount
	  }
	}
Or 

	{
	  bookById(id: "book-3") {
	    name
	    pageCount
	    author {
	      firstName
	      lastName
	    }
	  }
	}

[localgrahiql]: http://localhost:8080/graphiql/
