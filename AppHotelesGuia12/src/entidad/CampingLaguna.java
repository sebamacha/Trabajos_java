/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import servicio.Menus;

/**
 *
 * @author SJM
 */
public class CampingLaguna extends Alojamiento {

    Scanner leer = new Scanner(System.in);
    protected int laguna;
    protected int parrillero;
    protected int banio;
    protected int ducha;
    protected int accesoMuelle;

    public CampingLaguna() {
    }

    public CampingLaguna(int laguna, int parrillero, int banio, int ducha, int accesoMuelle, Date fechaIngreso, int cantPersonas) {
        super(fechaIngreso, cantPersonas);
        this.laguna = laguna;
        this.parrillero = parrillero;
        this.banio = banio;
        this.ducha = ducha;
        this.accesoMuelle = accesoMuelle;
    }

    public int getLaguna() {
        return laguna;
    }

    public void setLaguna(int laguna) {
        this.laguna = laguna;
    }

    public int getParrillero() {
        return parrillero;
    }

    public void setParrillero(int parrillero) {
        this.parrillero = parrillero;
    }

    public int getBanio() {
        return banio;
    }

    public void setBanio(int banio) {
        this.banio = banio;
    }

    public int getDucha() {
        return ducha;
    }

    public void setDucha(int ducha) {
        this.ducha = ducha;
    }

    public int getAccesoMuelle() {
        return accesoMuelle;
    }

    public void setAccesoMuelle(int accesoMuelle) {
        this.accesoMuelle = accesoMuelle;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Laguna: " + laguna + "\n"
                + "Parrillero: " + parrillero + "\n"
                + "Baño: " + banio + "\n"
                + "Ducha: " + ducha + "\n"
                + "Acceso al Muelle: " + accesoMuelle;

    }

    public void crearLguna() {
        ArrayList<CampingLaguna> listaLagunas = new ArrayList<CampingLaguna>();
        Scanner leer = new Scanner(System.in);
        // Crear un hotel y cargar sus datos

        CampingLaguna laguna = new CampingLaguna();
        listaLagunas.add(laguna);
        laguna.setBanio(150);
        laguna.setDucha(150);
        laguna.setLaguna(250);
        laguna.setParrillero(150);
        laguna.setAccesoMuelle(300);

        System.out.println("bienvenidos al Camping Tierra 2 ");
        System.out.println("Generando presupuesto...........");
        System.out.println("Ingrese cantidad de personas ");
        laguna.setCantPersonas(leer.nextInt());
        leer.nextLine(); // Consumir el carácter de nueva línea

        System.out.println("Ingrese fecha de ingreso (dd/MM/yyyy)");
        String fechaIngresoStr = leer.nextLine();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaIngreso;
        try {
            fechaIngreso = formatoFecha.parse(fechaIngresoStr);
            // Realizar las operaciones necesarias con la fecha
            // ...

            laguna.setFechaIngreso(fechaIngreso);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido");
        }

        System.out.println("Ingrese cantidad de días");
        int cantidadDias = leer.nextInt();
        leer.nextLine(); // Consumir el carácter de nueva línea

        // presupuesto
        int totalEstadia = (laguna.getCantPersonas() * laguna.getLaguna()) + (laguna.getCantPersonas() * laguna.getBanio())
                + (laguna.getCantPersonas() * laguna.getDucha()) + laguna.getParrillero() + laguna.getAccesoMuelle();
        System.out.println("precios y detalles de estadia");
        System.out.println("----------------------------------------------");
        System.out.println("precio unitario acceso a laguna :$" + laguna.getLaguna());
        System.out.println("Laguna  :" + laguna.getCantPersonas() + " personas :$" + (laguna.getCantPersonas() * laguna.getLaguna()));
        System.out.println("---------------------------------------------");
        System.out.println("precio por acceso a baño por persona :$" + laguna.getBanio());
        System.out.println("precio total: $" + (laguna.getCantPersonas() * laguna.getBanio()));
        System.out.println("---------------------------------------------");
        System.out.println("Precio Duchas por persona :$" + laguna.getDucha());
        System.out.println("Total duchas :$" + (laguna.getCantPersonas() * laguna.getDucha()));
        System.out.println("---------------------------------------------");
        System.out.println("Parillero : $" + laguna.getParrillero());
        System.out.println("---------------------------------------------");
        System.out.println("acceso Muelle :$" + laguna.getAccesoMuelle());
        System.out.println("---------------------------------------------");
        System.out.println(" SU TOTAL ES: $ " + totalEstadia);

        ///fin datos inicio de validacin final
        System.out.println(".1 Para confirmar reserva------------------------");
        System.out.println(".2 Volver al inicio-----------------------------");
        System.out.println(".3 Salir----------------------------------------");

        int opi = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea restante

        boolean opcionValida = false;
        switch (opi) {
            case 1:
                System.out.println("----------Ingrese su nombre--------------");
                String nombreP = leer.next();
                System.out.println("---------Ingrese su apellido-------------");
                String apellidop = leer.next();
                
                try {
                    fechaIngreso = formatoFecha.parse(fechaIngresoStr);

                    Calendar calendario = Calendar.getInstance();
                    calendario.setTime(fechaIngreso);
                    int canDias = cantidadDias;
                    calendario.add(Calendar.DAY_OF_YEAR, canDias);
                    Date fechaSalida = calendario.getTime();
                    System.out.println("--------------Reserva Confirmada-------------- ");
                    System.out.println("Nombre:" + nombreP);
                    System.out.println("Apellido: " + apellidop);
                    System.out.println("Fecha de Ingreso: " + fechaIngresoStr);
                    System.out.println("Fecha de Egreso: " + formatoFecha.format(fechaSalida));

                    System.out.println("*Gracias por Confiar en nosotros*");

                } catch (ParseException e) {
                    System.out.println("Error: Formato de fecha incorrecto. Intente nuevamente.");
                }

                opcionValida = true;
                break;

            case 2:
                System.out.println("Volviendo al menú inicial...");
                // Llama nuevamente al método crear() del menú inicial
                Menus menuUno = new Menus();
                menuUno.menuInicial();
                opcionValida = true;
                break;

            case 3:
                System.out.println("Saliendo......");
                break;

            default:
                // Opción inválida: Mostrar mensaje de error y solicitar nuevamente la opción
                System.out.println("Opción ingresada no válida. Intente nuevamente.");
                opcionValida = false;
                break;
        }

        /////   
    }

}
