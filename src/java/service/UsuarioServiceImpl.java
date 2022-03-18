/*
Autor:Ramiro
Fecha creación:16/03/2022
Fecha actualización: 16/03/2022
Descripción: Se crea una Interface en el paquete Service.

 */
package service;

import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.UsuarioModelImpl;

/**
 *
 * @author labtw08
 */
public class UsuarioServiceImpl implements IusuarioService {

    IUsuarioModel  modelo= new UsuarioModelImpl();
    

    @Override
    public void crearRegistro(Usuario usuario) {
     modelo.crearRegistro(usuario);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
      modelo.actualizarRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
      return modelo.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
       return modelo.obtenerRegistro(idUsuario);
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
       modelo.eliminarRegistro(idUsuario);
    }

}
