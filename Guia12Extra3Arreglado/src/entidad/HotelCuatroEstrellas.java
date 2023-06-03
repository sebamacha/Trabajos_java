/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;
import servicio.MenuInicial;

/**
 *
 * @author SJM
 */
public abstract class HotelCuatroEstrellas extends Hoteles {


    private int nombRestaurant;
    private int capRestaurant;
    private int precioHabitacion;

    public HotelCuatroEstrellas() {
 
    }

    public HotelCuatroEstrellas(int nombRestaurant, int capRestaurant, int precioHabitacion, int cantidadEstrellas, int CantHabitaciones, int numCamas, int canPisos, char gimnasio) {
        super(cantidadEstrellas, CantHabitaciones, numCamas, canPisos, gimnasio);
        this.nombRestaurant = nombRestaurant;
        this.capRestaurant = capRestaurant;
        this.precioHabitacion = precioHabitacion;
    }

    public int getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(int nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public int getCapRestaurant() {
        return capRestaurant;
    }

    public void setCapRestaurant(int capRestaurant) {
        this.capRestaurant = capRestaurant;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantidadEstrellas() {
        return cantidadEstrellas;
    }

    public void setCantidadEstrellas(int cantidadEstrellas) {
        this.cantidadEstrellas = cantidadEstrellas;
    }

    public int getCantHabitaciones() {
        return CantHabitaciones;
    }

    public void setCantHabitaciones(int CantHabitaciones) {
        this.CantHabitaciones = CantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCanPisos() {
        return canPisos;
    }

    public void setCanPisos(int canPisos) {
        this.canPisos = canPisos;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }
    

    public abstract void crearHote();
    
}