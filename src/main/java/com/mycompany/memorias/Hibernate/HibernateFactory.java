package com.mycompany.memorias.Hibernate;

import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {

    private static SessionFactory sessionFactory;

    /**
     * * Initializes the Hibernate SessionFactory.
     */
    public static synchronized void initSessionFactory() {
        if (getSessionFactory() != null) {
            return;
        }
        try {
            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (HibernateException he) {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory != null) {
            return sessionFactory;
        } else {
            try {
                //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
                sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            } catch (HibernateException he) {
                System.err.println("Error creating Session: " + he);
                throw new ExceptionInInitializerError(he);
            }
        }
        return sessionFactory;
    }

    public static void closeSession() {
        if (sessionFactory != null) {
            try {
                sessionFactory.close();
            } catch (HibernateException ignored) {
                System.err.println("Couldn't close SessionFactory" + ignored);
            }
        }
    }
}
