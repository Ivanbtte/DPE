/*
Autor:Ramiro
Fecha creación:08/03/2022
Fecha actualización: 09/03/2022
Descripción: Se crea una clase de nombre Conexión.

 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author labtw08
 */
public class Conexion {

    private Connection connection;
    private String url = "jdbc:postgresql://localhost/dpe";
    private String user = "postgres";
    private String pwd = "lenninvc369";

    Connection conection;

    public Connection Conecta() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, pwd);
            System.out.println("conexión establecida");

        } catch (Exception ex) {
            System.out.println("Error al conectar:" + ex.getMessage());
        }
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
            System.out.println("Desconexión establecida");

        } catch (Exception ex) {
            System.out.println("Error al desconectar:" + ex.getMessage());
        }
    }

    public Connection getConection() {
        return connection;
    }

   
}
