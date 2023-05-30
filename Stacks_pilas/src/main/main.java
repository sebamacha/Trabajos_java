/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Stack;

/**
diferencias de arraylist y linkedlits
* ultimo en entrar primero en salir lifo
 */
public class main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("pila vacia + " + pila);
        System.out.println("boleano de esta vacia la pila " + pila.isEmpty());
        
        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);
        
        //recorrido
        for (Integer auxPila : pila) {
            System.out.println(auxPila);
        }
        //mostrar
        System.out.println("pila :" + pila);
        System.out.println("pila vacia ahora? " + pila.isEmpty());
        //eliminar ultimo en entrar
        pila.pop();
        System.out.println("esta el numero 3, ubicacion? ? :" + pila.search(3));
        System.out.println("ultima pila agregada :" + pila.peek());
        System.out.println("Capacidad de la pila " + pila.capacity());
        System.out.println("Primer elemento de la pila " + pila.firstElement());
        System.out.println(pila.contains(pila));
        System.out.println("tamaño de la pila " + pila.size());
        
        
        
    }
    
}
