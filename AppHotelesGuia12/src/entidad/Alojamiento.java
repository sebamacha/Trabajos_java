
package entidad;

import java.util.Date;

/**
 *
 * @author SJM
 */
public abstract  class Alojamiento {
    protected Date fechaIngreso;
    protected int cantPersonas;

    public Alojamiento() {
    }

    public Alojamiento(Date fechaIngreso, int cantPersonas) {
        this.fechaIngreso = fechaIngreso;
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "Fecha de Ingreso = " + fechaIngreso + ", Cantidad de Personas = " + cantPersonas + '}';
    }
   
   
    
    
}
