/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import models.Categoria;
import dao.CategoriaDao;

public class CategoriaService {

    public List<Categoria> findAll() throws Exception {
        return new CategoriaDao().findAll();
    }
}
