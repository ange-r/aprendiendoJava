/*
 * Crea una aplicación que le pida dos números al usuario y 
este pueda elegir entre sumar,restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. 

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejer1_G3_funcionCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números:");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
                
        System.out.println("Indique que hacer:\n"
                + "1- Sumar\n"
                + "2- Restar\n"
                + "3- Multiplicar\n"
                + "4- Dividir");  
        
        int opcion = leer.nextInt();
        
            if (opcion ==1){
                int retorno1 = sumar(num1, num2);
                 System.out.println(retorno1);
            }        
            if (opcion == 2);{
                    int retorno2 = restar(num1,num2);
                    System.out.println(retorno2);
            }
            if (opcion == 3){
                int retorno3 = multiplicar(num1,num2);
                System.out.println(retorno3);
            }
            if (opcion == 4){
                double retorno4 = dividir(num1,num2);
                System.out.println(retorno4);}
            }
    

    public static int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    
     public static int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }   
    public static int multiplicar(int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }               
    
    public static double dividir(int num1, int num2){
        double division = num1 / num2;
        return division;
    }
}


       
                                
                            
