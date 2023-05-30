
package entidad;
import servicio.iPlanta;

public class Bulbasaur extends Pokemon implements iPlanta {
  // constructor vacio
  public Bulbasaur() {

  }
  // clases abstractas

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");

  }

  @Override
  public void araniazo() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque arañaso");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque Mordisco");

  }

  // implementacion de interfaz
  @Override
  public void atacarDrenaje() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
  }

  @Override
  public void atacarParalizar() {
    System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
  }

}
