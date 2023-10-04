/*
 * Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando 
el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia3;

import java.util.Scanner;

public class Ejer3_G3_cambioMoneda {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese la cantidad de Euros a cambiar: ");
       double cantEur = leer.nextDouble();
       System.out.println("Indique el tipo de cambio que desea: \n"
                + " Dolar\n"
                + " Yen\n"
                + " Libra");
       String cambio  = leer.next();
       cambio = cambio.toLowerCase();
       double retorno = tipoCambio(cantEur, cambio);
    }
    

    public static double tipoCambio(double cantEur, String cambio){
        double valor = 0;
        switch (cambio){
            case "dolar":
                double dolar = 1.28611 * cantEur;
                System.out.println("€ " + cantEur + " = " + "U$D " + dolar);   
                break;
            case "yen": 
                double yen = 129.852 * cantEur;
                System.out.println("€ " + cantEur + " = " + "¥ " + yen);   
                break;
            case "libra":
                double libra = 0.86 * cantEur;
                System.out.println("€ " + cantEur + " = " + "₤ " + libra);   
                break;
            }   
        return valor;
    }
}



