/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer3_G2_largo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese una palabra o frase");
        String frase = leer.nextLine();
        int longitud = frase.length();
        if(longitud == 8){ 
            System.out.println("Correcto");  
       
       }else {
           System.out.println("Incorrecto");
       }
    }
}
