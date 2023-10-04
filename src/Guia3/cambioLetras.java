/*
 Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
4
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class cambioLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String ingreso = leer.nextLine();
        cambioLetra(ingreso);
        
    }
// cuando quiero reeemplazar caracteres dentro del switch debo hacer el
// "System.out.prin()"  NO "println()", porque me salta a la siguiente linea
    
    private static void cambioLetra(String ingreso) {
        int largo =  ingreso.length();
        for (int i = 0; i < largo ; i++) {
            switch (ingreso.substring(i,i+1)){
                case  "a":
                    System.out.print("@");
                    break;
                case "e":
                    System.out.print("#");
                    break;
                case "i":
                    System.out.print("$");
                    break;
                case "o":
                    System.out.print("%");
                    break;
                case "u":
                    System.out.print("*");
                    break;
                default:
                    System.out.print(ingreso.substring(i,i+1));
                    break; 
            }
                      
        }
        System.out.println(".");
        System.out.println("");
    }
}

    


    

