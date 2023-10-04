/*
 Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra8_multip5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int ingreso, cant = 0, pares = 0, impares = 0;
        do{ 
            System.out.print("Ingrese un número: ");
            ingreso = leer.nextInt();
            cant++;
            if (ingreso % 2 == 0){
                pares++;
            }else {
                impares++;
            }
        }while (ingreso % 5 != 0);
        System.out.println("Se ingresaron: " + cant + " números.");
        System.out.println("Se ingresaron: " + pares + " números pares.");    
        System.out.println("Se ingresaron: " + impares + " números impares.");
    }        
    
}
