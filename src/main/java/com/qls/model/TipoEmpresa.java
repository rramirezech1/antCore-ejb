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
@Table(name = "tipoEmpresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEmpresa.findAll", query = "SELECT t FROM TipoEmpresa t")
    , @NamedQuery(name = "TipoEmpresa.findByIdTipoEmpresa", query = "SELECT t FROM TipoEmpresa t WHERE t.idTipoEmpresa = :idTipoEmpresa")
    , @NamedQuery(name = "TipoEmpresa.findByTipoEmpresa", query = "SELECT t FROM TipoEmpresa t WHERE t.tipoEmpresa = :tipoEmpresa")})
public class TipoEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoEmpresa")
    private Integer idTipoEmpresa;
    @Size(max = 50)
    @Column(name = "tipoEmpresa")
    private String tipoEmpresa;
    @OneToMany(mappedBy = "idTipoEmpresa")
    private Collection<Empresa> empresaCollection;

    public TipoEmpresa() {
    }

    public TipoEmpresa(Integer idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public Integer getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    public void setIdTipoEmpresa(Integer idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @XmlTransient
    public Collection<Empresa> getEmpresaCollection() {
        return empresaCollection;
    }

    public void setEmpresaCollection(Collection<Empresa> empresaCollection) {
        this.empresaCollection = empresaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoEmpresa != null ? idTipoEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEmpresa)) {
            return false;
        }
        TipoEmpresa other = (TipoEmpresa) object;
        if ((this.idTipoEmpresa == null && other.idTipoEmpresa != null) || (this.idTipoEmpresa != null && !this.idTipoEmpresa.equals(other.idTipoEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.TipoEmpresa[ idTipoEmpresa=" + idTipoEmpresa + " ]";
    }
    
}
