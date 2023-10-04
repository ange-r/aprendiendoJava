/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author angel
 */
public class CineEspectador {
    private String nombre;
    private Integer edad;
    private Float dinero;

    public CineEspectador() {
    }

    public CineEspectador(String nombre, Integer edad, Float dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getDinero() {
        return dinero;
    }

    public void setDinero(Float dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador: \n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Dinero: $ " + dinero;
    }
    
}
