/*
Autor:Ramiro
Fecha creación:11/03/2022
Fecha actualización: 11/03/2022
Descripción: Se crea una clase en el paquete model.

 */
package model;

import db.Conexion;
import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labtw08
 */
public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conecta();
            connection = conexion.getConection();
            String sql = "Insert into Usuarios (nombre_usuario,contraseña,nombre,sexo,edad)VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getCodigo());
            ps.setString(2, usuario.getNombreUsuario());
            ps.setString(3, usuario.getContraseña());
            ps.setString(4, usuario.getNombre());
            ps.setString(5, usuario.getSexo());
            ps.setInt(6, usuario.getEdad());
            ps.executeUpdate();
            System.out.println("Correcto");
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void actualizarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conecta();
            connection = conexion.getConnection();
            String sql = "Update usuarios set nombre_usuario=?, contraseña=?, nombre=?, sexo=?, edad=? where codigo=" + usuario.getCodigo() + ";";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getSexo());
            ps.setInt(5, usuario.getEdad());
            ps.executeUpdate();
            System.out.println("Correcto");
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        try {
            conexion = new Conexion();
            conexion.Conecta();
            connection = conexion.getConnection();
            String sql = "Delete from usuarios where codigo=" + idUsuario + ";";
            Statement s = connection.createStatement();
            int rs = s.executeUpdate(sql);
            System.out.println("Correcto");
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listaUsuario = null;
        try {
            ResultSet resulSet;
            listaUsuario = new ArrayList<>();
            conexion = new Conexion();
            conexion.Conecta();
            connection = conexion.getConnection();
            String sql = "SELECT * FROM usuarios";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                resulSet = statement.executeQuery();

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args) throws SQLException {
        Usuario u = new Usuario();
        u.setCodigo("2");
        u.setContraseña("124563");
        u.setNombreUsuario("ramirorr");
        u.setNombre("ramiro");
        u.setEdad(21);
        u.setSexo("Masculino");
        UsuarioModelImpl m = new UsuarioModelImpl();
        m.crearRegistro(u);

    }

}

//    @Override
//    public void actualizarRegistro(Usuario usuario) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public List<Usuario> obtenerRegistros() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public Usuario obtenerRegistro(int idUsuario) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void eliminarRegistro(int idUsuario) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }

