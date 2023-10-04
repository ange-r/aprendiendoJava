/*
  Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra7_bucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar:");
        int cant = leer.nextInt();
        int valMax = 0, valMin = 1000, i = 0, suma = 0;
        double prom = 0;
        while (i < cant){
            System.out.print("Ingrese un número:");
            int ingreso = leer.nextInt();
            
            suma += ingreso;
            i++;
                if (ingreso > valMax){
                    valMax = ingreso;
                }if (ingreso < valMin) {
                    valMin = ingreso;
                }   
        } 
        prom = suma/cant;
        System.out.println("El valor minimo ingresado fue: " + valMin);
        System.out.println("El valor maximo ingresado fue: " + valMax);
        System.out.println("El numero promedio fue: " + prom );
    }
}
