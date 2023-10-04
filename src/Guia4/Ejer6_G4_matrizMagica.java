/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer6_G4_matrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresame el tamaño de la matriz: ");
        int n = entrada.nextInt();
        int [][] matriz = new int [n][n];
        int i,j;
        int suma = 0;
       
        System.out.println("Ingrese numeros: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        // sumar filas
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }// fin filas:
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
        }
         System.out.println("La suma de las Filas es: "+suma);
        /// sumar columnas
        int suma2 = 0;
        for (j = 0; j < n; j++) {
            for (i = 0; i < n; i++) {
                suma2 += matriz[i][j];
            }
        }
        System.out.println("La suma de la columnas es: "+suma2);
        // sumar las diagonales;
        int sumadiagonal = 0, sumadiagonal2 = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    sumadiagonal += matriz[i][j];
                }
                if (i + j == n-1) {
                    sumadiagonal2 += matriz[i][j];
                }
            }
        }
        System.out.println("suma diagonal: "+sumadiagonal);
        System.out.println("Suma diagoanl: "+sumadiagonal2);
        boolean bandera = false;
        if (sumadiagonal == sumadiagonal2) {
            bandera = true;
        }
        if ((suma == suma2) && (bandera == true)) {
            System.out.println("Es una matriz magica");
        }else{
            System.out.println("No es una matriz mágica");
        }
    }
    
}
