/*
 Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases. 
Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package service;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class PerroAdopServ {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona p1 = new Persona();
        System.out.println("Nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Apellido: ");
        p1.setApellido(leer.next());
        System.out.println("Edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("DNI: ");
        p1.setDni(leer.nextInt());
//        System.out.println("Perro: ");
//        p1.setPerro(m1);
        return p1;
    }

    
    public Perro crearPerro(){
        Perro m1 = new Perro();
        System.out.println("Nombre: ");
        m1.setNombre(leer.next());
        System.out.println("Raza: ");
        m1.setRaza(leer.next());
        System.out.println("Tamaño: ");
        m1.setTamaño(leer.next());
        System.out.println("Edad: ");
        m1.setEdad(leer.nextInt());
        
        return m1;
    
    }

}
