package com.util;

import com.sda.Book;
import com.sda.UserDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {


    public Book borrow_Book(Long id) {

        UserDao userDao = new UserDao();
        Controller controller = new Controller();


        List<Book> borrowedBooks = new ArrayList<>();
        Book book=new Book();
        if (id != 0) {

            book.setId(userDao.selectBookById(id).getId());
            book.setAuthor(userDao.selectBookById(id).getAuthor());
            book.setName(userDao.selectBookById(id).getName());
            book.setPublisher(userDao.selectBookById(id).getPublisher());


         //borrowedBooks.add(userDao.selectBookById(id));

        }



            return book;
    }


    public void showAllBooks() {
        UserDao userDao = new UserDao();
        List allBooks = new ArrayList();
        allBooks = userDao.showAllBooks();

        System.out.println(allBooks);

    }


}
