/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rrami
 */
@Entity
@Table(name = "grupoSeguridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoSeguridad.findAll", query = "SELECT g FROM GrupoSeguridad g")
    , @NamedQuery(name = "GrupoSeguridad.findByIdGrupo", query = "SELECT g FROM GrupoSeguridad g WHERE g.idGrupo = :idGrupo")
    , @NamedQuery(name = "GrupoSeguridad.findByCodigoGrupo", query = "SELECT g FROM GrupoSeguridad g WHERE g.codigoGrupo = :codigoGrupo")
    , @NamedQuery(name = "GrupoSeguridad.findByNombreGrupo", query = "SELECT g FROM GrupoSeguridad g WHERE g.nombreGrupo = :nombreGrupo")})
public class GrupoSeguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGrupo")
    private Integer idGrupo;
    @Size(max = 50)
    @Column(name = "codigoGrupo")
    private String codigoGrupo;
    @Size(max = 50)
    @Column(name = "nombreGrupo")
    private String nombreGrupo;
    @OneToMany(mappedBy = "idGrupo")
    private Collection<UsuarioGrupoSeguridad> usuarioGrupoSeguridadCollection;

    public GrupoSeguridad() {
    }

    public GrupoSeguridad(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    @XmlTransient
    public Collection<UsuarioGrupoSeguridad> getUsuarioGrupoSeguridadCollection() {
        return usuarioGrupoSeguridadCollection;
    }

    public void setUsuarioGrupoSeguridadCollection(Collection<UsuarioGrupoSeguridad> usuarioGrupoSeguridadCollection) {
        this.usuarioGrupoSeguridadCollection = usuarioGrupoSeguridadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGrupo != null ? idGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoSeguridad)) {
            return false;
        }
        GrupoSeguridad other = (GrupoSeguridad) object;
        if ((this.idGrupo == null && other.idGrupo != null) || (this.idGrupo != null && !this.idGrupo.equals(other.idGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.GrupoSeguridad[ idGrupo=" + idGrupo + " ]";
    }
    
}
