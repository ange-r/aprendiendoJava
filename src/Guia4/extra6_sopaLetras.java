/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra6_sopaLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String [] palabras = new String[5];
        System.out.println("Ingrese las 5 palabras: ");
        int i,j;
        for (i = 0; i < 5; i++) {
            palabras[i] = entrada.next();
        }
        char [][] matriz = new char [20][20];
        Random rnd = new Random();
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 20; j++) {
               matriz[i][j] =(char) (rnd.nextInt(9) +'0');
            }
        }
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 20; j++) {
            System.out.print(matriz[i][j]+" ");    
            }
            System.out.println("");
        }
        System.out.println("");
     
        for (i = 0; i < 5; i++) {
        int filas = (int) (Math.random()*20);
        int columnas =(int) (Math.random()*20+1-palabras[i].length());
            for (j = 0; j < palabras[i].length(); j++) {
                matriz[filas][columnas+j] = palabras[i].charAt(j);
            }
        }
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}


/*public class Ejercicio6V2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char[][] matriz = new char[20][20];
        String palabra;
        Random random = new Random();
        int aleatorio;
        //pide palabras y las ingresa a la matriz
        for (int i = 0; i < 5; i++) {
            aleatorio = random.nextInt(20);
            do {
                System.out.println("Ingresa una palabra de 3 a 5 caracteres");
                palabra = leer.next();
            } while (palabra.length() > 5 || palabra.length() < 3);
            for (int j = 0; j < palabra.length(); j++) {
                matriz[aleatorio][j] = palabra.charAt(j);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == '\u0000') {
                    matriz[i][j] = (char) ('0' + random.nextInt(10));
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/