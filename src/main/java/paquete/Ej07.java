/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Scanner;

/**
 *
 * @author diabl
 */
public class Ej07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        double lado, areaCuadrado, areaTriangulo, areaCirculo, radio, base, altura;
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                System.out.println("Introduzca el lado");
                lado = entrada.nextDouble();
                areaCuadrado = Math.pow(lado, 2);
                System.out.println("El área es de: " + areaCuadrado);
                break;
            case 2:
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introduzca la base");
                base = entrada.nextDouble();
                System.out.println("Introduzca la altura");
                altura = entrada.nextDouble();
                areaTriangulo = (base * altura) / 2;
                System.out.println("El área es de: " + areaTriangulo);
                break;
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                System.out.println("Introduzca el readio");
                radio = entrada.nextDouble();
                areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El área es de: " + areaCirculo);
            default:
                System.out.println("Ha seleccionado terminar");

        }

    }
}
