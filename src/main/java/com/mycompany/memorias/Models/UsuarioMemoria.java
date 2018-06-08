/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Models;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author vinic
 */
@Entity
@Table(name = "usuariomemoria")
public class UsuarioMemoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "memoria")
    private Memorias memorias;

    public UsuarioMemoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Memorias getMemorias() {
        return memorias;
    }

    public void setMemorias(Memorias memorias) {
        this.memorias = memorias;
    }

}
