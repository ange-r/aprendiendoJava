/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. 
Si decide salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.

 */
package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class PerrosService {
    ArrayList <String> raza = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarRazas(){
        Character r = 's';
        while (!r.equals('n')) {
            System.out.println("Ingrese la raza del perro: ");
            raza.add(leer.next());
            System.out.println("¿Desea cargar otra raza? s/n ");
            r = leer.next().charAt(0);
        }
        System.out.println("Las razas cargadas son: ");
         for(String razas : raza){
            System.out.println(razas);
         }
}
    
    public void eliminarRaza(){
        System.out.println("Ingrese la raza que desea eliminar: ");
        String buscarRaza =leer.next();
        Iterator buscarR = raza.iterator();
        boolean elimina = false;
            while (buscarR.hasNext()){
                if (buscarR.next().equals(buscarRaza)){
                    buscarR.remove();
                    elimina = true;
                }
            }
        if (elimina){
            System.out.println("Se ha eliminado con exito.");
        } else {
            System.out.println("La raza ingresada no se encontró.");
        }    
        
        Collections.sort(raza);
                
        System.out.println("Las razas cargadas son: ");
         for(String razas : raza){
            System.out.println(razas);
         }
    }
    
}
