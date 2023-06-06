package servicio;

import java.util.Scanner;

public class Menus {
    Scanner leer = new Scanner(System.in);

    public void menuInicial() {
        int opcionesMenuUno;

        System.out.println("--------Sistema Gestor de Lojamientos----------");
        System.out.println("1.----------Consultas de Hoteles---------------");
        System.out.println("2.----------Consultas de Camping---------------");
        System.out.println("3.------------------Salir----------------------");
        
        do {
            System.out.print("Ingrese una opción: ");
            while (!leer.hasNextInt()) {
                System.out.println("Opcion Invalida");
                leer.next(); // Limpiar el valor no numérico ingresado en el escáner
            }
            opcionesMenuUno = leer.nextInt();
            
            switch (opcionesMenuUno) {
                case 1:
                    MenuHoteles hotel = new MenuHoteles();
                    hotel.menuHotel();
                            
                    break;
                case 2:
                    CampingMenu camping = new CampingMenu();
                    camping.menuCamping();
                    break;
                case 3:
                    System.out.println("saliendo del Gestor de Alojamientos...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcionesMenuUno != 1 && opcionesMenuUno != 2 && opcionesMenuUno != 3);
    }
}
