package proyecto;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/cerrarSesion")
public class CerrarSesion {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate(); // Invalidar la sesión actual
        response.sendRedirect("index.html"); // Redirigir al usuario a la página de inicio de sesión u otra página relevante
    }
}
