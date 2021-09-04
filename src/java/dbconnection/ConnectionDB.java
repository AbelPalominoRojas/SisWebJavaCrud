/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author Abel
 */
public class ConnectionDB {

    public Connection open() throws Exception {

        //Nombre del driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        //Cadena de conexion
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dbventas";

        //abri la conexion
        return DriverManager.getConnection(url, "admin", "123");
    }

    public void closePreparedStatement(PreparedStatement preparedStatement) throws Exception {
        if (preparedStatement != null) {
            
            //Cerrar la conexion
            if (!preparedStatement.getConnection().isClosed()) {
                preparedStatement.getConnection().close();
            }

            //Cerrar metodo de ejecucion de query (PreparedStatement)
            if (!preparedStatement.isClosed()) {
                preparedStatement.close();
            }
        }
    }
    
    public void closeCallableStatement(CallableStatement callableStatement) throws Exception {
        if (callableStatement != null) {
            
            //Cerrar la conexion
            if (!callableStatement.getConnection().isClosed()) {
                callableStatement.getConnection().close();
            }

            //Cerrar metodo de ejecucion de query (CallableStatement)
            if (!callableStatement.isClosed()) {
                callableStatement.close();
            }
        }
    }
    
     public void closeResultSet(ResultSet resultSet) throws Exception {
        if (resultSet != null) {
            
            //Cerrar (ResultSet)
            if (!resultSet.isClosed()) {
                resultSet.close();
            }
        }
    }
}
