/*
 Implementar un programa que le pida dos números enteros al usuario y 
determine si ambos o alguno de ellos es mayor a 25.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un número entero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        if (num >= 25){
        System.out.println("El número ingresado es mayor a 25");
        }else {
        System.out.println("El número ingresado es menor a 25");
        }
    }
    
}
