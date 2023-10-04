package guia3;


import java.util.Scanner;

/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario 
si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”
 */

/**
 *
 * @author angel
 */
public class Ejer2_G3_nombreEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String respuesta;
            do {
                mayorMenor();
                
                System.out.println("¿Desea mostrar mas datos? s/n");
                respuesta = leer.nextLine();
            } while (!respuesta.equals("n"));
        }
/*  System.out.println( i+1 + nombre + edad);
    System.out.println(retorno);
   */
    private static void mayorMenor() {
        Scanner leer = new Scanner(System.in);
                      

        System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.println(""); 

        System.out.println("Ingrese edad: ");
        int edad = leer.nextInt();
        System.out.println("");
       

        if(edad >= 18){
            System.out.println(nombre + edad + ": Mayor de edad");
        } else {
            System.out.println(nombre + edad + ": Menor de edad");
        }
        System.out.println("");

            }
     }
    


    