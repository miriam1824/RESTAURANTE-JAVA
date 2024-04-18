package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import proyecto.dto.VerReserva;

/*public class ConexionVerReservas {

    public VerReserva Listar(VerReserva verReserva) {
        VerReserva verReservas = null;
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
                verReservas = new VerReserva(rs.getString(1));
			}
		} catch (Exception e) {
		System.out.println("Ver Reserva");
		}
        return verReservas;  
    }
}*/
