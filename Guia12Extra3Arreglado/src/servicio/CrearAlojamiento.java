/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.Scanner;

/**
 *
 * @author SJM
 */
public class CrearAlojamiento {
    public void CrearAlojamiento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("*************************************************");
        System.out.println("-------------------------------------------------");
        System.out.println("**********--SubMenu Alojamientos--***************");
        System.out.println("-------------------------------------------------");
        System.out.println("---------------.1  Camping-----------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("---------------.2  Residencias-------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("---------------.3  Volver al menu anterior-------");
        System.out.println("-------------------------------------------------");
        System.out.println("---------------.4  Salir-------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("*************************************************");

        int opc1 = leer.nextInt();

        switch (opc1) {
            case 1:
                // Acciones para la opción 1
                break;
            case 2:
                // Acciones para la opción 2
                break;
            case 3:
                System.out.println("Volviendo al menú inicial...");
                // Llama nuevamente al método crear() del menú inicial
                MenuInicial.crear();
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                try {
                    throw new OpcionInvalidaException("Opción ingresada no válida");
                } catch (OpcionInvalidaException e) {
                    System.out.println("Error: " + e.getMessage());
                }
        }
    }

    public static class OpcionInvalidaException extends Exception {
        public OpcionInvalidaException(String mensaje) {
            super(mensaje);
        }
    }
}
