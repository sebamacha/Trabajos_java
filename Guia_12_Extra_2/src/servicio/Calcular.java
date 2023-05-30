package servicio;

import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author SJM
 */
public class Calcular {

    public void persporEdificio(ArrayList<Edificio> edificio) {
        int contador = 0;
        for (Edificio edificio1 : edificio) {
            if (edificio1 instanceof EdificioDeOficinas) {
                contador++;
                EdificioDeOficinas aux = (EdificioDeOficinas) edificio1;
                int numPersoPiso = aux.getCantPersonasOficina() * aux.getCantidadOficinas();
                System.out.println("en edificio " + contador + "  por piso entran " + numPersoPiso);
                int calpisos = numPersoPiso * aux.getNumerosPisos();
                System.out.println("en edificio " + contador + "  un total de  " + calpisos);
                System.out.println("la Superficie es " + aux.calcularSuperficie());
                System.out.println("el volumen es " + aux.calcularVolumen());

            } else {
                System.out.println("polideportivo ");
                Polideportivo aux = (Polideportivo) edificio1;
                System.out.println("la Superficie es " + aux.calcularSuperficie());
                System.out.println("el volumen es " + aux.calcularVolumen());

            }

        }

    }

}

}
