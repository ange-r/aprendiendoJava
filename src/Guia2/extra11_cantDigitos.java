/*
 Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra11_cantDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número grande: ");
        int num = leer.nextInt();
        int centMil = 0, decMil = 0, uniMil = 0, cent = 0, dec = 0, uni = 0;
        if (num / 100000 > 0 && num / 100000 < 10){
            centMil++;
            System.out.println("El número ingresado " + num + " es de 6 cifras.");
        } else if (num / 10000 > 0 && num / 10000 < 10){
            decMil++;
            System.out.println("El número ingresadosado " + num + " es de 5 cifras.");
        } else if (num / 1000 > 0 && num / 1000 < 10){
            uniMil++;
            System.out.println("El número ingresadosado " + num + " es de 4 cifras.");
        } else if (num / 100 > 0 && num / 100 < 10){
            cent++;
            System.out.println("El número ingresadosado " + num + " es de 3 cifras.");
        } else if (num / 10 > 0&& num / 10 < 10){
            dec++;
            System.out.println("El número ingresadosado " + num + " es de 2 cifras.");
        } else if (num / 1 > 0 && num / 1 < 10){
            uni++;
            System.out.println("El número ingresadosado " + num + " es de 1 cifras.");
        } else if (num >= 1000000){
            System.out.println("El numero ingresado " + num + " es muy grande. Usa de 1 a 6 cifras.");
        }
    }
    
}
