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
public class Ejer5_G4_matAntisist_cristian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de filas y columnas de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();

        int[][] matriz = new int[n][m];
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("La suma de todos sus elementos es de " + suma);
    }
}

