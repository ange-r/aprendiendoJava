/*
 Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1 12
123
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra13_escaleraNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuán grande sera la escalera?");
        int altura = leer.nextInt(); 
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {  //aca las siguientes van hasta igualar i
                                            //que a su vez va a llegar hasta la altura ingrsada
                System.out.print((j + 1));
            }
            System.out.println();
        }
    }       
}
