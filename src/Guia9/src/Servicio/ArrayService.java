/*
 Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 >> Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
 >> Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 >> Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 >> Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

 */
package Servicio;


import java.util.Arrays;

/**
 *
 * @author angel
 */
public class ArrayService {
    
    public double [] inicializarA (double [] A){
        for (int i = 0; i < A.length; i++) {
            A [i] = Math.random()*10;
        }
        return A;
    }
    
    public void mostrarArreglo(double [] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    
    public void ordenar (double [] arreglo){
        double [] arreglo2 = new double [arreglo.length];
        Arrays.sort(arreglo);
        int j = arreglo.length -1;
            for (int i = 0; i < arreglo2.length; i++) {
            arreglo2 [i] = arreglo[j];
            j --;
            }
        System.out.println(Arrays.toString(arreglo2));    
    }
    
    public double [] iniciaizarB (double [] A, double [] arregloB){
        for (int i = 0; i < 10; i++) {
            arregloB [i] = A [i];
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB [i] = 0.5;
        }
        return arregloB;
        
    }
    
    public void mostrarAyB (double [] A, double [] arregloB){
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(arregloB));
    }
}
