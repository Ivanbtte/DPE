/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 16/03/2022
Fecha actualización: 16/03/2022
Descripción: Clase de servicio para usuario
*/

package Service;

import Entity.Usuario;
import Model.IUsuarioModel;
import Model.UsuarioModelImpl;
import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService{
    
    IUsuarioModel modelo = new UsuarioModelImpl();
    
    @Override
    public void crearRegistro(Usuario usuario) {
        modelo.crearRegistro(usuario);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        modelo.actualizarRegistro(usuario);
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        modelo.eliminarRegistro(idUsuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        return modelo.obtenerRegistro(idUsuario);
    }
    
}
