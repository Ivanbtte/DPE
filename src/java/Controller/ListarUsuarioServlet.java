/*
Autor: Ivan Guadalupe Bustamante Cortés
Fecha creación: 17/03/2022
Fecha actualización: 17/03/2022
Descripción: Servlet para listar usuarios
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
import java.util.List;

public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/Resources/css/Style.css'");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet</h1>");
        out.println("<table border='2'>");
        out.println("<tr>");
        out.println("<th>Codigo</th>");
        out.println("<th>Nombre</th>");
        out.println("<th>Contraseña</th>");
        out.println("<th>Usuario</th>");
        out.println("<th>Edad</th>");
        out.println("<th>Sexo</th>");
        out.println("<th>Editar</th>");
        out.println("<th>Eliminar</th>");
        out.println("</tr>");
        IUsuarioService service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerRegistros();
        out.println("<tbody>");
        for (Usuario usuario : listaUsuario){
            out.println("<tr>");
            out.println("<td>"+usuario.getCodigo()+"</td>");
            out.println("<td>"+usuario.getNombre()+"</td>");
            out.println("<td>"+usuario.getContraseña()+"</td>");
            out.println("<td>"+usuario.getNombre_Usuario()+"</td>");
            out.println("<td>"+usuario.getEdad()+"</td>");
            out.println("<td>"+usuario.getSexo()+"</td>");
            out.println("</tr>");
        }
        out.println("</tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}
