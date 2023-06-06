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
public class CampingRio extends Alojamiento{
    Scanner leer = new Scanner(System.in);
    protected int rios;
    protected int parrillero;
    protected int banio;
    protected int ducha;
    protected int accesoMuelle;
    //contructores y setter and getter

    public CampingRio() {
    }

    public CampingRio(int rio, int parrillero, int banio, int ducha, int accesoMuelle, Date fechaIngreso, int cantPersonas) {
        super(fechaIngreso, cantPersonas);
        this.rios = rio;
        this.parrillero = parrillero;
        this.banio = banio;
        this.ducha = ducha;
        this.accesoMuelle = accesoMuelle;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getRio() {
        return rios;
    }

    public void setRio(int rio) {
        this.rios = rio;
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
    
    
    
    //
    
    public void crearLguna() {
        ArrayList<CampingRio> listarios = new ArrayList<CampingRio>();
        Scanner leer = new Scanner(System.in);
        // Crear un hotel y cargar sus datos

        CampingRio rio = new CampingRio();
        listarios.add(rio);
        rio.setBanio(150);
        rio.setDucha(150);
        rios = 500;
        rio.setParrillero(150);
        rio.setAccesoMuelle(300);

        System.out.println("bienvenidos al Camping Rio Freso ");
        System.out.println("Generando presupuesto...........");
        System.out.println("Ingrese cantidad de personas ");
        rio.setCantPersonas(leer.nextInt());
        leer.nextLine(); // Consumir el carácter de nueva línea

        System.out.println("Ingrese fecha de ingreso (dd/MM/yyyy)");
        String fechaIngresoStr = leer.nextLine();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaIngreso;
        try {
            fechaIngreso = formatoFecha.parse(fechaIngresoStr);
            // Realizar las operaciones necesarias con la fecha
            // ...

            rio.setFechaIngreso(fechaIngreso);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido");
        }

        System.out.println("Ingrese cantidad de días");
        int cantidadDias = leer.nextInt();
        leer.nextLine(); // Consumir el carácter de nueva línea

        // presupuesto
        int totalEstadia = (rio.getCantPersonas() * rio.getRio()) + (rio.getCantPersonas() * rio.getBanio())
                + (rio.getCantPersonas() * rio.getDucha()) + rio.getParrillero() + rio.getAccesoMuelle();
        System.out.println("precios y detalles de estadia");
        System.out.println("----------------------------------------------");
        System.out.println("precio unitario acceso a rio :$" + rio);
        System.out.println("rio  :" + rio.getCantPersonas() + " personas :$" + (rio.getCantPersonas() + rios));
        System.out.println("---------------------------------------------");
        System.out.println("precio por acceso a baño por persona :$" + rio.getBanio());
        System.out.println("precio total: $" + (rio.getCantPersonas() * rio.getBanio()));
        System.out.println("---------------------------------------------");
        System.out.println("Precio Duchas por persona :$" + rio.getDucha());
        System.out.println("Total duchas :$" + (rio.getCantPersonas() * rio.getDucha()));
        System.out.println("---------------------------------------------");
        System.out.println("Parillero : $" + rio.getParrillero());
        System.out.println("---------------------------------------------");
        System.out.println("acceso Muelle :$" + rio.getAccesoMuelle());
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
    
}
}