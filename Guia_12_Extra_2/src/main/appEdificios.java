/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import entidad.Edificio;
import entidad.Polideportivo;
import entidad.EdificioDeOficinas;
import servicio.Calcular;
import servicio.SerApp;
import servicio.SerOficinas;

public class appEdificios {

    public static void main(String[] args) {
//     
          SerApp s = new SerApp();
         Calcular cal = new Calcular();
         cal.persporEdificio(s.crearedificio());
         
          
    }
    
}
