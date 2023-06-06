
package servicio;


import entidad.Hotel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Metodos {
    public static Hotel crearHotel(String fechaIngreso, int cantPersonas, int numHabitaciones, int numCocheras, String nombreHotel, String nombreRestaurant, int numSalaConferencia) {
        // Convertir la fecha ingreso de String a Date en el formato dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;
        try {
            fecha = dateFormat.parse(fechaIngreso);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        
        // Crear el objeto Hotel con los datos proporcionados
        Hotel hotel = new Hotel(numHabitaciones, numCocheras, nombreHotel, nombreRestaurant, numSalaConferencia, fecha, cantPersonas);
        
        return hotel;
        // Crear el hotel utilizando el método crearHotel()
        
    }
}