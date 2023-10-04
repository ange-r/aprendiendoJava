/*
 Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra5_obraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué cobertura tiene? A -B - C");
        String cobertura = leer.nextLine();
        cobertura = cobertura.toUpperCase();
        System.out.println("Ingrese el valor de la prestación:");
        int valor = leer.nextInt();
        switch (cobertura){
            case "A":
                double pagoA = valor * 0.5;
                System.out.println("Uds debe abonar $ " + pagoA);
                break;
            case "B":
                double pagoB = valor * 0.65;
                System.out.println("Uds debe abonar $ " + pagoB);
                break;
            case "c":
                double pagoC = valor;
                System.out.println("Uds debe abonar $ " + pagoC);
                break;
            default:
                System.out.println("Categoría inexistente");
        }
    }
    
}
