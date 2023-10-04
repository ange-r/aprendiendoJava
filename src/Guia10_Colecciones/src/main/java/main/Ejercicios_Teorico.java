/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import static java.util.Map.entry;
import java.util.TreeSet;

/**
 *
 * @author angel
 */
public class Ejercicios_Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
////    Deteccion de Errores:  
//        Array<int> listado = new ArrayList;
//        TreeSet<String> = TreeSet();
//        HashMap<Integer> personas = new HashMap<>;

        ArrayList <Integer> listado = new ArrayList();
        TreeSet <String> nombres= new TreeSet();
        HashMap <Integer, String> personas = new HashMap();
        
//  EJERCICIO COLECCIONES
//  Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        //Listas:
        ArrayList <Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        int a = 5;
        int b = 10;
        int c = 8;
        int d = 99;
        int e = 30;
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        numerosA.add(d);
        numerosA.add(e);
        
        
        //Conjuntos:
        HashSet <Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
        Integer f = 35;
        Integer g = 62;
        Integer h = 90;
        Integer i = 33;
        Integer j = 57;
        numerosB.add(f);
        numerosB.add(g);
        numerosB.add(h);
        numerosB.add(i);
        numerosB.add(j);
               
        
        //Mapas:
        HashMap <Integer, String> alumnos = new HashMap();
        int DNI = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 35862215;
        nombreAlumno = "Ramón";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 55962805;
        nombreAlumno = "José";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 35876505;
        nombreAlumno = "Ana";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 83452215;
        nombreAlumno = "Diego";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 35865315;
        nombreAlumno = "Andrea";
        alumnos.put(DNI, nombreAlumno);
        
        //Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
//          cada forma que aprendiste arriba.
        
//        ArrayList <Integer> numerosA = new ArrayList();
//        x = 20;
//        numerosA.add(x);
        a = 5;
        b = 10;
        c = 8;
        d = 99;
        e = 30;
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        numerosA.add(d);
        numerosA.add(e);
        
        numerosA.remove(4); //Remueve el valor que se encuentra en el indice
        numerosA.remove(6);
        
//        HashSet <Integer> numerosB = new HashSet();
//        Integer y = 20;
//        numerosB.add(y);
        f = 35;
        g = 62;
        h = 90;
        i = 33;
        j = 57;
        numerosB.add(f);
        numerosB.add(g);
        numerosB.add(h);
        numerosB.add(i);
        numerosB.add(j);
        
        numerosB.remove(90); // remueve el primer objeto que encuentre igual al declarado
        numerosB.remove(33);
        
//        HashMap <Integer, String> alumnos = new HashMap();
//        int DNI = 34576189;
//        String nombreAlumno = "Pepe";
//        alumnos.put(DNI, nombreAlumno);
        
        DNI = 35862215;
        nombreAlumno = "Ramón";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 55962805;
        nombreAlumno = "José";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 35876505;
        nombreAlumno = "Ana";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 83452215;
        nombreAlumno = "Diego";
        alumnos.put(DNI, nombreAlumno);
        
        DNI = 35865315;
        nombreAlumno = "Andrea";
        alumnos.put(DNI, nombreAlumno);
        
        alumnos.remove(4); // Remueve el número de llave que se indica
        alumnos.remove(2);
        
        //Para mostrar: Para recorrer una colección, 
//        vamos a tener que utilizar el bucle forEach. El bucle comienza con la
//        palabra clave for al igual que un bucle for normal. 
//        Pero, en lugar de declarar e inicializar una variable contadora del bucle, 
//        declara una variable vacía, que es del mismo tipo que la colección,
//        seguido de dos puntos y seguido del nombre de la colección.
//                  for (Tipo de dato variableVacia : Colección){
//                      System.out.println(variableVacia);
//                    }   

        //Mostrar Listas:
        for(Integer numeros : numerosA){
            System.out.println(numeros);
        }
        
        //Mostrar Conjuntos:
        for (Integer numero : numerosB){
            System.out.println(numerosB);
        }
        
        //Mostrar Mapas:
//        Para recorrer mapas vamos a tener que usar el objeto Map.Entry en el for each. 
//        A través del entry vamos a traer los valores y las llaves, si no, podemos tener
//        un for each para cada parte de nuestro mapa sin utilizar el objeto Map.Entry.
         
        // Con Map.Entry
        for (Map.Entry <Integer, String> curso : alumnos.entrySet()){
            System.out.println("DNI: " + entry.getKey() + "Nombre: " + entry.getValue());
        }
        
        // Sin Map.Entry - Solo LLAVE
        for (Integer dni : alumnos.keySet()){
            System.out.println("DNI: " + DNI);
        }
        
        // Sin Map.Entry - Solo VALOR
        for (String listado : alumnos.values()){
            System.out.println("Nombre: " + nombreAlumno);
        }
        
        
//        Deteccion de errores:
//            HashMap<Integer> personas = new HashMap<>;
//            String n1 = “Albus”;
//            String n2 = “Severus”;
//            personas.add(n1);
//            personas.add(n2);
        
            HashSet <String> personas = new HashSet();
            String n1 = “Albus”;
            String n2 = “Severus”;
            personas.add(n1);
            personas.add(n2);
            
//            Deteccion de errores:
//            ArrayList<String> = new ArrayList()
//            bebidas.put(“café);
//            bebidas.add(“té”);
//            Iterator<String> it =bebidas.iterator();
//            whale (it.next()){
//            if (it.next().equals(“café”)){
//            it.remove();
//            }
               
            ArrayList <String> bebidas = new ArrayList();
//            String b1 = "café";
//            String b2 = "té";
            
            bebidas.add("café");
            bebidas.add("té");
            
            Iterator <String> it = bebidas.iterator();
            System.out.println("Elementos de la lista: ");
            
            while (it.hasNext()){
                if (it.next().equals(“café”)){
                     it.remove();
                }
            }
    
//            Ejercicio:
//            ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
    
    ArrayList <String> libros = new ArrayList();
    String libro = "Matematicas1";
    libros.add(libro);
    libro = "Matematicas2";
    libros.add(libro);
    libro = "Matematicas3";
    libros.add(libro);
    libro = "Matematicas4";
    libros.add(libro);
    libro = "Matematicas5";
    libros.add(libro);
     for (String libro : libros){
            System.out.println(libros);
        }
}
