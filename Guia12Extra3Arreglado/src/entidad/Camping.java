/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones
 */
package entidad;

public class Camping extends AlojamientoExtraHotelero {
    private int capCarpas;
    private int cantBanios;
    private boolean resto;

    public Camping() {
    }

    public Camping(int capCarpas, int cantBanios, boolean resto) {
        this.capCarpas = capCarpas;
        this.cantBanios = cantBanios;
        this.resto = resto;
    }

    public int getCapCarpas() {
        return capCarpas;
    }

    public void setCapCarpas(int capCarpas) {
        this.capCarpas = capCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "Camping{" + "capCarpas=" + capCarpas + ", cantBanios=" + cantBanios + ", resto=" + resto + '}';
    }
    
    

}