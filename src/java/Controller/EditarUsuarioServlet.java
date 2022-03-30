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

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario = service.obtenerRegistro(idUsuario);
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/Resources/css/StyleForm.css'>");
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
                    "<li><a href=index.html'>Principal</a></li>"+
                    "<li><a href='crearRegistro.html'>Crear</a></li>"+
                    "<li><a href='ListarUsuarioServlet'>Listar</a></li>"+
                    "<li><a href='ListarUsuarioServlet'>Editar</a></li>"+
                    "<li><a href='ListarUsuarioServlet'>Eliminar</a></li>"+
                    "<li><a href='#'>Acerca de</a></li>"+
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
        out.println("");
        out.println("<form action='GuardarEditarUsuarioServlet' method='GET'>");
        out.println("<fieldset>");
        out.println("<input type='hidden' name='idUsuario' value='" + usuario.getCodigo() + "'><br>");
        out.println("<label>Nombre:</label><br>");
        out.println("<input type='text' name='nombre' value='" + usuario.getNombre() + "' required pattern=\"[A-Za-z]{1,}\" title=\"Porfavor escribir solo letras\"><br>");
        out.println("<label>Nombre de usuario:</label><br>");
        out.println("<input type='text' name='usuario' value='" + usuario.getNombre_Usuario() + "' required pattern=\"[A-Za-z]{1,}\" title=\"Porfavor escribir solo letras\"><br>");
        out.println("<label>Contraseña:</label><br>");
        out.println("<input type='password' name='contraseña' value='" + usuario.getContraseña() + "'><br>");
        out.println("<label>Edad:</label><br>");
        out.println("<input type='number' min='1' name='edad' value='" + usuario.getEdad() + "' required><br>");
        out.println("<label>Sexo:</label><br>");
        out.println("<input type='text' name='sexo' value='" + usuario.getSexo() + "'><br>");
        out.println("</fieldset>");
        out.println("<input type=\"submit\" value='Guardar'>");
        out.println("</form>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        

        
        out.println("</section>");

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
