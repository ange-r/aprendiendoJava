/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

/**
 *
 * @author angel
 */
public class ProyectoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vectorIMC = new int [4];
        int[] vectorEdad = new int [4];
        
        ServicioPersona personaUno = new ServicioPersona();
        ServicioPersona personaDos = new ServicioPersona();
        ServicioPersona personaTres = new ServicioPersona();
        ServicioPersona personaCuatro = new ServicioPersona();
        
        personaUno.crearPersona();
        personaUno.esMayorEdad();
        personaUno.indiceIMC();
        
        personaDos.crearPersona();
        personaDos.esMayorEdad();
        personaDos.indiceIMC();
        
        personaTres.crearPersona();
        personaTres.esMayorEdad();
        personaTres.indiceIMC();
        
        personaCuatro.crearPersona();
        personaCuatro.esMayorEdad();
        personaCuatro.indiceIMC();
    }
}

 
        
        
//        PersonaServicio servicio = servicio.crearPersona();
//        Persona p1 = servicio.crearPersona();
//        Persona p2 = servicio.crearPersona();
//        Persona p3 = servicio.crearPersona();
//        Persona p4 = servicio.crearPersona();
//        
//        boolean [] edades = new boolean [4];
//        int [] IMC = 
//    }
    

