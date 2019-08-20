/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.GrupoSeguridad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rrami
 */
@Local
public interface GrupoSeguridadFacadeLocal {

    void create(GrupoSeguridad grupoSeguridad);

    void edit(GrupoSeguridad grupoSeguridad);

    void remove(GrupoSeguridad grupoSeguridad);

    GrupoSeguridad find(Object id);

    List<GrupoSeguridad> findAll();

    List<GrupoSeguridad> findRange(int[] range);

    int count();
    
}
