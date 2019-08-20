/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.Municipio;
import com.antsolutions.antcore.model.Departamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author rrami
 */
@Stateless
public class MunicipioFacade extends AbstractFacade<Municipio> implements MunicipioFacadeLocal {

    @PersistenceContext(unitName = "antCore-ejb.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MunicipioFacade() {
        super(Municipio.class);
    }
    
     @Override
    public List<Municipio> findByDepartamento(Departamento idDepartamento) {
        Query q = em.createNamedQuery("Departamento.findByIdDepartamento");
        q.setParameter("idDepartamento", idDepartamento);
        
        return q.getResultList();
    }
    
}
