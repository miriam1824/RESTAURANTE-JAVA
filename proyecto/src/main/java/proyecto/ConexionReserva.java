package proyecto;

import java.sql.*;

import jakarta.servlet.http.HttpServlet;
import proyecto.dto.ReservaMesa;

public class ConexionReserva extends HttpServlet {
    public ReservaMesa reserva(ReservaMesa res){
        ReservaMesa reserva = null;
        Connection con = null;
		PreparedStatement pst = null;
            try {
            
                con = Conexion.getConexion();
            
                String sql = "INSERT INTO reserva(nombre,telefono,personas,fecha,hora,email,id_usuario) VALUES (?, ?, ?,?,?,?,?)";
                
                pst = con.prepareStatement(sql);
    
                pst.setString(1, res.getNombre());
                pst.setString(2, res.getTelefono());
                pst.setString(3, res.getPersonas());
                pst.setString(4, res.getFecha());
                pst.setString(5, res.getHora());
                pst.setString(6, res.getEmail());
                pst.setString(7, res.getIdUsuario());
    
                pst.executeUpdate();

		} catch (Exception e) {
		System.out.println("Error en obtener usuario");
		}
		
		return reserva;
    }
}

