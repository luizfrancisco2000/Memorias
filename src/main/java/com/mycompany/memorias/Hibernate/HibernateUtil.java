/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Hibernate;

import com.mycompany.memorias.Interfaces.InterfaceDAO;
import org.hibernate.Session;

/**
 *
 * @author Chico
 */
public class HibernateUtil<T> implements InterfaceDAO<T> {

    
private Session session;
private String message = "";


    public String salvar(T classe) {
        session =  HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(classe);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            message = e.getMessage();
        } finally {
            session.close();
        }
        return message;
    }

    public String deletar(T classe) {
        session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            this.session.flush();
            this.session.clear();
            session.delete(classe);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            message = e.getMessage();
        } finally {
            session.close();
        }
        return message;
    }

    public String atualizar(T classe) {
        session =HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(classe);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            message = e.getMessage();
        } finally {
            session.close();
        }
        return message;
    }
}
