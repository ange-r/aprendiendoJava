/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Persona;
import java.util.Scanner;


/**
 * Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *
 * @author User
 */
public class PersonaService {
    Scanner leer = new Scanner (System.in);

    public Persona crearPersona() {
        String nombre, sexo;
        int edad;
        double peso, altura;
        
        Persona p = new Persona();
        
        System.out.print("Ingrese el nombre:");
        nombre = leer.nextLine();
        System.out.print("Ingrese el sexo (H, M, O):");
        sexo = leer.next();
        while(!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")){
            System.out.print("Solo puede indicar si es H,M,O. Vuelva a ingresar:");
            sexo = leer.next();
        }
        
        System.out.print("Ingrese la edad:");
        edad = leer.nextInt();
        System.out.print("Ingrese el peso:");
        peso = leer.nextDouble();
        System.out.print("Ingrese la altura en mts:");
        altura = leer.nextDouble();
        leer.nextLine();
        
        
        p.setSexo(sexo);
        p.setEdad(edad);
        p.setPeso(peso);
        p.setAltura(altura);
        
        return p;
        
    }
    
    public boolean esMayorDeEdad(Persona p){
        
        return p.getEdad() < 18;
    }
    
    public double calcularIMC(Persona p){
     double IMC;
        IMC = (p.getPeso() / (p.getAltura() * p.getAltura()));
        if (IMC < 20) {
            return -1;
            
        }else if (IMC >= 20 && IMC <= 25) {
            return 0;
        }else   {
            return 1;
        }
    }
}
/*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
*/