/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author SJM
 */
public abstract class Hoteles extends Alojamiento {
    
    protected int cantidadEstrellas;
    protected int CantHabitaciones;
    protected int numCamas;
    protected int canPisos;
    protected char gimnasio;

    public Hoteles() {
    }

    public Hoteles(int cantidadEstrellas, int CantHabitaciones, int numCamas, int canPisos, char gimnasio) {
        this.cantidadEstrellas = cantidadEstrellas;
        this.CantHabitaciones = CantHabitaciones;
        this.numCamas = numCamas;
        this.canPisos = canPisos;
        this.gimnasio = gimnasio;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setLocalidad(String localidad) {
        super.setLocalidad(localidad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getLocalidad() {
        return super.getLocalidad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setGerente(String Gerente) {
        super.setGerente(Gerente); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getGerente() {
        return super.getGerente(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    

    
    
}
