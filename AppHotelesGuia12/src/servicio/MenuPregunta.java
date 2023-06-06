/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import entidad.Hotel;
import java.util.Scanner;

/**
 *
 * @author SJM
 */
public class MenuPregunta  extends Hotel{
    Scanner leer = new Scanner (System.in);
    
    public void  pregunta(){
        System.out.println("1. desea cargar datos");
        System.out.println("2. volver al menu inicial");
        System.out.println("3. salir");
        
         int opcPregunta = 0;
        do {
            System.out.print("Ingrese una opción: ");
            while (!leer.hasNextInt()) {
                System.out.println("Opcion Invalida");
                leer.next(); // Limpiar el valor no numérico ingresado en el escáner
            }
            opcPregunta = leer.nextInt();

            switch (opcPregunta) {
                case 1:
                    //carga datos
                    CargaDatosHotel carga = new  CargaDatosHotel();
                    carga.carga();

                case 2:
                    //volver inicio
                    Menus menuUno = new Menus();
                    menuUno.menuInicial();
                    break;
                case 3:
                    //salir
                    System.out.println("saliendo del Gestor de Alojamientos...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcPregunta != 1 && opcPregunta != 2 && opcPregunta != 3);
        
        
        
        
    
    
    }
    
}
