package com.sda;

import com.util.Controller;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserDao {

    private Transaction tx = null;
    private Session session;
    Controller controller = new Controller();


    private static final Logger logger = Logger.getLogger(UserDao.class.getName());

    public void createUser(User user) {
        try {
            startOperation();
            session.save(user);
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error creating user " + user);
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    public void createBook(Book book) {
        try {
            startOperation();
            session.save(book);
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error creating book" + book);
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }


    public void createBorrowBook(BorrowedBook borrowedBook) {
        try {
            startOperation();
            session.save(borrowedBook);
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error creating borrowedBook " + borrowedBook.getTitle());
        } finally {
            if (session != null) {
                session.close();
            }
        }


    }


    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<User>();
        String hql = "FROM  User";



        try {
            startOperation();

            Query query = session.createQuery(hql, User.class);
            users = query.getResultList();
            int result = query.executeUpdate();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error finding users using " + hql);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return users;
    }

    public List selectUserName() {
        List usernames = new ArrayList();


        try {
            startOperation();
            Query query = session.createQuery("SELECT username FROM User");

            usernames = query.getResultList();

            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error loading all userNames using " + "findUsersName");
        } finally {
            if (session != null) {
                session.close();
            }
        }


        return usernames;

    }


    public boolean verifyIfUserExist(String username) {
        List users = selectUserName();
        startOperation();


        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(username)) {
                return true;
            } else {
                return false;
            }

        }


        return false;

    }


    public void deleteAll() {
        String hql = "DELETE  FROM User";

        try {
            startOperation();
            Query query = session.createQuery(hql);
            int result = query.executeUpdate();
            tx.commit();


        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Could'n delete users using " + hql);
        } finally {
            if (session != null) {
                session.close();
            }

        }


    }


    public List<Book> showAllBooks() {
        List<Book> allBooks = new ArrayList<Book>();
        String hql = "FROM Book";

        try {
            startOperation();
            Query query = session.createQuery(hql, Book.class);
            allBooks = query.getResultList();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error loading books  with " + hql);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return allBooks;

    }

    public void updateNoOfBooks(List<Book> books) {


    }

    // id author title noOfBooks publisher
    public Book selectBookById(Long id) {


        String hql = "FROM Book WHERE id= :id";
        Book book = new Book();

        List<Book> borrowedBooks = new ArrayList<>();

        try {


            startOperation();
            Query query = session.createQuery(hql, Book.class);
            query.setParameter("id", id);
            borrowedBooks = query.getResultList();


            book.setName(borrowedBooks.get(0).getName());
            book.setPublisher(borrowedBooks.get(0).getPublisher());
            book.setAuthor(borrowedBooks.get(0).getAuthor());
            book.setId(borrowedBooks.get(0).getId());
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Error loading book using " + hql);
        } finally {
            if (session != null) {
                session.close();
            }

        }

        return book;
    }


    public void updateDB(Long id) {
        String sql = "UPDATE book  set NoBooks = NoBooks -1 where id = :id";

        try {
            startOperation();
            Query query = session.createSQLQuery(sql);

            query.setParameter("id", id);
            int result = query.executeUpdate();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("Cannot update db with hql " + sql);

        } finally {
            if (session != null) {
                session.close();
            }
        }

    }


    public void startOperation() {

        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();


    }


}
