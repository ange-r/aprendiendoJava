/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import service.AlumnoService;

/**
 *
 * @author angel
 */
public class AlumnosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoService ns = new AlumnoService();
        AlumnoService alumno = new AlumnoService();
        
        ns.crearAlumno(nombre, notas);
        ns.notaFinal(alumno, notas);
    }
    
}
