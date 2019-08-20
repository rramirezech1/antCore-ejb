/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rrami
 */
@Entity
@Table(name = "usuarioGrupoSeguridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioGrupoSeguridad.findAll", query = "SELECT u FROM UsuarioGrupoSeguridad u")
    , @NamedQuery(name = "UsuarioGrupoSeguridad.findByIdUsuarioGrupo", query = "SELECT u FROM UsuarioGrupoSeguridad u WHERE u.idUsuarioGrupo = :idUsuarioGrupo")})
public class UsuarioGrupoSeguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuarioGrupo")
    private Integer idUsuarioGrupo;
    @JoinColumn(name = "idGrupo", referencedColumnName = "idGrupo")
    @ManyToOne
    private GrupoSeguridad idGrupo;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne
    private UsuarioSeguridad idUsuario;

    public UsuarioGrupoSeguridad() {
    }

    public UsuarioGrupoSeguridad(Integer idUsuarioGrupo) {
        this.idUsuarioGrupo = idUsuarioGrupo;
    }

    public Integer getIdUsuarioGrupo() {
        return idUsuarioGrupo;
    }

    public void setIdUsuarioGrupo(Integer idUsuarioGrupo) {
        this.idUsuarioGrupo = idUsuarioGrupo;
    }

    public GrupoSeguridad getIdGrupo() {
        if(idGrupo == null){
            idGrupo = new GrupoSeguridad();
        }
        return idGrupo;
    }

    public void setIdGrupo(GrupoSeguridad idGrupo) {
        this.idGrupo = idGrupo;
    }

    public UsuarioSeguridad getIdUsuario() {
        if(idUsuario == null){
            idUsuario = new UsuarioSeguridad();
        }
        return idUsuario;
    }

    public void setIdUsuario(UsuarioSeguridad idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioGrupo != null ? idUsuarioGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioGrupoSeguridad)) {
            return false;
        }
        UsuarioGrupoSeguridad other = (UsuarioGrupoSeguridad) object;
        if ((this.idUsuarioGrupo == null && other.idUsuarioGrupo != null) || (this.idUsuarioGrupo != null && !this.idUsuarioGrupo.equals(other.idUsuarioGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.UsuarioGrupoSeguridad[ idUsuarioGrupo=" + idUsuarioGrupo + " ]";
    }
    
}
