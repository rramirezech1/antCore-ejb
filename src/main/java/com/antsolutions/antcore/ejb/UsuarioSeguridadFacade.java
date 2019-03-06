/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.UsuarioSeguridad;
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
public class UsuarioSeguridadFacade extends AbstractFacade<UsuarioSeguridad> implements UsuarioSeguridadFacadeLocal {

    @PersistenceContext(unitName = "antCore-ejb.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioSeguridadFacade() {
        super(UsuarioSeguridad.class);
    }
    
    @Override
    public UsuarioSeguridad iniciarSesion(UsuarioSeguridad us){
        UsuarioSeguridad usuario = null;
        String consulta;
        try {
            consulta ="SELECT u FROM UsuarioSeguridad u.usuarioLogin =?1 and u.usuarioPassword =?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, us.getUsuarioLogin());
            query.setParameter(2, us.getUsuarioPassword());
            
            List<UsuarioSeguridad> lista = query.getResultList();
            if (!lista.isEmpty()){
                usuario = lista.get(0);
            }    
        }catch (Exception e){
            throw e;
        }finally{
            em.close();
        }
        
        return usuario;
    }
    
}
