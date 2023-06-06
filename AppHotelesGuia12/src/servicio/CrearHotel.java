
package servicio;

import entidad.Hotel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SJM
 */
public class CrearHotel {
    Date fechaIngreso = new Date();

        // Formatear la fecha en formato "dd/mm/yyyy"
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngresoStr = dateFormat.format(fechaIngreso);
        
        // Datos del hotel
        int cantPersonas = 4;
        int numHabitaciones = 2;
        int numCocheras = 1;
        String nombreHotel = "Hotel ABC";
        String nombreRestaurant = "Restaurante XYZ";
        int numSalaConferencia = 3;
        
} 
    

