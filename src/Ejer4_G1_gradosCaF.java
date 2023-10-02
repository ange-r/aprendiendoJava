
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
public class Ejer4_G1_gradosCaF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de grados Celsius: ");
        int gradoC = leer.nextInt();

        int gradoF = 32 + (9 * gradoC / 5);

        System.out.println("El equivalante en grados Fahrenheit de: " + gradoC + " es: " + gradoF);
    }
    
}
