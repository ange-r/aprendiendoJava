/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. 
Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Perros {
    private ArrayList <String> raza;

    public Perros() {
    }

    public Perros(ArrayList<String> raza) {
        this.raza = raza;
    }

    public ArrayList<String> getRaza() {
        return raza;
    }

    public void setRaza(ArrayList<String> raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perros{" + "raza=" + raza + '}';
    }
    
    
}
