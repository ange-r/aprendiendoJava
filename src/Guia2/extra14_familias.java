/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra14_familias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuantas familias son?: ");
        int cantFam = leer.nextInt();
        int contF = 1, contH = 1, cantH = 0, sumaHijos = 0, sumaEdad = 0;
        for (int i = 0; i < cantFam; i++) {
            System.out.print("Familia " + contF + "¿Cuántos hijos tiene?");
            cantH = leer.nextInt();
            sumaHijos += cantH;
            for (int j = 0; j < cantH; j++) {
                System.out.println("Hijo " + contH + ": ¿Qué edad tiene?");
                sumaEdad += leer.nextInt();
                contH++;
            }      
            contF++; 
        }
            
        int promEdad = sumaEdad / sumaHijos;
        System.out.print("Se ingresaron:\n"
                        + contF + " Familias\n"
                        + contH + " Hijos\n"
                        + "Los hijos sumaron " + sumaEdad + " años.\n"
                        + "La edad promedio de los hijos es " + promEdad + " años.");
        }
    }

