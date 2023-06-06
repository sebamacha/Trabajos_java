/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Hotel;
import entidad.hotelCinco;
import entidad.hotelCuatro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SJM
 */
public class MenuHoteles {

    public void menuHotel() {
        Scanner leer = new Scanner(System.in);
        int subMenuHoteles = 0;
        System.out.println("--------------Sub Menu Hoteles------------------");
        System.out.println("-----------1. hotel 4 estrellas-----------------");
        System.out.println("-----------2. hotel 5 estrellas-----------------");
        System.out.println("-----------3. Volver Inicio---------------------");
        System.out.println("-----------4. Salir-----------------------------");
        int opcionesMenuUno = 0;
        do {
            System.out.print("Ingrese una opción: ");
            while (!leer.hasNextInt()) {
                System.out.println("Opcion Invalida");
                leer.next(); // Limpiar el valor no numérico ingresado en el escáner
            }
            subMenuHoteles = leer.nextInt();

            switch (subMenuHoteles) {
                case 1:
                    //submenu hotel4
                    
                   hotelCuatro hotelNuevo = new hotelCuatro();
                   hotelNuevo.crearHotel();
                   

                    break;
                case 2:
                    // sub menu hotel 5
                    hotelCinco nuevo = new hotelCinco();
                    nuevo.crearHotel();
                    
                    break;
                case 3:
                    //volver inicio
                    Menus menuUno = new Menus();
                    menuUno.menuInicial();
                    break;
                case 4:
                    //salir
                    System.out.println("saliendo del Gestor de Alojamientos...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (subMenuHoteles != 1 && subMenuHoteles != 2 && subMenuHoteles != 3 && subMenuHoteles != 4);

    }

}
