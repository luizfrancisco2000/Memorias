/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chico
 */
@Entity
@Table(name="memoria")
@XmlRootElement
public class Memorias implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
        
    private boolean publico;
    
    @Column(unique=true)
    private String nome;

    private Date dataDoFato;
    
    private String descricao;
    /*
        @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    */

    public Memorias() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDoFato() {
        return dataDoFato;
    }

    public void setDataDoFato(Date dataDoFato) {
        this.dataDoFato = dataDoFato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}