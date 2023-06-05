package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    private int ISBN;
    private String author;


    public Book() {
    }

    public Book(int ISBN, String author) {
        this.ISBN = ISBN;
        this.author = author;
    }

    @JsonProperty("ISBN")
    public int getISBN() {
        return ISBN;
    }

    @JsonProperty("ISBN")
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", author='" + author + '\'' +
                '}';
    }
}
