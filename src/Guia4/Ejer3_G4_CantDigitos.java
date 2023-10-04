/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer3_G4_CantDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int i;
        int cont1 = 0; 
        int cont2 = 0; 
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (i=0; i<n;i++){
            vector[i] = (int)(Math.random()*100000);
        }
        for (i=0;i<n;i++){
            if (vector[i] >= 0 && vector[i] < 10){
                cont1++;
            }else if (vector[i]>= 10 && vector[i] < 100){
                cont2++;
            } else if (vector[i]>= 100 && vector[i] < 1000){
                cont3++;
            } else if (vector[i]>= 1000 && vector[i] < 10000){
                cont4++;
            } else if (vector[i]>= 10000 && vector[i] < 100000){
                cont5++;
            }
        }
        System.out.println("Hay" + cont1 + "números de 1 dígito");
        System.out.println("Hay" + cont2 + "números de 2 dígitos");
        System.out.println("Hay" + cont3 + "números de 3 dígitos");
        System.out.println("Hay" + cont4 + "números de 4 dígitos");
        System.out.println("Hay" + cont5 + "números de 5 dígitos");
            }
    
    
}
