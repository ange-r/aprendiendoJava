/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra1_sumaVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("}Ingrese tamaño del vector: ");
        int tam = leer.nextInt(); //tamaño del vector
        int [] vector = new int [tam]; 
        int suma = 0;
        for (int i=0; i < vector.length ;i++){
            System.out.print("Ingrese un valor: ");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de todos los vectors es: " + suma);
    }
}
