package proyecto;

import java.sql.*;

import jakarta.servlet.http.HttpServlet;
import proyecto.dto.Usuario;

public class ConexionLogin extends HttpServlet{
    public Usuario obtenerUsuario(Usuario usu){
        Usuario usuario = null;
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
        
		try {
		
			con = Conexion.getConexion();
		
			String sql = "select * from usuarios where alias = ? and clave =  ? ";
				
			pst = con.prepareStatement(sql);

			pst.setString(1, usu.getUsuario());
			pst.setString(2, usu.getPassword());
			
			rs = pst.executeQuery();
			while (rs.next()) {
				usuario = new Usuario(rs.getString(1), rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
		System.out.println("Error en obtener usuario");
		}
		
		return usuario;
    }

}
