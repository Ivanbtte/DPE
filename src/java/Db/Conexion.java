/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 08/03/2022
Fecha actualización: 09/03/2022
Descripción: Clase para realizar conexion a una base de datos y su main
 */
package Db;

import java.sql.*;


public class Conexion {

    private Connection connection = null;
    private final String url;
    private final String user;
    private final String pwd;
  

    public Conexion() {
        this.url = "jdbc:postgresql://localhost/DPE";
        this.user = "postgres";
        this.pwd = "87691520";
    }

    public Connection conecta() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, pwd);
            System.out.println("Conexion exitosa");

        } catch (Exception ex) {
            System.out.println("Error al conectar:" + ex.getMessage());
        }
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
            System.out.println("Desconexion exitosa");
        } catch (Exception ex) {
            System.out.println("Error al desconectar:" + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        
        Conexion c= new Conexion();
        c.conecta();
        c.desconectar();
    }
}
