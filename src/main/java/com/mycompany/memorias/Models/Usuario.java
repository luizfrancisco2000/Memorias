/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chico
 */
@Entity
@Table(name="usuario")
@XmlRootElement
public class Usuario implements Serializable {
    @Id
    private String email;
    @Column(unique=true)
    private String nome;
    
    private Date dataNasc;
    
    private String nascionalidade;
    
    private String senha;

    @Transient
    private static Usuario getInstance;
    
    /*@OneToMany(cascade=ALL,mappedBy="usuario")
    private List<Memorias> memorias;*/
    
    /*@OneToMany(cascade=ALL,mappedBy="usuario")
    private List<Grupo> Grupo;*/
    
    
    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public static Usuario getInstance() {
        if (getInstance == null) {
            getInstance = new Usuario();
        }
        return getInstance;
    }
}
