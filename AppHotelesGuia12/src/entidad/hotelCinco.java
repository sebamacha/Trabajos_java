
package entidad;
import entidad.Hotel;
import java.util.ArrayList;
import java.util.Date;
import servicio.MenuPregunta;
/**
 *
 * @author SJM
 */
public class hotelCinco extends Hotel {
      protected int canEstrellas = 5;
      ////////////////////////////////////////////////////////////////////////

    public hotelCinco() {
        
    }

    public hotelCinco(int numHabitaciones, int numCocheras, String nombreHotel, String nombreRestaurant, int numSalaConferencia, Date fechaIngreso, int cantPersonas) {
        super(numHabitaciones, numCocheras, nombreHotel, nombreRestaurant, numSalaConferencia, fechaIngreso, cantPersonas);
    }

    public int getCanEstrellas() {
        return canEstrellas;
    }

    public void setCanEstrellas(int canEstrellas) {
        this.canEstrellas = canEstrellas;
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
    ///////////////////////////////////////////////////
    public void crearHotel() {
        ArrayList<Hotel> listaHoteles = new ArrayList<>();

        // Crear un hotel y cargar sus datos
        Hotel hotel = new Hotel();
        hotel.setNombreHotel("Glamour");
        hotel.setCantPersonas(250);
        hotel.setNombreRestaurant("RockanFeller");
        hotel.setNumCocheras(50);
        hotel.setNumSalaConferencia(3);
        hotel.setNumHabitaciones(80);
        
      

        // Agregar el hotel a la lista
        listaHoteles.add(hotel);

        // Acceder a los datos del hotel en la lista
        Hotel primerHotel = listaHoteles.get(0);
        System.out.println("Hotel 5 estrellas");
        
        for (Hotel x : listaHoteles) {
            System.out.println(x);
            
        }
        MenuPregunta pregunta = new MenuPregunta();
        pregunta.pregunta();
        

    }
    
      
      
      
    
}
