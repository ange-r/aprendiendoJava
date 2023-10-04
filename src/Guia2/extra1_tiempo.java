/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra1_tiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un cantidad de minutos:");
        int ingreso = leer.nextInt();
        
        do{
            int hora = (ingreso / 60) % 24;
            int dia = (ingreso / 60) / 24;
            System.out.println("Los minutos ingresados " + ingreso + " equivalen a " + dia + " días, " + hora + " horas.");
            break;
        } while (ingreso != 0);
            
    }
    
}
