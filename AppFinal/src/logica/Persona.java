package logica;

public class Persona {
	private int num_Id;
	private String nombre_duenio;
	private String telefono;
	public Persona() {
		super();
	}
	public Persona(int num_Id, String nombre_duenio, String telefono) {
		super();
		this.num_Id = num_Id;
		this.nombre_duenio = nombre_duenio;
		this.telefono = telefono;
	}
	public int getNum_Id() {
		return num_Id;
	}
	public void setNum_Id(int num_Id) {
		this.num_Id = num_Id;
	}
	public String getNombre_duenio() {
		return nombre_duenio;
	}
	public void setNombre_duenio(String nombre_duenio) {
		this.nombre_duenio = nombre_duenio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
