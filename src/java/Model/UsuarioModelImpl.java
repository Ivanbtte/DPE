/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 11/03/2022
Fecha actualización: 14/03/2022
Descripción: Clase Implementadora de Usuario
 */
package Model;

import Db.Conexion;
import Entity.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conecta();
            connection = conexion.getConnection();
            String sql = "Insert into usuarios (nombre_usuario, contraseña, nombre, sexo, edad) values(?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNombre_Usuario());
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
            conexion.conecta();
            connection = conexion.getConnection();
            String sql = "Update usuarios set nombre_usuario=?, contraseña=?, nombre=?, sexo=?, edad=? where codigo="+usuario.getCodigo()+";";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNombre_Usuario());
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
            conexion.conecta();
            connection = conexion.getConnection();
            String sql = "delete from usuarios where codigo="+idUsuario+";";
            Statement s = connection.createStatement();
            int rs = s.executeUpdate(sql);
            System.out.println("Correcto");
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<Usuario> obtenerRegistros() {
        Object[] ob1 = new Object[6];
        try{
          Statement s = connection.createStatement(); 
           ResultSet rs= s.executeQuery("SELECT * FROM usuarios;");
           
           while (rs.next()){
               ob1[0] = rs.getString(1);
               ob1[1] = rs.getString(2);
               ob1[2] = rs.getString(3);
               ob1[3] = rs.getString(4);
               ob1[4] = rs.getString(5);
               ob1[5] = rs.getString(6);
               }
         }catch(Exception e){
           System.out.println(e.getMessage());
       }
        return null;
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setCodigo("2");
        u.setContraseña("87691520");
        u.setEdad(20);
        u.setNombre("Ivan");
        u.setNombre_Usuario("wos");
        u.setSexo("Masculino");
        UsuarioModelImpl m = new UsuarioModelImpl();
        m.crearRegistro(u);
        
        
    }
}
