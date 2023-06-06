
package servicio;

import entidad.CampingLaguna;
import entidad.CampingRio;
import java.util.Scanner;


public class CampingMenu {
    
     public void menuCamping() {
        Scanner leer = new Scanner(System.in);
        int subMenuCamping = 0;
        System.out.println("--------------Sub Menu Hoteles------------------");
        System.out.println("-----------1. Camping con Laguna-----------------");
        System.out.println("-----------2. Camping con rio-----------------");
        System.out.println("-----------3. Volver Inicio---------------------");
        System.out.println("-----------4. Salir-----------------------------");
        int opcionesMenuUno = 0;
        do {
            System.out.print("Ingrese una opción: ");
            while (!leer.hasNextInt()) {
                System.out.println("Opcion Invalida");
                leer.next(); // Limpiar el valor no numérico ingresado en el escáner
            }
            subMenuCamping = leer.nextInt();

            switch (subMenuCamping) {
                case 1:
                    //camping con laguna
                    CampingLaguna laguna = new CampingLaguna();
                    laguna.crearLguna();

                    break;
                case 2:
                    //camping con rio
                    break;
                case 3:
                    //volver al inicio
                  CampingRio rio = new CampingRio();
                  rio.crearLguna();
                    break;
                case 4:
                    //salir
                    System.out.println("saliendo del Gestor de Alojamientos...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (subMenuCamping != 1 && subMenuCamping != 2 && subMenuCamping != 3 && subMenuCamping != 4);

    }
    
}
