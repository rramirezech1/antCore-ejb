/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.UsuarioGrupoSeguridad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rrami
 */
@Local
public interface UsuarioGrupoSeguridadFacadeLocal {

    void create(UsuarioGrupoSeguridad usuarioGrupoSeguridad);

    void edit(UsuarioGrupoSeguridad usuarioGrupoSeguridad);

    void remove(UsuarioGrupoSeguridad usuarioGrupoSeguridad);

    UsuarioGrupoSeguridad find(Object id);

    List<UsuarioGrupoSeguridad> findAll();

    List<UsuarioGrupoSeguridad> findRange(int[] range);

    int count();
    
}
