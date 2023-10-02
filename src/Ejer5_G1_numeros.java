
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class Ejer5_G1_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado
        y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int num1 = leer.nextInt();

        int doble = num1 * 2;
        int triple = num1 * 3;
        double raiz = Math.sqrt(num1);

        System.out.println("El valor doble del numero ingresado es: " + doble + " - El valor triple es: " + triple + " - La raíz cuadrada es: " + raiz);

    }
    
}
