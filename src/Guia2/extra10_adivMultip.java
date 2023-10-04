/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra10_adivMultip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*11); // para generar num aleatorios, 
                                            // siempre multiplocar x las cifra que 
                                            // quiera tener (*10, *100, *1000)
        int num2 = (int) (Math.random()*11);   // * 11 -> de 0 a 10.
        int mult = num1 * num2;
        int intento, cont = 0;
        do {
            System.out.println("Adevine el resultado - Ingrese un número: ");
            intento = leer.nextInt();
            cont ++;
                if (intento == mult){
                System.out.println("¡¡HAS ADIVINADO!!");
                } else {
                    System.out.println("Nop... Intenta otra vez.");
                }
        } while (intento != mult && cont < 4);
        System.out.println("Fallaste! El número era; " + mult);
        System.out.println(num1 + " * " + num2 + " = " + mult);
    }
    
}
