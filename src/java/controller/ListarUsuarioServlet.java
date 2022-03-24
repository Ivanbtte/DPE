/*
Autor:Ramiro
Fecha creación:18/03/2022
Fecha actualización: 18/03/2022
Descripción: Se crea una tabla desde HTML aplicando estilos.

 */

package controller;


import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import service.IusuarioService;
import service.UsuarioServiceImpl;

public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/miestilo.css'");
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
        IusuarioService service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerRegistros();
        out.println("<tbody>");
        for (Usuario usuario : listaUsuario){
            out.println("<tr>");
            out.println("<td>"+usuario.getCodigo()+"</td>");
            out.println("<td>"+usuario.getNombre()+"</td>");
            out.println("<td>"+usuario.getContraseña()+"</td>");
            out.println("<td>"+usuario.getNombreUsuario()+"</td>");
            out.println("<td>"+usuario.getEdad()+"</td>");
            out.println("<td>"+usuario.getSexo()+"</td>");
            out.println("<td><a href='EditarUsuarioServlet?idUsuario="+usuario.getCodigo()+"'>Editar</a></td>");
            //out.println("<td><a href=''>Editar</a></td>");
            //out.println("<td><a href='EliminarUsuarioServlet?idUsuario="+usuario.getCodigo()+"'>Eliminar</a></td>");
            out.println("<td><button onclick=\"myFunction()\">Eliminar</button></td>");
            out.println("<p id=\"demo\"></p>\n"
                    + "\n"
                    + "<script>\n"
                    + "function myFunction() {\n"
                    + "  let text;\n"
                    + "  if (confirm('¿Desea eliminar?') == true) {\n"
                    + "    window.location.href='EliminarUsuarioServlet?idUsuario=" + usuario.getCodigo() + "'"
                    + "  } else {\n"
                    + "    text = 'Cancelar';\n"
                    + "  }\n"
                    + "  document.getElementById(\"demo\").innerHTML = text;\n"
                    + "}\n"
                    + "</script>");
        }
        out.println("</tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
