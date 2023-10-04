/*
Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases. 
Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package main;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import service.PerroAdopServ;

/**
 *
 * @author angel
 */
public class PerroAdopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroAdopServ ns = new PerroAdopServ();
        List <Persona> personas = new ArrayList<>();
        List <Perro> perros = new ArrayList<>();
        
        System.out.println("Cargar perros");
        for (int i = 0; i < 2; i++) {
            perros.add(ns.crearPerro());
        }
        
        System.out.println("Cargar persona: ");
        for (int i = 0; i < 2; i++) {
            personas.add(ns.crearPersona());
            
        }
        
        for (Perro perro : perros) {
            for (Persona aux : personas) {
            System.out.println("Para la persona: " + aux.getNombre() + " hay disponibles los siguientes perritos: ");
            for (Perro perrito : perros) {
                System.out.println(perrito.toString());
            }
            
                System.out.println("Elija uno de los perros por su nombre: ");
                String eleccion = leer.next();
                int cont = 0;
                for (int i = 0; i < perros.size(); i++) {
                    if (eleccion.equalsIgnoreCase(perros.get(i).getNombre())) {
                        aux.setPerro(perros.get(i));
                        cont++;
                        perros.remove(i);
                    }
                    if (cont == 0) {
                        System.out.println("El nombre ingresado no corresponde a ningun perro.");
                    }
                }
        }
        
        System.out.println("-------------");
        System.out.println("Las siguientes personas han adoptado a los siguientes perros: ");
        for (Persona aux : personas) {
            if (aux.getPerro()== null) {
                System.out.println(  aux.getNombre() + " " + aux.getApellido() + " NO ha adoptado ningun perro");
            }else{
                System.out.println(aux.toString());
            }
        }
       
        
//        for (Persona pers : personas) {
//            System.out.println(pers.toString());
//        }
//        for (Perro perro : perros) {
//            System.out.println(perro.toString());
//        }
}
        
//        Persona p1 = new Persona();
//        Persona p2 = new Persona();
//        Perro m1 = new Perro();
//        Perro m2 = new Perro();
        
        
    }
    
}
