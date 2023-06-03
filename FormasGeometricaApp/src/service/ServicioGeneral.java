package service;

public class ServicioGeneral {

    public void respuestas() {

        ServicioCirculo sc = new ServicioCirculo();

        sc.area();
        sc.perimetro();
        
        ServicioRectangulo sr = new ServicioRectangulo();
        
        sr.area();
        sr.perimetro();

    }

}
