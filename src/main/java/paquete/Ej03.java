/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruben;

/**
 *
 * @author diabl
 */
public class Ej03 {
    
        public static void main(String[] args) {
        
        boolean unaCondicion = true;
        //resultado = unaCondicion ? valor1 : valor2;
        
        int x = 10;
        int y = (x > 9) ? 100 : 200;
            System.out.println(y);
        
        
        int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
                        
        
    }
    
}
