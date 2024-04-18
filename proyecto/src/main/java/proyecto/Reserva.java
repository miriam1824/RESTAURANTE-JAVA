package proyecto;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import proyecto.dto.ReservaMesa;

@WebServlet("/Reserva")
public class Reserva  extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String nombre = req.getParameter("nombre");
            String telefono = req.getParameter("telefono");
            String fecha =req.getParameter("fecha");
            String hora = req.getParameter("hora");
            String personas = req.getParameter("personas");
            String email = req.getParameter("email");
            if(nombre==null || nombre == ""||telefono==null || telefono == ""||fecha==null || fecha == ""||hora==null || hora == "" || email==null || email == ""||personas==null || personas == "" ){
                resp.sendRedirect("./reserva.jsp?error=vacio");
            }else{
                Cookie[] cookies = req.getCookies();
                int i = 0;
                ReservaMesa reservaMesa = new ReservaMesa();
                try {
                    Date fechaIngresada = formatoFecha.parse(fecha);
                    if (fechaIngresada.compareTo(fechaActual) >= 0) {
                        reservaMesa.setNombre(nombre);
                        reservaMesa.setTelefono(telefono);
                        reservaMesa.setHora(hora);
                        reservaMesa.setPersonas(personas);
                        reservaMesa.setEmail(email);
                        reservaMesa.setFecha(fecha);
                        resp.sendRedirect("./reserva.jsp?reserva=aceptada");
                    } else {
                       resp.sendRedirect("./reserva.jsp?error=fecha");
                    }
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                for (Cookie cookie : cookies ) {
                    if (cookie.getName().equals("id")) {
                          reservaMesa.setIdUsuario(cookies[i].getValue());
                      }
                  }
                ConexionReserva conexion = new ConexionReserva();
                ReservaMesa reserva = conexion.reserva(reservaMesa);
            }
          
            //resp.sendRedirect("./reserva.jsp");
    }
}
