/*
 Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números introducidos 
supere el límite inicial.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer5_G2_sumaTope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num0 = leer.nextInt();
        int num1;
        int suma = 0;
        do {
           System.out.println("Ingrese un número");
           num1 = leer.nextInt();
           suma = suma + num1;
           System.out.println(suma);
        }while (suma < num0);
        System.out.println(suma);
   }
}
