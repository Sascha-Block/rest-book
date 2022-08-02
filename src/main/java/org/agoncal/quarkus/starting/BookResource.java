package org.agoncal.quarkus.starting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.print.Book;
import java.util.List;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getAllBooks()  {
        return List.of(
                new Book(id:1, title:"Understanding Quarkus", author: "Antonio", yearOfPublication:2020, genre:"IT"),
                new Book(id:2, title:"Practising Quarkus", author: "Antonio", yearOfPublication:2020, genre:"IT"),
                new Book(id:3, title:"Effective Java", author: "Josh Blocj", yearOfPublication:2001, genre:"IT"),
                new Book(id:4, title:"Thinking in Java", author: "Bruce Eckel", yearOfPublication:1998, genre:"IT")
        );
    }
}