/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafin4;
import java.util.Scanner;

public class PracticaFin4 {

    
  
    public static void main(String[] args) {
        Scanner pesos = new Scanner (System.in);
        System.out.println("dame tu cantidad de pesos");
        int cantidad = pesos.nextInt();
        
        pesos.nextLine();
        
        final double dolar = 17.13;
        final double euro = 18.27;
        int cantidad1 = (int) (cantidad/dolar);
        System.out.println("tu cantidad en dolares es: " + cantidad1 );
        int cantidad2 = (int) (cantidad/euro);
        System.out.println("tu cantidad en euros es: " + cantidad2 );
               
            pesos.close();
        
    }
    
}
