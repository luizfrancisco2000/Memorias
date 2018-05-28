/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Interfaces;

/**
 *
 * @author Chico
 */
public interface InterfaceDAO<T> {

    public abstract String salvar(T classe);

    public abstract String deletar(T classe);

    public abstract String atualizar(T classe);
}
