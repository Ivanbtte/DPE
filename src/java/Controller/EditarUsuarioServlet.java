/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 17/03/2022
Fecha actualización: 22/03/2022
Descripción: Servlet para editar usuario
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

public class EditarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int idUsuario= Integer.parseInt(request.getParameter("idUsuario"));
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario = service.obtenerRegistro(idUsuario);
        out.println("<form action='GuardarEditarUsuarioServlet' method='GET'>");
        out.println("<input type='hidden' name='idUsuario' value='"+usuario.getCodigo()+"'><br>");
        out.println("<label>Nombre:</label>");
        out.println("<input type='text' name='nombre' value='"+usuario.getNombre()+"'><br>");
        out.println("<label>Nombre de usuario:</label>");
        out.println("<input type='text' name='usuario' value='"+usuario.getNombre_Usuario()+"'><br>");
        out.println("<label>Contraseña:</label>");
        out.println("<input type='text' name='contraseña' value='"+usuario.getContraseña()+"'><br>");
        out.println("<label>Edad:</label>");
        out.println("<input type='text' name='edad' value='"+usuario.getEdad()+"'><br>");
        out.println("<label>Sexo:</label>");
        out.println("<input type='text' name='sexo' value='"+usuario.getSexo()+"'><br>");
         out.println("</form>");
        
    }
}
