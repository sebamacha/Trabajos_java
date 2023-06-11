package logica;

public class Mascota {
	private int num_Id;
	private String nombre;
	private String raza;
	private String color;
	private String alergico;
	private String atencion_especial;
	private String observaciones;
	private Persona persona;
	
	public Mascota() {
		super();
	}

	public Mascota(int num_Id, String nombre, String raza, String color, String alergico, String atencion_especial,
			String observaciones, Persona persona) {
		super();
		this.num_Id = num_Id;
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.alergico = alergico;
		this.atencion_especial = atencion_especial;
		this.observaciones = observaciones;
		this.persona = persona;
	}

	public int getNum_Id() {
		return num_Id;
	}

	public void setNum_Id(int num_Id) {
		this.num_Id = num_Id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAlergico() {
		return alergico;
	}

	public void setAlergico(String alergico) {
		this.alergico = alergico;
	}

	public String getAtencion_especial() {
		return atencion_especial;
	}

	public void setAtencion_especial(String atencion_especial) {
		this.atencion_especial = atencion_especial;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	

}
