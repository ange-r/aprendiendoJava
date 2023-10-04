/*
 Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Coche {
    private String marca;
    private String modelo;
    private double precio;

    public Coche() {
    }

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void crarCoche(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Marca: ");
        this.marca = leer.next();
        System.out.println("Ingrese Modelo: ");
        this.modelo = leer.next();
        System.out.println("Ingrese Precio: ");
        this.precio = leer.nextDouble();
    }
    public void mostrar(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Precio: " + this.precio);
    }
}
