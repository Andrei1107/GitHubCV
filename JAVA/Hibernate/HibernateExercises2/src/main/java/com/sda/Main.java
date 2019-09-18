package com.sda;

import com.util.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        Controller controller = new Controller();
        Date date = new Date();

        controller.loginOrRegister();

        createBooks(userDao);

        controller.menu();

        //userDao.deleteAll();
        // controller.loginOrRegister();


    }

    private static void createBooks(UserDao userDao) {
        Book book = new Book();
        book.setName("Idiotul");
        book.setAuthor("Dostoievsky");
        book.setPublisher("Polirom");
        book.setNoOfBooks(15);

        Book book2 = new Book();
        book2.setName("Amintiri din casa mortilor");
        book2.setAuthor("Dostoievsky");
        book2.setPublisher("Polirom");
        book2.setNoOfBooks(10);

        Book book3 = new Book();
        book3.setName("Fratii Karamazov");
        book3.setAuthor("Dostoievsky");
        book3.setPublisher("Polirom");
        book3.setNoOfBooks(20);

        List<Book> books=new ArrayList<Book>();
        books.add(book);
        books.add(book2);
        books.add(book3);

        for(int i=0;i<books.size();i++){
            userDao.createBook(books.get(i));
        }
    }

}
