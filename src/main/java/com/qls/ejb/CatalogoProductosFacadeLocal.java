/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antsolutions.antcore.ejb;

import com.antsolutions.antcore.model.CatalogoProductos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RAREcheverria
 */
@Local
public interface CatalogoProductosFacadeLocal {

    void create(CatalogoProductos catalogoProductos);

    void edit(CatalogoProductos catalogoProductos);

    void remove(CatalogoProductos catalogoProductos);

    CatalogoProductos find(Object id);

    List<CatalogoProductos> findAll();

    List<CatalogoProductos> findRange(int[] range);

    int count();
    
}
