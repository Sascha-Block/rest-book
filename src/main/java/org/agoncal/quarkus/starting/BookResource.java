package org.agoncal.quarkus.starting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanding Quarkus", "Antonio", 2020, "IT"),
                new Book(2, "Practising Quarkus", "Antonio", 2020, "IT"),
                new Book(3, "Effective Java", "Josh Blocj", 2001, "IT"),
                new Book(4, "Thinking in Java", "Bruce Eckel", 1998, "IT")
        );
    }
}