/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Hotel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SJM
 */
public class CargaDatosHotel extends Hotel {

    int canDias;

    public CargaDatosHotel(int canDias, int numHabitaciones, int numCocheras, String nombreHotel, String nombreRestaurant, int numSalaConferencia, Date fechaIngreso, int cantPersonas) {
        super(numHabitaciones, numCocheras, nombreHotel, nombreRestaurant, numSalaConferencia, fechaIngreso, cantPersonas);
        this.canDias = canDias;
    }

    public CargaDatosHotel() {
    }

    public int getCanDias() {
        return canDias;
    }

    public void setCanDias(int canDias) {
        this.canDias = canDias;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
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

    Scanner leer = new Scanner(System.in);

    Hotel carga() {
        Hotel hotel = new Hotel();

        System.out.println("Ingrese cantidad de personas");
        hotel.setCantPersonas(leer.nextInt());
        System.out.println("Ingrese cantidad de días");
        canDias = leer.nextInt();
        int personasPorDia = canDias * hotel.getCantPersonas();
        ///estadias aleatorias 
        // Definir los rangos
        int rangoMinimo = 1;
        int rangoMaximo = 100;

        // Generar el número aleatorio
        Random random = new Random();
        int numeroAleatorio = random.nextInt(rangoMaximo - rangoMinimo + 1) + rangoMinimo;
        int precioTotal = personasPorDia * numeroAleatorio;
        System.out.println("su total : $" + precioTotal);

        return hotel;

    }

}
