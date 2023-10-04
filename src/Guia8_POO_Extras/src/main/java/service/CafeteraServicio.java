/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import entidades.Cafetera;
import java.util.Scanner;


    
public class CafeteraServicio {
   
    private Cafetera cafecito = new Cafetera ();
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera (){
        System.out.println("Indique la capacidad maxima de la cafetera");
        cafecito.setMaxima(leer.nextInt());
        cafecito.setCantidad(cafecito.getMaxima());
        return this.cafecito;
    }
    public void servirTaza (int taza){
        if (cafecito.getCantidad()>=taza){
            System.out.println("La taza se lleno.");
            cafecito.setCantidad(cafecito.getCantidad()-taza);
        } else System.out.println("La taza no se lleno, contiene: " + cafecito.getCantidad());
    }
    public void vaciarCafetera (){
        cafecito.setCantidad(0);
    }
    public void agregarCafe (int nuevo_cafe){
        while (nuevo_cafe>cafecito.getMaxima()){
            System.out.println("Error. La cafetera tiene un maximo de "+ cafecito.getMaxima()+ ". Ingrese una cantidad menor.");
            nuevo_cafe=leer.nextInt();
        }
        cafecito.setCantidad(nuevo_cafe);
    }
}

