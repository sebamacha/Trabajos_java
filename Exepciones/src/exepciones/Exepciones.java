/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepciones;

/**
 *
 * @author SJM
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            int resultado = 3 / 0;
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
            
        }
        
        int edades [] = { 15 , 47 , 52 , 41 , 01 , 0 ,3};
       
        try { System.out.println("la edad en la posicion 8 es :" + edades[8]);
            
        } catch (Exception e) {
        } System.out.println("el indice no existe");
        
        
        
       
    }
    
}
