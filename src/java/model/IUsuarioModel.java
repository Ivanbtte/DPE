/*
Autor:Ramiro
Fecha creación:11/03/2022
Fecha actualización: 11/03/2022
Descripción: Se crea una Interface en el paquete model.

 */
package model;

import entity.Usuario;
import java.util.List;

/**
 *
 * @author labtw08
 */
public interface IUsuarioModel {

    public void crearRegistro(Usuario usuario);
    public void actualizarRegistro(Usuario usuario);
    public List<Usuario>obtenerRegistros();
    public Usuario obtenerRegistro(int idUsuario);
    
    public void eliminarRegistro(int idUsuario);
    
}
