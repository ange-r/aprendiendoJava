/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer8_G2_rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado:");
        int lado = leer.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                 if (i == 0 || i == lado-1 || j == 0 || j == lado-1){
                     System.out.print(" * ");
            } else {
                     System.out.print("   "); 
                    
                 }               
            }
            System.out.println("");
            
        }
    }
    
}
