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
 * @author rrami
 */
@Entity
@Table(name = "sucursal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sucursal.findAll", query = "SELECT s FROM Sucursal s")
    , @NamedQuery(name = "Sucursal.findByIdSucursal", query = "SELECT s FROM Sucursal s WHERE s.idSucursal = :idSucursal")
    , @NamedQuery(name = "Sucursal.findByNombreSucursal", query = "SELECT s FROM Sucursal s WHERE s.nombreSucursal = :nombreSucursal")
    , @NamedQuery(name = "Sucursal.findByIdPaisSucursal", query = "SELECT s FROM Sucursal s WHERE s.idPaisSucursal = :idPaisSucursal")
    , @NamedQuery(name = "Sucursal.findByDireccionSucursal", query = "SELECT s FROM Sucursal s WHERE s.direccionSucursal = :direccionSucursal")
    , @NamedQuery(name = "Sucursal.findByContactoSucursal", query = "SELECT s FROM Sucursal s WHERE s.contactoSucursal = :contactoSucursal")
    , @NamedQuery(name = "Sucursal.findByTelContactoSucursal", query = "SELECT s FROM Sucursal s WHERE s.telContactoSucursal = :telContactoSucursal")
    , @NamedQuery(name = "Sucursal.findByEMailContactoSucursal", query = "SELECT s FROM Sucursal s WHERE s.eMailContactoSucursal = :eMailContactoSucursal")
    , @NamedQuery(name = "Sucursal.findByIdEmpresa", query = "SELECT s FROM Sucursal s WHERE s.idEmpresa = :idEmpresa")})
public class Sucursal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSucursal")
    private Integer idSucursal;
    @Size(max = 250)
    @Column(name = "nombreSucursal")
    private String nombreSucursal;
    @Column(name = "idPaisSucursal")
    private Integer idPaisSucursal;
    @Column(name = "direccionSucursal")
    private Integer direccionSucursal;
    @Size(max = 150)
    @Column(name = "contactoSucursal")
    private String contactoSucursal;
    @Size(max = 50)
    @Column(name = "telContactoSucursal")
    private String telContactoSucursal;
    @Size(max = 150)
    @Column(name = "eMailContactoSucursal")
    private String eMailContactoSucursal;
    @Column(name = "idEmpresa")
    private Integer idEmpresa;

    public Sucursal() {
    }

    public Sucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public Integer getIdPaisSucursal() {
        return idPaisSucursal;
    }

    public void setIdPaisSucursal(Integer idPaisSucursal) {
        this.idPaisSucursal = idPaisSucursal;
    }

    public Integer getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(Integer direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public String getContactoSucursal() {
        return contactoSucursal;
    }

    public void setContactoSucursal(String contactoSucursal) {
        this.contactoSucursal = contactoSucursal;
    }

    public String getTelContactoSucursal() {
        return telContactoSucursal;
    }

    public void setTelContactoSucursal(String telContactoSucursal) {
        this.telContactoSucursal = telContactoSucursal;
    }

    public String getEMailContactoSucursal() {
        return eMailContactoSucursal;
    }

    public void setEMailContactoSucursal(String eMailContactoSucursal) {
        this.eMailContactoSucursal = eMailContactoSucursal;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSucursal != null ? idSucursal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursal)) {
            return false;
        }
        Sucursal other = (Sucursal) object;
        if ((this.idSucursal == null && other.idSucursal != null) || (this.idSucursal != null && !this.idSucursal.equals(other.idSucursal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.Sucursal[ idSucursal=" + idSucursal + " ]";
    }
    
}
