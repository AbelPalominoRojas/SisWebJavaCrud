/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.List;

public abstract class AbstractCrud<T> {

    //Abributos para acceso a DB

    protected Connection connection;
    protected PreparedStatement preparedStatement;
    protected CallableStatement callableStatement;
    protected ResultSet resultSet;
    protected String sqlQuery;

    //Definicion de metodos
    public abstract boolean create(T entity);

    public abstract boolean update(T entity);

    public abstract boolean delete(T entity);

    public abstract T find(T entity);

    public abstract List<T> findAll();

}
