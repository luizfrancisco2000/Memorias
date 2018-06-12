/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Chico
 */
@Entity
@Table(name = "memorias")
public class Memorias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private boolean publico;

    @Column(unique = true)
    private String nome;

    @Temporal(TemporalType.DATE)
    private Date dataDoFato;

    private String descricao;
    
    @OneToMany(cascade = ALL, mappedBy = "memorias")
    private List<UsuarioMemoria> usuarios;

    @OneToMany(mappedBy = "memorias")
    private List<MemoriaGrupo> grupos;

    @OneToMany(mappedBy = "memorias")
    private List<UsuarioComentaMemoria> comentarios;

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

    public List<UsuarioMemoria> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioMemoria> usuarios) {
        this.usuarios = usuarios;
    }

    public List<MemoriaGrupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<MemoriaGrupo> grupos) {
        this.grupos = grupos;
    }

    public List<UsuarioComentaMemoria> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<UsuarioComentaMemoria> comentarios) {
        this.comentarios = comentarios;
    }

}
