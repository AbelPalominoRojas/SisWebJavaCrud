/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;


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
        return DriverManager.getConnection(url, "admin","123");
    }
}
