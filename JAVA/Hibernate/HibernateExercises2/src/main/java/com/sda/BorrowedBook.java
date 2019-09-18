package com.sda;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity(name = "BorrowedBook")
@Table(name = "borrowedbook")
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "dateBorrow")
    private Date dateBorrow;

    @Column(name = "username")
    private String username;


    public BorrowedBook() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    @Override
    public String toString() {
        return getAuthor()+" "+getTitle()+" "+getPublisher();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BorrowedBook that = (BorrowedBook) o;
        return id.equals(that.id) &&
                title.equals(that.title) &&
                author.equals(that.author) &&
                publisher.equals(that.publisher) &&
                dateBorrow.equals(that.dateBorrow) &&
                username.equals(that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publisher, dateBorrow, username);
    }
}
