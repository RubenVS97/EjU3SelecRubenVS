/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruben;

import java.util.Scanner;

/**
 *
 * @author diabl
 */
public class Ej02 {

    public static void main(String[] args) {

        /*Utilizando el operador ternario ?: de Java, implementa las siguientes sentencias:
        Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se devolverá “menor”. Las cadenas que se devuelven se guardarán en una variable llamada resultado.
        Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá “Mayor que cero”.
        Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())*/
        
        Scanner t = new Scanner(System.in);
        int x, resultado;

        System.out.println("Introduzca un número");

        x = t.nextInt();
        
        System.out.println(x >= 135 ? " Es mayor":"Es menor");
        
        System.out.println(x >= 0 ? "Es mayor que cero":"Es menor que cero");
        
    }

}
