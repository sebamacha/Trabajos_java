package servicio;


import java.util.Scanner;

public class crearHotel {

    public crearHotel() {
        Scanner leer = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("---------------SubMenu Hoteles------------------");
        System.out.println("------------------------------------------------");
        System.out.println("------------- .1  Hotel de ****-----------------");
        System.out.println("------------------------------------------------");
        System.out.println("--------------.2  Hotel de *****----------------");
        System.out.println("------------------------------------------------");
        System.out.println("--------------.3  Volver al menu anterior-------");
        System.out.println("------------------------------------------------");
        System.out.println("--------------.4  Salir-------------------------");
        System.out.println("************************************************");

        boolean opcionValida = false;
        do {
            System.out.println("Ingrese una opción válida:");
            if (leer.hasNextInt()) {
                int opc1 = leer.nextInt();
                switch (opc1) {
                    case 1:
                       ServCuatro servCuatro = new ServCuatro();
                       servCuatro.crearServicioCuatro();
                       

                        opcionValida = true;
                        break;
                    case 2:
                        // Acciones para la opción 2
                        opcionValida = true;
                        break;
                    case 3:
                        System.out.println("Volviendo al menú inicial...");
                        // Llama nuevamente al método crear() del menú inicial
                        MenuInicial.crear();
                        opcionValida = true;
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        opcionValida = true;
                        break;
                    default:
                        System.out.println("Opción ingresada no válida. Intente nuevamente.");
                }
            } else {
                System.out.println("Error: Ingrese un número entero válido.");
                leer.next(); // Descartar el valor no válido ingresado
            }
        } while (!opcionValida);

    }

    public static class OpcionInvalidaException extends Exception {

        public OpcionInvalidaException(String mensaje) {
            super(mensaje);
        }
    }
}
