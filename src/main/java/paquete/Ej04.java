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
public class Ej04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("escanear edad:");

        int edad = scanner.nextInt();

        System.out.println((edad >= 18)? "Es mayor de edad":"Es menor de edad");
        
        /*if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);*/

    }

}
