/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Cancion;

/**
 *
 * @author angel
 */
public class CancionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion c1 = new Cancion();
        c1.cargarCancion();
        c1.mostrarLista();
        
    }
    
}
