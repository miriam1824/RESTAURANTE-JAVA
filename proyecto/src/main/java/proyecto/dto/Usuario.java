package proyecto.dto;

public class Usuario {
    private String password;
	private String usuario;
	private int idUsuario;
	public Usuario(String usuario, String password) {
		this.password = password;
		this.usuario = usuario;
	}
	public Usuario() {

	}

	public int getIdUsuario(){
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario){
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
