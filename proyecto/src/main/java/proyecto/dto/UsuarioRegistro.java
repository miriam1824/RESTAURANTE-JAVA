package proyecto.dto;

public class UsuarioRegistro {
    private String password;
	private String usuario;
	private String email;
	private String pais;
	private String dni;
	private String alias;
	
	public UsuarioRegistro(String alias,String usuario, String password,String email, String pais,String dni) {
		this.alias = alias;
		this.password = password;
		this.usuario = usuario;
		this.email = email;
		this.pais = pais;
		this.dni = dni;
	}
	public UsuarioRegistro() {

	}

	public String getAlias(){
		return alias;
	}
	public void setAlias(String alias){
		this.alias = alias;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
