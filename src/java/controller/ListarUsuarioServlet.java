/*
Autor:Ramiro
Fecha creación:18/03/2022
Fecha actualización: 18/03/2022
Descripción: Se crea una tabla desde HTML aplicando estilos.

 */
package controller;

//import Entity.Usuario;
//import Service.IUsuarioService;
//import Service.UsuarioServiceImpl;
//import entity.Usuario;
//import jakarta.annotation.Resources;
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
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class ListarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/resources/css/style.css'");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border='2' >");
        out.println("<tr>");
        out.println("<th>Codigo</th>");
        out.println("<th>Nombre</th>");
        out.println("<th>Password</th>");
        out.println("<th>Nombre_usuario</th>");
        out.println("<th>Edad</th>");
        out.println("<th>Sexo</th>");
        out.println("<th>Editar</th>");
        out.println("<th>Eliminar</th>");
        out.println("</tr>");
        IusuarioService service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerRegistros();
        for (Usuario usuario : listaUsuario) {
            out.println("<tr>");
            out.println("<td>" + usuario.getCodigo() + "</td>");
            out.println("<td>" + usuario.getNombre() + "</td>");
            out.println("<td>" + usuario.getContraseña() + "</td>");
            out.println("<td>" + usuario.getNombreUsuario() + "</td>");
            out.println("<td>" + usuario.getEdad() + "</td>");
            out.println("<td>" + usuario.getSexo() + "</td>");
            out.println("</tr>");

        }
    }
}
