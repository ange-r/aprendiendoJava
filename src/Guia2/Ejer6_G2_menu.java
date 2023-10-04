/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se 
vuelve a mostrar el menú.



 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer6_G2_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       char salir = 0;
       do {
           System.out.println("Ingrese dos números:");
           int num1 = leer.nextInt();
           int num2 = leer.nextInt();        
           System.out.println("Indique qué desea hacer:");
           System.out.println("Menu: ");
           System.out.println("1-Sumar");
           System.out.println("2-Restar");
           System.out.println("3-multiplica");
           System.out.println("4-Dividir");
           System.out.println("5-Salir");
           
           int opcion = leer.nextInt();
           switch (opcion){
                   case 1:
                        int suma = num1 + num2;
                        System.out.println("La suma de los números ingresados es " + suma);
                        break;
                   case 2: 
                        int resta = num1 - num2;
                        System.out.println("La resta de los números ingresados es" + resta);
                        break;
                   case 3:
                       int multiplicacion = num1 * num2;
                       System.out.println("El producto de los números ingresads es " + multiplicacion);
                       break;
                   case 4:
                       int division = num1 / num2;
                       System.out.println("El cociente de los números ingresados es: " + division);
                       break;
                   case 5:
                       System.out.printf("%n¿Está seguro que desea salir del programa (S/N)?%n");
                    salir = leer.next().charAt(0);
                    salir = Character.toLowerCase(salir);
           }                           
       } while (salir != 's');                   
           
     }
}
    
    

