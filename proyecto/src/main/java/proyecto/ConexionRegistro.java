package proyecto;

import java.sql.*;

import jakarta.servlet.http.HttpServlet;
import proyecto.dto.UsuarioRegistro;

public class ConexionRegistro extends HttpServlet{
    public UsuarioRegistro registrarUsuario(UsuarioRegistro usu){
        UsuarioRegistro usuario = null;
		Connection con = null;
		PreparedStatement pst = null;
        
		try {
		
			con = Conexion.getConexion();
		
			String sql = "INSERT INTO usuarios(alias,nombre,dni,email,clave, pais) VALUES (?,?, ?, ?,?,?)";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, usu.getAlias());
			pst.setString(2, usu.getUsuario());
            pst.setString(3, usu.getDni());
            pst.setString(4, usu.getEmail());
            pst.setString(5, usu.getPassword());
            pst.setString(6, usu.getPais());

            pst.executeUpdate();

		
		} catch (Exception e) {
		System.out.println("Error en obtener usuario");
		}
		
		return usuario;
    }
}
