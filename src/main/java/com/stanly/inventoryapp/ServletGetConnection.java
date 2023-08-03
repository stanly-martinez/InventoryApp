package com.stanly.inventoryapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import com.stanly.inventoryapp.dao.ConexionDB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletGetConnection", value = "/get-connection")
public class ServletGetConnection extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            //get connection
            Connection conexion = ConexionDB.getConexion();

            //config response http
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            //verify connection
            if (conexion != null){
                out.println("<h1>Conexion exitosa a la DB</h1>");
            } else {
                out.println("<h1>Errror en la conexion a la DB</h1>");
            }

            //close connection
            if (conexion != null){
                conexion.close();
            }

        } catch (SQLException e) {
            //errors
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
