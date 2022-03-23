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
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/Resources/css/StyleForm.css'>");
        out.println("<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&family=Zen+Dots&display=swap\" rel=\"stylesheet\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<section class=\"forma\">");
        out.println("<h1 class=titulo>Editar usuario</h1>");
        out.println("");
        out.println("<form action='GuardarEditarUsuarioServlet' method='GET'>");
        out.println("<fieldset>");
        out.println("<input type='hidden' name='idUsuario' value='"+usuario.getCodigo()+"'><br>");
        out.println("<label>Nombre:</label><br>");
        out.println("<input type='text' name='nombre' value='"+usuario.getNombre()+"'><br>");
        out.println("<label>Nombre de usuario:</label><br>");
        out.println("<input type='text' name='usuario' value='"+usuario.getNombre_Usuario()+"'><br>");
        out.println("<label>Contraseña:</label><br>");
        out.println("<input type='text' name='contraseña' value='"+usuario.getContraseña()+"'><br>");
        out.println("<label>Edad:</label><br>");
        out.println("<input type='text' name='edad' value='"+usuario.getEdad()+"'><br>");
        out.println("<label>Sexo:</label><br>");
        out.println("<input type='text' name='sexo' value='"+usuario.getSexo()+"'><br>");
        out.println("</fieldset>");
        out.println("<input type=\"submit\" value='Guardar'>");
        out.println("</form>");
        out.println("</section>");
        out.println("</body>");
        out.println("</html>");
        
    }
}
