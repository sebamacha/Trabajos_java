/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaz.AccionCalculo;

/**
 *
 * @author Usuario
 */
public abstract class Circulo  {
    private Integer radio;
    private Double PI = 3.14;

    public Circulo() {
    }

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public Double getPI() {
        return PI;
    }

    public void setPI(Double PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", PI=" + PI + '}';
    }


    
    
    
    
}
