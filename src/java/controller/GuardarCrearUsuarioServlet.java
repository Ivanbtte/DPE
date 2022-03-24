package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import service.IusuarioService;
import service.UsuarioServiceImpl;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author labtw08
 */
public class GuardarCrearUsuarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GuardarCrearUsuarioServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GuardarCrearUsuarioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        IusuarioService service = new UsuarioServiceImpl();
        Usuario u = new Usuario();
        int edad= Integer.parseInt(request.getParameter("edad"));
        //u.setCodigo(request.getParameter("idUsuario"));
        u.setContraseña(request.getParameter("contraseña"));
        u.setEdad(20);
        u.setNombre(request.getParameter("nombre"));
        u.setNombreUsuario(request.getParameter("usuario"));
        u.setSexo(request.getParameter("sexo"));
        service.crearRegistro(u);
        response.sendRedirect("ListarUsuarioServlet");

}
}