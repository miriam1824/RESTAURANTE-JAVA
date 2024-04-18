package proyecto.dto;

public class VerReserva {
    private String idUsuario;
	private String nombre;
    
    public VerReserva(String idUsuario,String nombre){
        this.idUsuario = idUsuario; 
		this.nombre = nombre;
    }
   
    public VerReserva(){

    }
	public String getIdUsuario(){
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario){
		this.idUsuario = idUsuario;
	}
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
