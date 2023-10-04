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
public final class EdificioDeOficinas extends Edificio {
    private int cantOficinas;
    private int cantPersonas;
    private int cantPisos;
    private String nombre;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantOficinas, int cantPersonas, int cantPisos, Double ancho, Double alto, Double largo, String nombre) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
        this.nombre = nombre;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void crearEdificio() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nombre EdifOficinas:");
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

    int totalPersonas;
    public void cantPersonasPorOficina() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad de oficinas por piso: ");
        cantOficinas = leer.nextInt();
        System.out.println("Ingrese cantidad de pisos: ");
        cantPisos = leer.nextInt();
        System.out.println("Ingrese cantidad de personas por oficina: ");
        cantPersonas = leer.nextInt();
        totalPersonas = cantPersonas * cantOficinas * cantPisos;
        
    }
    
    @Override
    public String toString() {
        return "EdificioDeOficinas: " + nombre + "\n" +
               "La superficie del Edificio es: " + superficie + " mt2." + "\n" +
               "El volumen del Edificio es: " + volumen + " mt3." + "\n" +
               "Cantidad de Oficinas por piso: " + cantOficinas + "\n" +
               "Cantidad de Personas por oficina: " + cantPersonas + "\n" +
               "Cantidad de Pisos: " + cantPisos +"\n" +
               "El total de pesonas que trabajan en un piso es: " + cantPersonas * cantOficinas + "\n" +
               "El total de personas que trabajan en el edificio es: " + totalPersonas+ "\n" +
                " ";
        
        
        
    }
    
    
}
