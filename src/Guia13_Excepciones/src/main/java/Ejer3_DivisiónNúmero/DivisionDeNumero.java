/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
*/
package Ejer3_DivisiónNúmero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class DivisionDeNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Inrese dos números: ");
        String n1= leer.next();
        String n2= leer.next();
        int i1= Integer.parseInt(n1);
        int i2= Integer.parseInt(n2);
        try {
            int div = (i1/i2);
            System.out.println(i1 +"/"+i2+" = "+div); 
        } catch (ArithmeticException e){ // cuando se divide un numero por 0
            System.out.println("No se puede dividir por 0(cero)");
        } catch (InputMismatchException e){ // cuando el dato ingresado no coincide con el esperado
            System.out.println("El tipo de dato no coincide.");
            e.getMessage();
        } catch (NumberFormatException e){ // cuando Integer.parseInt() no puede convertir a num entero
            System.out.println("El valor ingresado no es entero.");
            e.getMessage();
        }    
        
        // CORREGIR - NO FUNCIONAN LAS ULTIMAS CATCH
    }    
}
