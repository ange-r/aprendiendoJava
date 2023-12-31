/*
 Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Operaciones {
    private int num1;
    private int num2;

    public Operaciones() {
    }

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion() {
            Scanner leer = new Scanner(System.in);
            System.out.println("ingrese un número: ");
            this.num1 = leer.nextInt();
            System.out.println("ingrese un número: ");
            this.num2 = leer.nextInt();
    }
    public int suma(){
        int suma = num1 + num2;
        System.out.println("Resultado SUMA: " + suma);
        return suma;
    } 
    public int restar(){
        int resta = num1 - num2;
        System.out.println("Resultado RESTA: " + resta);
        return resta;
    }
    public int multiplicar() {
        int mult = 0;
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("Se multiplicó por 0, por lo que el resultado es " + 0);
        } else {
            mult = this.num1 * this.num2;
            System.out.println("Resultado MULTIPLICACIÓN: " + mult);
        }
        return mult;
    }
    public double dividir(){
        double div = 0;
        double num1 = this.num1;
        double num2 = this.num2;
        
         if (num2 == 0) {
            System.out.println("Error. Se intenta dividir por cero, lo que da como resultado 0.");
        } else {
            div = num1 / num2;
             System.out.println("Resultado DIVISIÓN: " + div);
        }
        return div;
    }
}
