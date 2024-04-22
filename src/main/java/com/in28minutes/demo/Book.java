package com.in28minutes.demo;

public class Book {
    long id;
    String name;
    String author;

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Book(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
