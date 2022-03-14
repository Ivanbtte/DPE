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
import java.util.List;

public class UsuarioModelImpl implements IUsuarioModel {
    private Conexion conexion;
    private Connection connection;
    
    @Override
    public void crearRegistro(Usuario usuario) {
        try{
         conexion= new Conexion();
         conexion.conecta();
         connection= conexion.getConnection();
         String sql = "Insert into Usuarios (nombre_usuario, contraseña, nombre, sexo, edad) values(?, ?, ?, ?, ?);";
         Statement s= connection.createStatement();
         PreparedStatement ps= connection.prepareStatement(sql);
         ps.setString(1, usuario.getNombre_Usuario());
         ps.setString(2, usuario.getContraseña());
         ps.setString(3, usuario.getNombre());
         ps.setString(4, usuario.getSexo());
         ps.setString(5, ""+usuario.getEdad());
        }
        catch(Exception ex){
            
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
