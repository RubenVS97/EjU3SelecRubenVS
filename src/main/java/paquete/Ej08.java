/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author diabl
 */
public class Ej08 {

    public static void main(String[] args) {

        //Lo que hace el programa es que inicializa un char con valor de 'B' lo cual haría que entrase en el switch en el segundo case por lo cual diese el valor de RRHH 
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
        }
        System.out.println("Código para el departamento es " + departamento);

    }

}
