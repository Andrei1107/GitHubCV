package com.util;

import com.sda.Book;
import com.sda.BorrowedBook;
import com.sda.User;
import com.sda.UserDao;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    private static SessionFactory buildSessionFactory() {

        // load up the configuration using the hibernate.cfg.xml
        Configuration configuration = createConfig();
        // build the registry using the properties in the configuration
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        // build the session factory from the service registry
        return configuration.buildSessionFactory(serviceRegistry);
    }

    private static SessionFactory sessionFactory = buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public static Configuration createConfig() {

        Configuration configuration = new Configuration();
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "toor");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "create-drop");

        configuration.setProperties(settings);
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(BorrowedBook.class);

        return configuration;
    }
}
