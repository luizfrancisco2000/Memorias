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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Chico
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    private String email;
    @Column(unique = true)
    private String nome;

    @Temporal(TemporalType.DATE)
    private Date dataNasc;

    private String nascionalidade;

    private String senha;

    @OneToMany(cascade = ALL, mappedBy = "usuario")
    private List<UsuarioGrupo> grupos;

    @OneToMany(cascade = ALL, mappedBy = "usuario")
    private List<UsuariosGrupo> usuariosgrupos;

    @OneToMany(cascade = ALL, mappedBy = "usuario")
    private List<UsuarioMemoria> memorias;

    @OneToMany(cascade = ALL, mappedBy = "usuario")
    private List<DocumentoUsuario> documentos;

    @OneToMany(cascade = ALL, mappedBy = "usuario")
    private List<UsuarioComentaGrupo> comentariosGrupos;

    @OneToMany(cascade = ALL, mappedBy = "usuario")
    private List<UsuarioComentaMemoria> comentariosMemorias;

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

    public List<UsuarioGrupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<UsuarioGrupo> grupos) {
        this.grupos = grupos;
    }

    public List<UsuariosGrupo> getUsuariosgrupos() {
        return usuariosgrupos;
    }

    public void setUsuariosgrupos(List<UsuariosGrupo> usuariosgrupos) {
        this.usuariosgrupos = usuariosgrupos;
    }

    public List<UsuarioMemoria> getMemorias() {
        return memorias;
    }

    public void setMemorias(List<UsuarioMemoria> memorias) {
        this.memorias = memorias;
    }

    public List<DocumentoUsuario> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoUsuario> documentos) {
        this.documentos = documentos;
    }

    public List<UsuarioComentaGrupo> getComentariosGrupos() {
        return comentariosGrupos;
    }

    public void setComentariosGrupos(List<UsuarioComentaGrupo> comentariosGrupos) {
        this.comentariosGrupos = comentariosGrupos;
    }

    public List<UsuarioComentaMemoria> getComentariosMemorias() {
        return comentariosMemorias;
    }

    public void setComentariosMemorias(List<UsuarioComentaMemoria> comentariosMemorias) {
        this.comentariosMemorias = comentariosMemorias;
    }

}
