
package entidad;


public abstract class Alojamiento {

    private String nombre;
    private String direccion;
    private String localidad;
    private String Gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String Gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.Gerente = Gerente;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", Gerente=" + Gerente + '}';
    }
    
     

}
