package com.stanly.inventoryapp.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    //DB connection
    private static final String URL = "jdbc:postgresql://localhost:5432/Inventory";
    private static final String USER = "pizzaroni";
    private static final String PASSWORD = "12345678";

    private static Connection conexion;

    //Get connection method
    public static Connection getConexion() throws SQLException {
        if(conexion == null || conexion.isClosed()) {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conexion;
    }

    //Close connection method
    public static void closeConexion() throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close();
        }
    }


}
