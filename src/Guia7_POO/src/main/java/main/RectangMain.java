/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Rectangulo;

/**
 *
 * @author angel
 */
public class RectangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rc1 = new Rectangulo();
        rc1.crearRectangulo();
        rc1.superficie();
        rc1.perimetro();
        rc1.dibujarRectangulo();
    }
    
}
