/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package entidad;

/**
 *
 * @author SJM
 */
public abstract class EdificioDeOficinas extends Edificio{
    Integer cantidadOficinas;
    Integer cantPersonasOficina;
    Integer numerosPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer cantidadOficinas, Integer cantPersonasOficina, Integer numerosPisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.cantidadOficinas = cantidadOficinas;
        this.cantPersonasOficina = cantPersonasOficina;
        this.numerosPisos = numerosPisos;
    }

    public Integer getCantidadOficinas() {
        return cantidadOficinas;
    }

    public void setCantidadOficinas(Integer cantidadOficinas) {
        this.cantidadOficinas = cantidadOficinas;
    }

    public Integer getCantPersonasOficina() {
        return cantPersonasOficina;
    }

    public void setCantPersonasOficina(Integer cantPersonasOficina) {
        this.cantPersonasOficina = cantPersonasOficina;
    }

    public Integer getNumerosPisos() {
        return numerosPisos;
    }

    public void setNumerosPisos(Integer numerosPisos) {
        this.numerosPisos = numerosPisos;
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
        return "EdificioDeOficinas{" + "cantidadOficinas=" + cantidadOficinas + ", cantPersonasOficina=" + cantPersonasOficina + ", numerosPisos=" + numerosPisos + '}';
    }
    
    

    
    
    
    
    
    
  
    
}
