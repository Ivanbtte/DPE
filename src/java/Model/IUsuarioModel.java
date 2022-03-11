/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 11/03/2022
Fecha actualización: 11/03/2022
Descripción: interface de Usuario
*/

package Model;

import Entity.Usuario;
import java.util.List;

public interface IUsuarioModel {
 public void crearRegistro(Usuario usuario);
 public void actualizarRegistro(Usuario usuario);
 public void eliminarRegistro(int idUsuario);
 public List<Usuario> obtenerRegistros();
 public Usuario obtenerRegistro(int idUsuario);
}
