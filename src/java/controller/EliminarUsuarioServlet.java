
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import service.IusuarioService;
import service.UsuarioServiceImpl;

public class EliminarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idUsuario=Integer.parseInt(request.getParameter("idUsuario"));
        IusuarioService service =new UsuarioServiceImpl();
        service.eliminarRegistro(idUsuario);
        response.sendRedirect("ListarUsuarioServlet");

    }

}
