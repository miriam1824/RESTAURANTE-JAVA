package proyecto;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import proyecto.dto.UsuarioRegistro;

@WebServlet("/Registro")
public class Registro extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String alias = req.getParameter("alias");
        String nombre = req.getParameter("nombre");
        String contrasena = req.getParameter("password");
        String dni = req.getParameter("dni");
        String correo = req.getParameter("correo");
        String pais = req.getParameter("pais");
        if(alias == null || alias == "" || nombre == null || nombre == "" ||contrasena == null || contrasena == "" || dni == null || dni == ""||correo == null || correo == "" || pais == null || pais == ""){
            resp.sendRedirect("./registro.html?error=vacio");
        }else{
            UsuarioRegistro usuario2 = new UsuarioRegistro();
            usuario2.setAlias(alias);
            usuario2.setUsuario(nombre);
            usuario2.setPassword(contrasena);
            usuario2.setDni(dni);
            usuario2.setEmail(correo);
            usuario2.setPais(pais);
            ConexionRegistro registro = new ConexionRegistro();
            UsuarioRegistro usu = registro.registrarUsuario(usuario2);
            resp.sendRedirect("./registro.html?consulta=correcta");
        }
      
    }
}
