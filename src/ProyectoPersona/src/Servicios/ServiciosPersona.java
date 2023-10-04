/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;

public class ServiciosPersona {
    Persona persona1;

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ServiciosPersona() {
        this.persona1 = new Persona();
    }

    public void crearPersona() {
        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese su peso: ");
        persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura: ");
        persona1.setAltura(leer.nextDouble());
        System.out.println("Ingrese su sexo: ");
        persona1.setSexo(leer.next());
         if (!persona1.getSexo().equals("H") && !persona1.getSexo().equals("M") && !persona1.getSexo().equals("O")){
            System.out.println("Error. Debe indicar con una H, M o O.");
            persona1.setSexo(leer.next());
        } 
    }

    public boolean esMayorEdad() {
        boolean mayorEdad = true;
        System.out.println("Ingrese su edad: ");
        persona1.setEdad(leer.nextInt());
        if (persona1.getEdad() < 18) {
            mayorEdad = false;
        }
        return mayorEdad;
    }
    
       public int calcularIMC(){
        int peso_ideal;
        double calculoIMC = persona1.getPeso()/ Math.pow(persona1.getAltura(), 2.0);
        if(calculoIMC < 20){
            peso_ideal = -1;
        }else if(calculoIMC >=20 && calculoIMC <=25 ){
            peso_ideal = 0;
        }else{
            peso_ideal = 1;
        }
        return peso_ideal;
    }
}
