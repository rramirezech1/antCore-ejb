/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author sofis
 */
@Entity
@Table(name="municipios")
@NamedQuery(name = "Municipio.getAll", query = "SELECT m FROM Municipio m")
public class Municipio {
    
    @Id
    @Column(name="id_mun")
    private Integer id;
    
    @Column(name="nombre_mun")
    private String nombre;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_dpto")
    private Departamento depto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }
    
    
    
}
