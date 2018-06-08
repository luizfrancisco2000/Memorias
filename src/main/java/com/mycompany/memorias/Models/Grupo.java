package com.mycompany.memorias.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "grupo")
public class Grupo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    private boolean publico;

    @OneToMany(cascade = ALL, mappedBy = "grupo")
    private List<UsuarioGrupo> usuarios;

    @OneToMany(cascade = ALL, mappedBy = "grupo")
    private List<UsuariosGrupo> gruposusuarios;

    @OneToMany(cascade = ALL, mappedBy = "grupo")
    private List<MemoriaGrupo> memorias;
    @OneToMany(cascade = ALL, mappedBy = "grupo")
    private List<DocumentosGrupo> documentos;

    @OneToMany(cascade = ALL, mappedBy = "grupo")
    private List<UsuarioComentaGrupo> comentarios;

    public Grupo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public List<UsuarioGrupo> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioGrupo> usuarios) {
        this.usuarios = usuarios;
    }

    public List<UsuariosGrupo> getGruposusuarios() {
        return gruposusuarios;
    }

    public void setGruposusuarios(List<UsuariosGrupo> gruposusuarios) {
        this.gruposusuarios = gruposusuarios;
    }

    public List<MemoriaGrupo> getMemorias() {
        return memorias;
    }

    public void setMemorias(List<MemoriaGrupo> memorias) {
        this.memorias = memorias;
    }

    public List<DocumentosGrupo> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentosGrupo> documentos) {
        this.documentos = documentos;
    }

    public List<UsuarioComentaGrupo> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<UsuarioComentaGrupo> comentarios) {
        this.comentarios = comentarios;
    }

}
