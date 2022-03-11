/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 11/03/2022
Fecha actualización: 11/03/2022
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
         String sql = "Insert into Usuario"
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
