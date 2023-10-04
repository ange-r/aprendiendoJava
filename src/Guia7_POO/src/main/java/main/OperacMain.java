/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Operaciones;

/**
 *
 * @author angel
 */
public class OperacMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op1 = new Operaciones();
        op1.crearOperacion();
        op1.suma();
        op1.restar();
        op1.multiplicar();
        op1.dividir();
        
        
    }
    
}
