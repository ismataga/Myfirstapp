package Aqil.Bootcamp5.association;

import java.time.LocalDate;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private LocalDate year;
    private List<Author> authors;

    public Book(int id, String name, LocalDate year, List<Author> authors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
