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
        out.println("<meta charset=\"UTF-8\">");
//        out.println("");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/Resources/css/StyleForm.css'>");
        out.println("<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&family=Zen+Dots&display=swap\" rel=\"stylesheet\">"+
          "<link rel='stylesheet' href='"+request.getContextPath()+"/Resources/css/principal.css'>"+
        "<link rel='stylesheet' href='"+request.getContextPath()+"/Resources/css/StyleFooter.css'>"+
        "<script src='https://kit.fontawesome.com/eb496ab1a0.js' crossorigin='anonymous'></script>");
        out.println("</head>");
        out.println("<body>");
        
         out.println("<header>"+

           " <a href='#' class='logo'>Dportes Exhuberantes</a>"+
            "<input type='checkbox' id='menu-bar'>"+
            "<label for='menu-bar'> Menu</label>"+
            "<nav class='navbar'>"+
                "<ul>"+
                    "<li><a href='"+request.getContextPath()+"/Pages/index.html'>Principal</a></li>"+
                    "<li><a href='"+request.getContextPath()+"/Pages/crearRegistro.html'>Crear</a></li>"+
                    "<li><a href='ListarUsuarioServlet'>Listar</a></li>"+
                    "<li><a href='ListarUsuarioServlet'>Editar</a></li>"+
                    "<li><a href='ListarUsuarioServlet'>Eliminar</a></li>"+
                    "<li><a href='"+request.getContextPath()+"/Pages/AcercaDe.html'>Acerca de</a></li>"+
                "</ul>"+
            "</nav>"+
        "</header>");
        
        out.println("<section class=\"forma\">");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<table class='center'>");
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
            out.println("<td><a href='EditarUsuarioServlet?idUsuario="+usuario.getCodigo()+"'>Editar</a></td>");
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
        
         
        
        
        
        out.println("</section>");
        
       
        
        out.println("</tbody>");
        out.println("</table>");  
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");

        
          out.println("<div class='footer'>"
                + "<footer class='pie-pagina'>"
                + "<div class='grupo-1'>"
                + "<div class='box'>"
                + "<figure>"
                + "<a href='#'>"
                + "<img src='../Resources/Img/logo.png' alt='Logo'>"
                + "</a>"
                + "</figure>"
                + "</div>"
                + "<div class='box'>"
                + "<h2>SOBRE NOSOTROS</h2>"
                + "<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Odio, ipsa?</p>"
                + "<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Odio, ipsa?</p>"
                + "</div>"
                + "<div class='box'>"
                + "<h2>SIGUENOS</h2>"
                + "<div class='red-social'>"
                + "<a href='#' class='fa fa-facebook'></a>"
                + "<a href='#' class='fa fa-instagram'></a>"
                + "<a href='#' class='fa fa-twitter'></a>"
                + "<a href='#' class='fa fa-youtube'></a>"
                + "</div>"
                + "</div>"
                + "</div>"
                + "<div class='grupo-2'>"
                + "<small>&copy; 2021 <b>DPE</b> - Todos los Derechos Reservados.</small>"
                + "</div>"
                + "</footer>"
                + "</div>");
        
        out.println("</body>");
        out.println("</html>");
    }

}

