/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals()
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer7_G2_lectorCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean prim, ult, largo;
        int larCad, bien, mal;
        String ingreso;
        bien = 0;
        mal = 0;
        
        do {
            System.out.println("Ingrese una palabra: ");
            ingreso = leer.nextLine();
            ingreso = ingreso.toLowerCase();
            larCad = ingreso.length();
            prim = ingreso.substring(0,1).equals("x");
            ult = ingreso.substring(larCad -1,larCad).equals("o");
            largo = larCad <= 5;
        
                if (largo && prim && ult){
                    bien++;
                }else{
                    mal++;
                    System.out.println("PALBRA INVALIDA");
                    }
            System.out.print("Cantidad de correctos: " + bien + "\n");
            System.out.print("Cantidad de incorrectos: " + mal + "\n");
                
            }while (!ingreso.equals("&&&&&"));
    }       
}