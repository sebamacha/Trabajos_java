
package entidad;
import servicio.iElectrico;

public class Pikachu extends Pokemon implements iElectrico {
  // constructor vcio

  public Pikachu() {

  }

  // clases abstractas
  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Pikachu y este es mi ataque placaje");

  }

  @Override
  public void araniazo() {
    System.out.println("Hola soy Pikachu y este es mi ataque arañaso");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");

  }

  // implementa interfaz

  @Override
  public void atacarImpactrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque Impactrueno");

  }

  @Override
  public void atacarPunioTrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque PunioTrueno");

  }

}