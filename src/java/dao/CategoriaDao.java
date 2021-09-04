/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbconnection.ConnectionDB;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import models.Categoria;

public class CategoriaDao extends AbstractCrud<Categoria> {

    @Override
    public boolean create(Categoria entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Categoria entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Categoria entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria find(Categoria entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> findAll() throws Exception {
        List<Categoria> categorias = new ArrayList<>();

        try {
            //Query sql o procedimiento almacenado
            sqlQuery = "{CALL dbo.USP_categorias_SelectAll}";
            
            //Abrir la conexion
            connection = new ConnectionDB().open();
            
            //Preparar la consulta sql
            preparedStatement = connection.prepareStatement(sqlQuery);
            
            //Ejecuar la consulta y obtener los datos
            resultSet = preparedStatement.executeQuery();
            
            //Leer los datos obtenidos
            Categoria categoria;
            
            while (resultSet.next()) {                
                categoria = new Categoria();
                
                //Asignar los valores
                categoria.setIdCategoria(resultSet.getInt("idcategoria"));
                categoria.setNombre(resultSet.getString("nombre"));
                categoria.setDescripcion(resultSet.getString("descripcion"));
                
                categorias.add(categoria);
            }
            
        } finally {
            new ConnectionDB().closeResultSet(resultSet);
            new ConnectionDB().closePreparedStatement(preparedStatement);
        }

        return categorias;
    }

}
