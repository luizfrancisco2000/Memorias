/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "memoriagrupo")
public class MemoriaGrupo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "grupo")
    private Grupo grupo;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "memorias")
    private Memorias memoria;

    public MemoriaGrupo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Memorias getMemoria() {
        return memoria;
    }

    public void setMemoria(Memorias memoria) {
        this.memoria = memoria;
    }

}
