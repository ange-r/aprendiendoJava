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
public class extra7_fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber su posicion en fibo: ");
        int n = entrada.nextInt();
        int i,a,b,aux;
        a = 1;
        b = 1;
        for (i = 0; i < n; i++) {
            System.out.print(a+" ");
            aux = a+b;
            a = b;
            b = aux;
        }
    }
    
}
