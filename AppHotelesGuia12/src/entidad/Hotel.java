package entidad;

import java.util.Date;

/**
 *
 * @author SJM
 */
public class Hotel extends Alojamiento {

    protected int numHabitaciones;
    protected int numCocheras;
    protected String nombreHotel;
    protected String nombreRestaurant;
    protected int numSalaConferencia;

    public Hotel() {
    }

    public Hotel(int numHabitaciones, int numCocheras, String nombreHotel, String nombreRestaurant, int numSalaConferencia, Date fechaIngreso, int cantPersonas) {
        super(fechaIngreso, cantPersonas);
        this.numHabitaciones = numHabitaciones;
        this.numCocheras = numCocheras;
        this.nombreHotel = nombreHotel;
        this.nombreRestaurant = nombreRestaurant;
        this.numSalaConferencia = numSalaConferencia;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumCocheras() {
        return numCocheras;
    }

    public void setNumCocheras(int numCocheras) {
        this.numCocheras = numCocheras;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getNumSalaConferencia() {
        return numSalaConferencia;
    }

    public void setNumSalaConferencia(int numSalaConferencia) {
        this.numSalaConferencia = numSalaConferencia;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return "Hotel{"
                + "\n Nombre del Hotel='" + nombreHotel + '\''
                + "\n Cantidad de Habitaciones=" + numHabitaciones
                + "\n Cantidad de Cocheras=" + numCocheras
                + "\n Nombre del Restaurant='" + nombreRestaurant + '\''
                + "\n NUmero de Salas de Conferencia=" + numSalaConferencia
             
                + "\n}";
    }

}
