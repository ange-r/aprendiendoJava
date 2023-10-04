/*
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package guia4;

/**
 *
 * @author angel
 */
public class extra2_igualesOno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = (int) (Math.random()*5); //tamaño del vector
        int B = (int) (Math.random()*5);
        int [] vector1 = new int [A]; 
        int [] vector2 = new int [B]; 
       
        System.out.println("Los vectores son iguales: " + vectoresIguales(vector1, vector2));
    }
    public static boolean vectoresIguales(int vector1[], int vector2[]) {
        if (vector1.length == vector2.length){
            for (int i = 0; i < vector2.length; i++) {
                if (vector1[i] != vector2[i]){
                return false;
                }
            
            }
        } else {
            return false;
        }
    return true;
    }
}
