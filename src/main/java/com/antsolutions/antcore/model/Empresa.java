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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rrami
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findByIdEmpresa", query = "SELECT e FROM Empresa e WHERE e.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "Empresa.findByNombreEmpresa", query = "SELECT e FROM Empresa e WHERE e.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Empresa.findByDireccionEmpresa", query = "SELECT e FROM Empresa e WHERE e.direccionEmpresa = :direccionEmpresa")
    , @NamedQuery(name = "Empresa.findByContactoEmpresa", query = "SELECT e FROM Empresa e WHERE e.contactoEmpresa = :contactoEmpresa")
    , @NamedQuery(name = "Empresa.findByTelContactoEmpresa", query = "SELECT e FROM Empresa e WHERE e.telContactoEmpresa = :telContactoEmpresa")
    , @NamedQuery(name = "Empresa.findByEMailContacto", query = "SELECT e FROM Empresa e WHERE e.eMailContacto = :eMailContacto")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpresa")
    private Integer idEmpresa;
    @Size(max = 250)
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Size(max = 150)
    @Column(name = "direccionEmpresa")
    private String direccionEmpresa;
    @Size(max = 150)
    @Column(name = "contactoEmpresa")
    private String contactoEmpresa;
    @Size(max = 50)
    @Column(name = "telContactoEmpresa")
    private String telContactoEmpresa;
    @Size(max = 150)
    @Column(name = "eMailContacto")
    private String eMailContacto;
    @JoinColumn(name = "idPais", referencedColumnName = "idPais")
    @ManyToOne
    private Pais idPais;
    @JoinColumn(name = "idTipoEmpresa", referencedColumnName = "idTipoEmpresa")
    @ManyToOne
    private TipoEmpresa idTipoEmpresa;

    public Empresa() {
    }

    public Empresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getContactoEmpresa() {
        return contactoEmpresa;
    }

    public void setContactoEmpresa(String contactoEmpresa) {
        this.contactoEmpresa = contactoEmpresa;
    }

    public String getTelContactoEmpresa() {
        return telContactoEmpresa;
    }

    public void setTelContactoEmpresa(String telContactoEmpresa) {
        this.telContactoEmpresa = telContactoEmpresa;
    }

    public String getEMailContacto() {
        return eMailContacto;
    }

    public void setEMailContacto(String eMailContacto) {
        this.eMailContacto = eMailContacto;
    }

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    public TipoEmpresa getIdTipoEmpresa() {
        return idTipoEmpresa;
    }

    public void setIdTipoEmpresa(TipoEmpresa idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.Empresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
