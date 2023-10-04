/*
 El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package service;

import entidades.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class MesSecretoServ {
    MesSecreto nuevo = new MesSecreto();
    
    public void adivine(String mesSecreto){
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el mes secreto! Ingrese en minusculas el nomre de cualquier mes: ");
        String intento = leer.next();
        while (!intento.equalsIgnoreCase(mesSecreto)){
            System.out.println("No ha acertado");
            System.out.println("Intentelo nuevamente: ");
            intento =leer.next();
        }
        System.out.println("Genial! ACERTASTE");
    }
}
