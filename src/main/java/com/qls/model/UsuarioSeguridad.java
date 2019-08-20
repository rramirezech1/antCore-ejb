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
@Table(name = "usuarioSeguridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioSeguridad.findAll", query = "SELECT u FROM UsuarioSeguridad u")
    , @NamedQuery(name = "UsuarioSeguridad.findByIdUsuario", query = "SELECT u FROM UsuarioSeguridad u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "UsuarioSeguridad.findByNombreUsuario", query = "SELECT u FROM UsuarioSeguridad u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "UsuarioSeguridad.findByApellidoUsuario", query = "SELECT u FROM UsuarioSeguridad u WHERE u.apellidoUsuario = :apellidoUsuario")
    , @NamedQuery(name = "UsuarioSeguridad.findByUsuarioLogin", query = "SELECT u FROM UsuarioSeguridad u WHERE u.usuarioLogin = :usuarioLogin")
    , @NamedQuery(name = "UsuarioSeguridad.findByUsuarioPassword", query = "SELECT u FROM UsuarioSeguridad u WHERE u.usuarioPassword = :usuarioPassword")})
public class UsuarioSeguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Size(max = 50)
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Size(max = 50)
    @Column(name = "apellidoUsuario")
    private String apellidoUsuario;
    @Size(max = 50)
    @Column(name = "usuarioLogin")
    private String usuarioLogin;
    @Size(max = 50)
    @Column(name = "usuarioPassword")
    private String usuarioPassword;

    public UsuarioSeguridad() {
    }

    public UsuarioSeguridad(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioSeguridad)) {
            return false;
        }
        UsuarioSeguridad other = (UsuarioSeguridad) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antsolutions.antcore.model.UsuarioSeguridad[ idUsuario=" + idUsuario + " ]";
    }
    
}
