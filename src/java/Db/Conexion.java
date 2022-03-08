/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 08/03/2022
Fecha actualización: 08/03/2022
Descripción: Clase para realizar conexion a una base de datos
 */
package Db;

import java.sql.*;


public class Conexion {

    private Connection connection = null;
    private final String url;
    private final String user;
    private final String pwd;

    public Conexion(Connection connection, String url, String user, String pwd) {
        this.connection = connection;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    public Connection conecta() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "Ivan87691520");

        } catch (Exception ex) {
            System.out.println("Error al conectar:" + ex.getMessage());
        }
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
        } catch (Exception ex) {
            System.out.println("Error al desconectar:" + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {

    }
}
