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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RAREcheverria
 */
@Entity
@Table(name = "catalogoProductos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoProductos.findAll", query = "SELECT c FROM CatalogoProductos c")
    , @NamedQuery(name = "CatalogoProductos.findByIdProducto", query = "SELECT c FROM CatalogoProductos c WHERE c.idProducto = :idProducto")
    , @NamedQuery(name = "CatalogoProductos.findByCodigoProducto", query = "SELECT c FROM CatalogoProductos c WHERE c.codigoProducto = :codigoProducto")
    , @NamedQuery(name = "CatalogoProductos.findByProductoPadre", query = "SELECT c FROM CatalogoProductos c WHERE c.productoPadre = :productoPadre")
    , @NamedQuery(name = "CatalogoProductos.findByDescripcionProducto", query = "SELECT c FROM CatalogoProductos c WHERE c.descripcionProducto = :descripcionProducto")})
public class CatalogoProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProducto")
    private Integer idProducto;
    @Size(max = 25)
    @Column(name = "codigoProducto")
    private String codigoProducto;
    @Column(name = "productoPadre")
    private Integer productoPadre;
    @Size(max = 250)
    @Column(name = "descripcionProducto")
    private String descripcionProducto;

    public CatalogoProductos() {
    }

    public CatalogoProductos(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getProductoPadre() {
        return productoPadre;
    }

    public void setProductoPadre(Integer productoPadre) {
        this.productoPadre = productoPadre;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoProductos)) {
            return false;
        }
        CatalogoProductos other = (CatalogoProductos) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.CatalogoProductos[ idProducto=" + idProducto + " ]";
    }
    
}
