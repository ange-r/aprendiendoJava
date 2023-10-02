
import java.util.Scanner;

public class Ejer1_G1_suma {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int num1 = leer.nextInt();

        System.out.println("Ingrese un numero entero:");
        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de los numeros ingresados es: " + suma );
    }
}
