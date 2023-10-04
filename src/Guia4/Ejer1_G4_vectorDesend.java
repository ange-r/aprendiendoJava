/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.

 */
package guia4;

/**
 *
 * @author angel
 */
public class Ejer1_G4_vectorDesend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vector = new int [100];
        for (int i = 99; i >= 0 ; i--) {
            vector[i] = i;
            
            System.out.println(vector[i]);
        }
    }
    
}
