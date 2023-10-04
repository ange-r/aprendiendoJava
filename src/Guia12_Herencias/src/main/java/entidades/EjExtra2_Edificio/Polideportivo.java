/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.EjExtra2_Edificio;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public final class Polideportivo extends Edificio{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean techo, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techo = techo;
    }

    @Override
    public void crearEdificio() {
        
        System.out.println("Nombre Polideportivo:");
        nombre = leer.next();
        System.out.println("Ingrese ancho: ");
        ancho = leer.nextDouble();
        System.out.println("Ingrese largo: ");
        largo = leer.nextDouble();
        System.out.println("Ingrese alto: ");
        alto = leer.nextDouble();
        
    }
      
    Double volumen;
    @Override
    public void calcVolumen() {
        volumen = ancho * largo * alto;
    }

    Double superficie;
    @Override
    public void calcSuperficie() {
        superficie = ancho * largo;
    }

    public boolean techo(){
        System.out.println("indique si el edificio es Techado: ");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("S")){
            return techo = true;
        } else {
            return techo = false;
        }
            
            
    }
    
    @Override
    public String toString() {
        return "Polideportivo: " + nombre + "\n" + 
                "Techo: " + techo +"\n" +
                "La superficie del " + this.nombre + " es: " + superficie + " mt2." + "\n" +
                "El volumen del " + this.nombre + " es: " + volumen + " mt3." + "\n" +
                " ";
    } 
}
