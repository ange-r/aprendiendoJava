/*
 Desarrollar un simulador del sistema de votación de facilitadores en Egg-
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. 
 */
package entidades;

/**
 *
 * @author angel
 */
public class AlumnosEGG {
    private String nombreCompleto;
    private Integer dni;
    private Integer cantVotos;

    public AlumnosEGG() {
    }

    public AlumnosEGG(String nombreCompleto, Integer dni, Integer cantVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

}
