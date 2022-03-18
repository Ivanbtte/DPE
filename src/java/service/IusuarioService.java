/*
Autor:Ramiro
Fecha creación:16/03/2022
Fecha actualización: 16/03/2022
Descripción: Se crea una Interface en el paquete Service.

 */
package service;

import entity.Usuario;
import java.util.List;

/**
 *
 * @author labtw08
 */
public interface IusuarioService {
        public void crearRegistro(Usuario usuario);
    public void actualizarRegistro(Usuario usuario);
    public List<Usuario>obtenerRegistros();
    public Usuario obtenerRegistro(int idUsuario);
    public void eliminarRegistro(int idUsuario);
}


