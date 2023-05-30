/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entidad;

/**
 *
 * @author SJM
 */
public class Polideportivo extends Edificio{
String tipoTechado;

    public Polideportivo(String tipoTechado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.tipoTechado = tipoTechado;
    }

    public Polideportivo() {
    }

    public String getTipoTechado() {
        return tipoTechado;
    }

    public void setTipoTechado(String tipoTechado) {
        this.tipoTechado = tipoTechado;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    @Override
    public Double calcularSuperficie() {
        // Implementación del cálculo de la superficie del polideportivo
        double superficie = ancho * largo;
        return superficie;
    }

    @Override
    public Double calcularVolumen() {
       // Implementación del cálculo del volumen del polideportivo
        double volumen = ancho * alto * largo;
        return volumen;
    }

    @Override
    public String toString() {
         return "Polideportivo: [alto=" + alto + ", largo=" + largo + ", ancho=" + ancho + ", tipoTechado=" + tipoTechado + "]";
    }

   
}