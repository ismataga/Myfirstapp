package Aqil.Bootcamp5.association;

import java.util.List;

public class Author extends Person{

    private List<Book> books;


    public Author(int id, String name, String email,List<Book> authors) {
        super(id, name, email);
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

