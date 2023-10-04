package guia2;


import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
*/

/**
 *
 * @author angel
 */
public class extra6_promedioAlturas {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de sujetos a ingresar");
        int cantPer = leer.nextInt();
        
        double suma1 = 0; // suma todas las alturas 
        double suma2 = 0; // suma alturas bajos
        int cantPerB = 0; // suma cant pers bajas
        
        double promBajo; //
        double promGen;
        
        for (int i = 0; i < cantPer; i++){
            System.out.println( i + 1 + " - Ingrese altura:");
            double altura = leer.nextDouble();
            suma1 += altura; 
            if (altura <= 1.60){
                suma2 += altura;
                cantPerB++;
            } 
       }
            promGen = suma1 / cantPer;
            promBajo = suma2 / cantPer;
            System.out.println("El promedio de personas por debajo de 1.60 mt es :" + promBajo + " %");
            System.out.println("La altura promedio general es: " + promGen);    
    }
}
