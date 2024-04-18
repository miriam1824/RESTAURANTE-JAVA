package proyecto.dto;

public class ReservaMesa {
    private String nombre;
    private String telefono ;
    private String fecha ;
    private String hora ;
    private String personas;
	private String email;
	private String idUsuario;

    public ReservaMesa(String nombre,String telefono,String fecha,String hora,String personas,String email,String idUsuario){
        this.nombre = nombre;
        this.telefono = telefono;
        this.fecha = fecha;
        this.hora = hora;
        this.personas = personas;
		this.email = email;
		this.idUsuario = idUsuario; 
    }

    public ReservaMesa(){

    }
	public String getIdUsuario(){
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario){
		this.idUsuario = idUsuario;
	}
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

    public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

    public String getPersonas() {
		return personas;
	}

	public void setPersonas(String personas) {
		this.personas = personas;
	}

	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
}
