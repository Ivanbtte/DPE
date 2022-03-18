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
    public void actualizarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conecta();
            connection = conexion.getConection();
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
            connection = conexion.getConection();
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
        Usuario u = new Usuario();
        List<Usuario> lista = new ArrayList<Usuario>();
        try {
            conexion = new Conexion();
            conexion.Conecta();
            connection = conexion.getConection();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM usuarios;");

            while (rs.next()) {
                u.setCodigo(rs.getString("codigo"));
                u.setNombreUsuario(rs.getString("nombre_usuario"));
                u.setContraseña(rs.getString("contraseña"));
                u.setNombre(rs.getString("nombre"));
                u.setSexo(rs.getString("sexo"));
                u.setEdad(rs.getInt("edad"));
                lista.add(u);
            }
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        Usuario u = new Usuario();
        try {
            conexion = new Conexion();
            conexion.Conecta();
            connection = conexion.getConection();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM usuarios where codigo=" + idUsuario + ";");
            while (rs.next()) {
                u.setCodigo(rs.getString("codigo"));
                u.setNombreUsuario(rs.getString("nombre_usuario"));
                u.setContraseña(rs.getString("contraseña"));
                u.setNombre(rs.getString("nombre"));
                u.setSexo(rs.getString("sexo"));
                u.setEdad(rs.getInt("edad"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return u;
    }

    public static void main(String[] args){
        Usuario u = new Usuario();
        u.setCodigo("1");
        u.setContraseña("124563");
        u.setNombreUsuario("ramirorr");
        u.setNombre("ivan");
        u.setEdad(21);
        u.setSexo("Masculino");
        UsuarioModelImpl m = new UsuarioModelImpl();
        m.crearRegistro(u);

    }

}
        