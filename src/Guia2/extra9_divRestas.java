/*
 Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra9_divRestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese dividendo: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese divisor: ");
        int num2 = leer.nextInt();
        int resta, cociente = 0, residuo = 0;
        do {
            resta = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + resta);
            num1 = resta;
            cociente++;            
        } while (num2 < resta);
        residuo = num2 - resta;
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
    }
    
}
