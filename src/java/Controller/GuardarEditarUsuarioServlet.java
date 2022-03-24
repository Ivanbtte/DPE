/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 17/03/2022
Fecha actualización: 17/03/2022
Descripción: Servlet para guardar edicion
 */

package Controller;

import Entity.Usuario;
import Service.IUsuarioService;
import Service.UsuarioServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GuardarEditarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario u = new Usuario();
        int edad= Integer.parseInt(request.getParameter("edad"));
        u.setCodigo(request.getParameter("idUsuario"));
        u.setContraseña(request.getParameter("contraseña"));
        u.setEdad(edad);
        u.setNombre(request.getParameter("nombre"));
        u.setNombre_Usuario(request.getParameter("usuario"));
        u.setSexo(request.getParameter("sexo"));
        service.actualizarRegistro(u);
        response.sendRedirect("ListarUsuarioServlet");
    }
}
