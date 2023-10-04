/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import service.CafeteraServicio;
import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class CafeteraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        CafeteraServicio nuevoCafe = new CafeteraServicio ();
        Cafetera miCafe = nuevoCafe.llenarCafetera();
        System.out.println("Indique la capacidad de su taza");
        nuevoCafe.servirTaza(leer.nextInt());
        nuevoCafe.vaciarCafetera();
        System.out.println("Indique la cantidad de cafe que desea ingresar");
        nuevoCafe.agregarCafe(leer.nextInt());
    }
}
    

