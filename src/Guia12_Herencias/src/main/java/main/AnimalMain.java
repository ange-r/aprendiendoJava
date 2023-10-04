/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author angel
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal p1 = new Perro("Lisa","Croquetas", 4, "Callejera");
        p1.Alimentarse();
        Animal p2 = new Perro("Mambo","Carne", 14, "Callejera");
        p2.Alimentarse();
        Animal g1 = new Gato("Hiro","Croquetas", 2, "GatoVaca");
        g1.Alimentarse();
        Animal c1 = new Caballo("Manchi","Cebada", 10, "Petisa");
        c1.Alimentarse();
    }
    
}
