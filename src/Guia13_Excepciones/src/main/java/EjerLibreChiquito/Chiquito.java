/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerLibreChiquito;

public class Chiquito {

    private String nombre;
    private int edad;

    public Chiquito() {
    }

    public Chiquito(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            if (nombre.equals("perro")) {
                throw new EjercicioNewExceptions("No escribas perro!");
            } else{
                this.nombre = nombre;
            }
        } catch (EjercicioNewExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        try {
            if (nombre.equals("perro")) {
                throw new EjercicioNewExceptions("No escribas perro!");
            }
        } catch (EjercicioNewExceptions e) {
            System.out.println(e.getMessage());
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " Nombre=" + nombre
                + "\n Edad=" + edad;
    }


}


