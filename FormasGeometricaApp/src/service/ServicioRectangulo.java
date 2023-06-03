/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Rectangulo;
import interfaz.AccionCalculo;

/**
 *
 * @author Usuario
 */
public class ServicioRectangulo extends Rectangulo implements AccionCalculo {

    @Override
    public void area() {   
     setBase(20);
     setAltura(25);
     double area = getBase()*getAltura();
     System.out.println("El area del rectangulo es: "+ area);
    }

    @Override
    public void perimetro() {    
     double perimetro = (getBase()+getAltura())*2;
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }
    
}
