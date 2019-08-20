/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.TipoEmpresa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rrami
 */
@Stateless
public class TipoEmpresaFacade extends AbstractFacade<TipoEmpresa> implements TipoEmpresaFacadeLocal {

    @PersistenceContext(unitName = "antCore-ejb.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoEmpresaFacade() {
        super(TipoEmpresa.class);
    }
    
}
