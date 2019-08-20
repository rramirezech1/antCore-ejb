/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.UsuarioSeguridad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rrami
 */
@Local
public interface UsuarioSeguridadFacadeLocal {

    void create(UsuarioSeguridad usuarioSeguridad);

    void edit(UsuarioSeguridad usuarioSeguridad);

    void remove(UsuarioSeguridad usuarioSeguridad);

    UsuarioSeguridad find(Object id);

    List<UsuarioSeguridad> findAll();

    List<UsuarioSeguridad> findRange(int[] range);

    int count();
    
    UsuarioSeguridad iniciarSesion(UsuarioSeguridad us);
}
