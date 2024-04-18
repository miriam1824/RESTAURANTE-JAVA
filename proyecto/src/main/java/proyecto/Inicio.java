package proyecto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import proyecto.dto.Usuario;

@WebServlet("/Inicio")
public class Inicio extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String nombre = req.getParameter("usuario");
        String contrasena = req.getParameter("password");
        Usuario usuario2 = new Usuario();
        usuario2.setUsuario(nombre);
        usuario2.setPassword(contrasena);
        Login login = new Login();
        Usuario usu = login.obtenerUsuario(usuario2);
        if (usu != null) {
            Cookie objCookie = new Cookie ("id",usu.getUsuario());
            resp.addCookie(objCookie);
            resp.sendRedirect("./inicio.jsp");

		} else {
            resp.sendRedirect("./index.html?error=incorrecto");
        }
       
      
    }

}
