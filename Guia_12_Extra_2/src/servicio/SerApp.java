/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Edificio;
import entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SJM
 */
public class SerApp {
    public ArrayList<Edificio> crearedificio (){
  Scanner leer = new Scanner(System.in);
        ArrayList<Edificio> edificio1 = new ArrayList<Edificio>();

        //creacion de polideportivo1
        Polideportivo polideportivo1 = new Polideportivo();
        System.out.println("Ingrese alto de polideportivo 1");
        polideportivo1.setAlto(leer.nextInt()); // Acceder y establecer el valor de alto
        System.out.println("Ingrese largo de polideportivo 1");
        polideportivo1.setLargo(leer.nextInt()); // Acceder y establecer el valor de largo
        System.out.println("Ingrese ancho del polideportivo1");
        polideportivo1.setAncho(leer.nextInt());
        System.out.println("techado o abierto?");
        polideportivo1.setTipoTechado(leer.next());
        
        edificio1.add(polideportivo1);
        //creacion de polideportivo2
        Polideportivo polideportivo2 = new Polideportivo();
        System.out.println("Ingrese alto de polideportivo 2");
        polideportivo2.setAlto(leer.nextInt()); // Acceder y establecer el valor de alto
        System.out.println("Ingrese largo de polideportivo 2");
        polideportivo2.setLargo(leer.nextInt()); // Acceder y establecer el valor de largo
        System.out.println("Ingrese ancho del polideportivo2");
        polideportivo2.setAncho(leer.nextInt());
        System.out.println("techado o abierto?");
        polideportivo2.setTipoTechado(leer.next());
        
        edificio1.add(polideportivo2);

        //cracion de edificio de oficinas
        System.out.println("Ingrese cantidad de oficinas del edificio");
        int cantidadOficinas = leer.nextInt();
        System.out.println("Ingrese cantidad de personas por oficina");
        int cantPersonasOficina = leer.nextInt();
        System.out.println("Ingrese número de pisos del edificio");
        int numerosPisos = leer.nextInt();
        System.out.println("Ingrese ancho del edificio");
        int ancho = leer.nextInt();
        System.out.println("Ingrese alto del edificio");
        int alto = leer.nextInt();
        System.out.println("Ingrese largo del edificio");
        int largo = leer.nextInt();
        
        SerOficinas serOficinas1 = new SerOficinas(cantidadOficinas, cantPersonasOficina, numerosPisos, ancho, alto, largo);
        edificio1.add(serOficinas1);
        //segunda oficina
        SerOficinas serOficinas2 = new SerOficinas(cantidadOficinas, cantPersonasOficina, numerosPisos, ancho, alto, largo);
        System.out.println("Ingrese cantidad de oficinas del edificio");
        serOficinas2.setCantidadOficinas(leer.nextInt());
        System.out.println("Ingrese cantidad de personas por oficina");
        serOficinas2.setCantPersonasOficina(leer.nextInt());
        System.out.println("Ingrese número de pisos del edificio");
        serOficinas2.setNumerosPisos(leer.nextInt());
        System.out.println("Ingrese ancho del edificio");
        serOficinas2.setAncho(leer.nextInt());
        System.out.println("Ingrese alto del edificio");
        serOficinas2.setAlto(leer.nextInt());
        System.out.println("Ingrese largo del edificio");
        serOficinas2.setLargo(leer.nextInt());  
        edificio1.add(serOficinas2);
        
        return edificio1;
    }
    
}
