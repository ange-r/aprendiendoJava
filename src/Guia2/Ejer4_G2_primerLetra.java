/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer4_G2_primerLetra {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = entrada.nextLine();
        String letra = palabra.substring(0,1);
        if(letra.equalsIgnoreCase("a")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
            }
          
        }

    }

