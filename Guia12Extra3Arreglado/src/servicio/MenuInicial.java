package servicio;

import entidad.Alojamiento;
import java.util.Scanner;

public class MenuInicial {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            continuar = crear();
            // Resto del código...
        }
    }

    public static boolean crear() {

        System.out.println("************************************************");
        System.out.println("------------------------------------------------");
        System.out.println("Bienvenidos al sistema de Gestion de Alojamiento");
        System.out.println("--------------------Menú------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("----------------.1 Hoteles----------------------");
        System.out.println("------------------------------------------------");
        System.out.println("----------------.2 Cabañas/Camping--------------");
        System.out.println("------------------------------------------------");
        System.out.println("----------------.3 Salir------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("*************************************************");

        Scanner leer = new Scanner(System.in);

//      
//        }
        boolean continuar = false;
        do {
            System.out.println("Ingrese una opción válida:");
            if (leer.hasNextInt()) {
                int opc = leer.nextInt();
                if (opc >= 1 && opc <= 3) {
                    continuar = true;
                    // Resto del código para el caso válido
                    switch (opc) {
                        case 1:
                            crearHotel nuevoHotel = new crearHotel();
                            nuevoHotel.getClass();
                            break;
                        case 2:
                            CrearAlojamiento alojamiento = new CrearAlojamiento();
                            alojamiento.CrearAlojamiento();
                            break;
                        case 3:
                           System.out.println("Saliendo del programa...");
                           continuar = true;
                            break;
                    }
                } else {
                    System.out.println("Opción ingresada no válida. Intente nuevamente.");
                }
            } else {
                System.out.println("Error: Ingrese un número entero válido.");
                leer.next(); // Descartar el valor no válido ingresado
            }
        } while (!continuar);
        return continuar;
    }

    public static class OpcionInvalidaException extends Exception {

        public OpcionInvalidaException(String mensaje) {
            super(mensaje);
        }
    }
}
