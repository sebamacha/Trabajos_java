
package entidad;
import servicio.iAgua;

public class Squirtle extends Pokemon implements iAgua {
  // constructor
  public Squirtle() {
  }

  // clases abstractas
  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Squirtle y este es mi ataque placaje");

  }

  @Override
  public void araniazo() {
    System.out.println("Hola soy Squirtle y este es mi ataque arañaso");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Squirtle y este es mi ataque Mordisco");

  }
  // implementacion de interfaz

  @Override
  public void atacarHidrobomba() {

    System.out.println("Hola soy Squirtle y este es mi ataque Hidrobomba");
  }

  @Override
  public void atacarBurbuja() {
    System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");

  }

  @Override
  public void atacarPistolaAgua() {
    System.out.println("Hola soy Squirtle y este es mi ataque Pistola Agua");

  }

}
