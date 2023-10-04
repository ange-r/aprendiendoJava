/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido

 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer2_G4_busqNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        int cont = 0;
       
        System.out.println("Ingrese un número a buscar");
        int x = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
           vector [i] = (int) (Math.random()*10);    
/// si quiero un num entre 1 y 10 se pone Match.random()+ 10 + 1///*        
            System.out.println(vector [i]);
        }
                
        for (int i = 0; i < n; i++) {
            if (vector [i] == x){
                cont ++;
                System.out.println("La posición del número es: " + i);
                          
            } 
            if (cont > 1){
                System.out.println("El número se repite");
                
            }
        }
    }
    
    
}
