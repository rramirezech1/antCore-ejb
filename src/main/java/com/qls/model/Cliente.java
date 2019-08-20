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
 * @author RAREcheverria
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente.findByNombreCliente", query = "SELECT c FROM Cliente c WHERE c.nombreCliente = :nombreCliente")
    , @NamedQuery(name = "Cliente.findByApellidoCliente", query = "SELECT c FROM Cliente c WHERE c.apellidoCliente = :apellidoCliente")
    , @NamedQuery(name = "Cliente.findByDireccionCliente", query = "SELECT c FROM Cliente c WHERE c.direccionCliente = :direccionCliente")
    , @NamedQuery(name = "Cliente.findByTelCliente", query = "SELECT c FROM Cliente c WHERE c.telCliente = :telCliente")
    , @NamedQuery(name = "Cliente.findByEMailCliente", query = "SELECT c FROM Cliente c WHERE c.eMailCliente = :eMailCliente")
    , @NamedQuery(name = "Cliente.findByNitCliente", query = "SELECT c FROM Cliente c WHERE c.nitCliente = :nitCliente")
    , @NamedQuery(name = "Cliente.findByRazonSocial", query = "SELECT c FROM Cliente c WHERE c.razonSocial = :razonSocial")
    , @NamedQuery(name = "Cliente.findByNrcCliente", query = "SELECT c FROM Cliente c WHERE c.nrcCliente = :nrcCliente")
    , @NamedQuery(name = "Cliente.findByGiroCliente", query = "SELECT c FROM Cliente c WHERE c.giroCliente = :giroCliente")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Size(max = 50)
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Size(max = 50)
    @Column(name = "apellidoCliente")
    private String apellidoCliente;
    @Size(max = 250)
    @Column(name = "direccionCliente")
    private String direccionCliente;
    @Size(max = 50)
    @Column(name = "telCliente")
    private String telCliente;
    @Size(max = 75)
    @Column(name = "eMailCliente")
    private String eMailCliente;
    @Size(max = 15)
    @Column(name = "nitCliente")
    private String nitCliente;
    @Size(max = 250)
    @Column(name = "razonSocial")
    private String razonSocial;
    @Size(max = 10)
    @Column(name = "nrcCliente")
    private String nrcCliente;
    @Size(max = 250)
    @Column(name = "giroCliente")
    private String giroCliente;
    @JoinColumn(name = "idDepartamento", referencedColumnName = "idDepartamento")
    @ManyToOne
    private Departamento idDepartamento;
    @JoinColumn(name = "idMunicipio", referencedColumnName = "idMunicipio")
    @ManyToOne
    private Municipio idMunicipio;
    @JoinColumn(name = "idPais", referencedColumnName = "idPais")
    @ManyToOne
    private Pais idPais;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEMailCliente() {
        return eMailCliente;
    }

    public void setEMailCliente(String eMailCliente) {
        this.eMailCliente = eMailCliente;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNrcCliente() {
        return nrcCliente;
    }

    public void setNrcCliente(String nrcCliente) {
        this.nrcCliente = nrcCliente;
    }

    public String getGiroCliente() {
        return giroCliente;
    }

    public void setGiroCliente(String giroCliente) {
        this.giroCliente = giroCliente;
    }

    public Municipio getIdMunicipio() {
         if(idMunicipio == null){
            idMunicipio = new Municipio();
        }
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Pais getIdPais() {
        if(idPais == null){
            idPais = new Pais();
        }
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    public String geteMailCliente() {
        return eMailCliente;
    }

    public void seteMailCliente(String eMailCliente) {
        this.eMailCliente = eMailCliente;
    }

    public Departamento getIdDepartamento() {
        if(idDepartamento == null){
            idDepartamento = new Departamento();
        }
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
