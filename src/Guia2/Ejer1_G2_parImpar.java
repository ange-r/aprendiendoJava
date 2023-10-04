/*
 Crear un programa que dado un número determine si es par o impar.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer1_G2_parImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número es PAR");
        } else {
            System.out.println("En número es IMPAR");
        } 
        
    }
    
}
