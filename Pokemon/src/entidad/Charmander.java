
package entidad;
import servicio.iFuego;

public class Charmander extends Pokemon implements iFuego {
  // constructor vacio
  public Charmander() {

  }

  // clases abstractas
  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Charmander y este es mi ataque placaje");

  }

  @Override
  public void araniazo() {
    System.out.println("Hola soy Charmander y este es mi ataque arañaso");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Charmander y este es mi ataque Mordisco");

  }

  @Override
  public void atacarPunioFuego() {
    System.out.println("Hola soy Charmander y este es mi ataque Punio Fuego");

  }
  // implmentacion de interfaz

  @Override
  public void atacarLanzaLLamas() {
    System.out.println("Hola soy Charmander y este es mi ataque Lanza Llamas");

  }

  @Override
  public void atacarAscuas() {
    System.out.println("Hola soy Charmander y este es mi ataque Ascuas");

  }
}