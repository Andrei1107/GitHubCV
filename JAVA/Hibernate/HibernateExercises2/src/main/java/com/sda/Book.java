package com.sda;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Book")
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "title")
    private String name;

    @Column(name = "author")
    private String author;


    @Column(name = "publisher")
    private String publisher;

    @Column(name = "NoBooks")
    private int noOfBooks;

    public Book() {
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return getId()+" \n "+ getAuthor()+" "+getName()+" "
                +getPublisher()+" "+getNoOfBooks()+ " \n";
    }
}
