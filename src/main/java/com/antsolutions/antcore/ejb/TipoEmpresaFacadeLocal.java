/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.TipoEmpresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rrami
 */
@Local
public interface TipoEmpresaFacadeLocal {

    void create(TipoEmpresa tipoEmpresa);

    void edit(TipoEmpresa tipoEmpresa);

    void remove(TipoEmpresa tipoEmpresa);

    TipoEmpresa find(Object id);

    List<TipoEmpresa> findAll();

    List<TipoEmpresa> findRange(int[] range);

    int count();
    
}
