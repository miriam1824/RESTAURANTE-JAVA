package proyecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import proyecto.dto.ReservaMesa;

@WebServlet("/VerMisReservas")
public class VerMisReservas<ConexionVerReservas> extends HttpServlet{
   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
       ReservaMesa verReserva = new ReservaMesa();
        Cookie[] cookies = req.getCookies();
        int i = 0;
        for (Cookie cookie : cookies ) {
            if (cookie.getName().equals("id")) {
                verReserva.setIdUsuario(cookies[i].getValue());
              }
        }
        Connection con = null;
        PreparedStatement pst = null;
		ResultSet rs = null;
        try {
		
			con = Conexion.getConexion();
		
			String sql = "select * from reserva where id_usuario = ? ";
				
			pst = con.prepareStatement(sql);

			pst.setString(1, verReserva.getIdUsuario());
			
			rs = pst.executeQuery();
      
			while (rs.next()) {
                verReserva  = new ReservaMesa (rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
                String nombre = rs.getString(2);
                out.println("<p>Tu nombre es: " +nombre+"</p>");
                String telefono = rs.getString(3);
                out.println("<p>Tu telefono es: " +telefono+"</p>");
                String personas = rs.getString(4);
                out.println("<p>Número de personas es: " +personas+"</p>");
                String fecha = rs.getString(5);
                out.println("<p>La fecha es: " +fecha+"</p>");
                String hora = rs.getString(6);
                out.println("<p>La hora es: " +hora+"</p>");
                String email = rs.getString(7);
                out.println("<p>Tu email es: " +email+"</p><br>");

			}
            

		} catch (Exception e) {
		System.out.println("Ver Reserva");
		}
    }
}
