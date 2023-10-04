/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Libro;


/**
 *
 * @author angel
 */
public class LibroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        
        libro1.cargarLibro();
        libro1.mostrarLibro();
        libro2.cargarLibro();
        libro2.mostrarLibro();
        libro3.cargarLibro();
        libro3.mostrarLibro();
    }

   
    
}
