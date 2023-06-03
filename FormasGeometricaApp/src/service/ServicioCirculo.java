package service;

import entidad.Circulo;
import interfaz.AccionCalculo;
import java.util.Scanner;

public class ServicioCirculo extends Circulo implements AccionCalculo {

    @Override
    public void area() {
        //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro (radio x radio).
        
        setRadio(20);
        double area = (getPI() * (getRadio() * getRadio()));
        System.out.println("Area circulo: " + area);
        
    }   

    @Override
    public void perimetro() {
        
        double perimetro = (2 * getPI()   * getRadio());
        System.out.println("Perimetro circulo: " + perimetro);
       //Perímetro circulo: PI * diámetro.
    }


}
