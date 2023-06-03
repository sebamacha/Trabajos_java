/*Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.*/
package entidad;

public class HotelCincoEstrellas extends Hoteles {

    private String nombreRestaurante;
    private int precioHabitaciones;
    private int salonesCoferencias;
    private int suites;
    private int cantLimusinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(String nombreRestaurante, int precioHabitaciones, int salonesCoferencias, int suites, int cantLimusinas, int cantidadEstrellas, int CantHabitaciones, int numCamas, int canPisos, char gimnasio) {
        super(cantidadEstrellas, CantHabitaciones, numCamas, canPisos, gimnasio);
        this.nombreRestaurante = nombreRestaurante;
        this.precioHabitaciones = precioHabitaciones;
        this.salonesCoferencias = salonesCoferencias;
        this.suites = suites;
        this.cantLimusinas = cantLimusinas;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getSalonesCoferencias() {
        return salonesCoferencias;
    }

    public void setSalonesCoferencias(int salonesCoferencias) {
        this.salonesCoferencias = salonesCoferencias;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    @Override
    public String getGerente() {
        return super.getGerente(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setGerente(String Gerente) {
        super.setGerente(Gerente); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getLocalidad() {
        return super.getLocalidad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setLocalidad(String localidad) {
        super.setLocalidad(localidad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
 
}