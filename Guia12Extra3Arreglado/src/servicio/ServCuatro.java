package servicio;

import entidad.HotelCuatroEstrellas;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ServCuatro {

    Scanner leer = new Scanner(System.in);
    HotelCuatroEstrellas hotelCuatro = new HotelCuatroEstrellas() {
        @Override
        public void crearHote() {

        }
    };

    public void crearServicioCuatro() {
        //seteo hotel
        hotelCuatro.setNombre("Saturday");
        hotelCuatro.setDireccion("ALverar 555");
        hotelCuatro.setLocalidad("Rosario");
        hotelCuatro.setGerente("Pedro Funes");
        hotelCuatro.setCantidadEstrellas(4);
        System.out.println("----------------Bienvenidos--------------------");
        System.out.println("Hotel: " + hotelCuatro.getNombre());
        System.out.println("Direccion: " + hotelCuatro.getDireccion());
        System.out.println("Localidad: " + hotelCuatro.getLocalidad());
        System.out.println("Gerente General: " + hotelCuatro.getGerente());
        System.out.println("Calificacion en estrellas: " + hotelCuatro.getCantidadEstrellas());
        int personasCant;
        boolean opcionValida;
        do {
            System.out.println("**INGRESE CANTIDAD DE PERSONAS**");
            while (!leer.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
                leer.next(); // Descartar el valor no válido ingresado
            }
            personasCant = leer.nextInt();
        } while (personasCant <= 0);
        int sumaPersonas = personasCant;

        System.out.println("Ingrese cantidad de dias");
        int canDias = leer.nextInt();

        do {
            System.out.println("**Ingrese la cantidad de Habitaciones**");
            while (!leer.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
                leer.next(); // Descartar el valor no válido ingresado
            }
        } while (personasCant <= 0);
        hotelCuatro.setCantHabitaciones(leer.nextInt());
        hotelCuatro.setPrecioHabitacion(250);
        int room = hotelCuatro.getCantHabitaciones() * hotelCuatro.getPrecioHabitacion();
        System.out.println("****************************");
        System.out.println("Ingrese opcion:");
        System.out.println("****************************");
        System.out.println("1. Solo Desayuno");
        System.out.println("2. Media pension");
        System.out.println("3. Pension Completa");
        int pension = 0;

        opcionValida = false;
        do {
            System.out.println("Ingrese una opción válida:");
            while (!leer.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
                leer.next(); // Descartar el valor no válido ingresado
            }
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    pension = 150;
                    opcionValida = true;
                    break;
                case 2:
                    pension = 250;
                    opcionValida = true;
                    break;
                case 3:
                    pension = 500;
                    opcionValida = true;
                    break;
                default:
                    System.out.println("Opción ingresada no válida. Intente nuevamente.");
            }
        } while (!opcionValida);

        //crear variable cochera
        char cochera;
        int sumCochera = 0;
        opcionValida = false;

        do {
            System.out.println("Incluir cochera? [S/N]");
            String input = leer.next().toLowerCase();
            cochera = input.charAt(0);

            if (cochera == 's') {
                sumCochera = 250;
                opcionValida = true;
            } else if (cochera == 'n') {
                sumCochera = 0;
                opcionValida = true;
            } else {
                System.out.println("Opción ingresada no válida. Intente nuevamente.");
                opcionValida = false;
            }
        } while (!opcionValida);
        System.out.println("Cantidad de cocheras: ");
        int cantCocheras = leer.nextInt();
        int sumaCochera = (cantCocheras * sumCochera);
        int total = (sumaPersonas * pension + room + sumaCochera);
        System.out.println("---------Sus datos y total------------------- ");
        System.out.println("Cantidad de personas " + personasCant);
        System.out.println("Cantidad de Dias " + canDias);
        System.out.println("Precio de las Habitaciones: $" + hotelCuatro.getPrecioHabitacion());
        System.out.println("Cantidad de habitaciones: " + hotelCuatro.getCantHabitaciones());
        System.out.println("Total de precio Habitaciones: $" + room);
        System.out.println("Restaurant por persona: $" + pension);
        System.out.println("Total de Restaurant: $" + (pension * sumaPersonas));
        System.out.println("Cochera: $" + sumCochera);
        System.out.println("Cantidad de Cocheras: " + cantCocheras);
        System.out.println("Total Cocheras: $" + sumaCochera);
        System.out.println("Su total es:  $" + total);
        System.out.println("------------------------------------------------");
        System.out.println(".1 Para confirmar reserva------------------------");
        System.out.println(".2 Volver al inicio-----------------------------");
        System.out.println(".3 Salir----------------------------------------");
        int opi = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea restante

        switch (opi) {
            case 1:
                System.out.println("----------Ingrese su nombre--------------");
                String nombreP = leer.next();
                System.out.println("---------Ingrese su apellido-------------");
                String apellidop = leer.next();
                System.out.println("-----Ingrese fecha de ingreso------------");
                leer.nextLine(); // Descartar el salto de línea residual
                String fechaIngresoStr = leer.nextLine();

                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaIngreso;
                try {
                    fechaIngreso = formatoFecha.parse(fechaIngresoStr);

                    Calendar calendario = Calendar.getInstance();
                    calendario.setTime(fechaIngreso);
                    calendario.add(Calendar.DAY_OF_YEAR, canDias);
                    Date fechaSalida = calendario.getTime();
                    System.out.println("--------------Reserva Confirmada-------------- ");
                    System.out.println("Nombre:" + nombreP);
                    System.out.println("Apellido: " + apellidop);
                    System.out.println("Fecha de Ingreso: " + fechaIngresoStr);
                    System.out.println("Fecha de Egreso: " + formatoFecha.format(fechaSalida));
                    System.out.println("Cantidad de personas " + personasCant);
                    System.out.println("Cantidad de Dias " + canDias);
                    System.out.println("Precio de las Habitaciones: $" + hotelCuatro.getPrecioHabitacion());
                    System.out.println("Cantidad de habitaciones: " + hotelCuatro.getCantHabitaciones());
                    System.out.println("Total de precio Habitaciones: $" + room);
                    System.out.println("Restaurant por persona: $" + pension);
                    System.out.println("Total de Restaurant: $" + (pension * sumaPersonas));
                    System.out.println("Cochera: $" + sumCochera);
                    System.out.println("Cantidad de Cocheras: " + cantCocheras);
                    System.out.println("Total Cocheras: $" + sumaCochera);
                    System.out.println("Su total es:  $" + total);
                    System.out.println("*Gracias por Confiar en nosotros*");
                } catch (ParseException e) {
                    System.out.println("Error: Formato de fecha incorrecto. Intente nuevamente.");
                    
                        
                }
            case 2:
                 System.out.println("Volviendo al menú inicial...");
                        // Llama nuevamente al método crear() del menú inicial
                        MenuInicial.crear();
                        opcionValida = true;
                        break;
            case 3: System.out.println("Saliendo......");
                break;
            default:
        // Opción inválida: Mostrar mensaje de error y solicitar nuevamente la opción
        System.out.println("Opción ingresada no válida. Intente nuevamente.");
        opcionValida = false;
        break;
}    
                
        }

    }

