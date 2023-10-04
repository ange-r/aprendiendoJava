/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. 

Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 >> Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
 >> Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 >> Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 >> Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Main;

import Servicio.ArrayService;

/**
 *
 * @author angel
 */
public class ArraysMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] A = new double[50];
        double [] B = new double[20];
        
        ArrayService ns = new ArrayService();
        System.out.println("Inicializar A: ");
        ns.inicializarA(A);
        System.out.println("Mostrar arreglo A: ");
        ns.mostrarArreglo(A);
        System.out.println("Ordenar A de mayor a menor: ");
        ns.ordenar(A);
        System.out.println("Mostras A y B:");
        ns.iniciaizarB(A, B);
        
        ns.mostrarAyB(A, B);
    }
    
}
