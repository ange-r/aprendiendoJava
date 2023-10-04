/*
 
 */
package service;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class RuletaService {
    Scanner leer = new Scanner(System.in);
    RevolverAgua r = new RevolverAgua();
    Jugador jug = new Jugador();
    Juego partida = new Juego();
    ArrayList <Jugador> jugadores;
    
    
//    Métodos REVOLVER AGUA:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
    
    public void llenarRevolver(){
        r.setPosicionActual((int)(Math.random()*6));
        r.setPosicionAgua((int)(Math.random()*6));
    }
    public boolean mojar(){
        boolean mojar;
        if (Objects.equals(r.getPosicionActual(), r.getPosicionAgua())){
            mojar = true;
        } else {
            mojar = false;
        }
        return mojar;
    }
    
    public void sigChorro(){
        if (r.getPosicionActual() == 6){
            r.setPosicionActual(1);
        } else {
             r.setPosicionActual(r.getPosicionActual()+1) ;
        }
    }
    
    public void mostrar(){
        System.out.println(r.toString());
    }
    
//    JUGADOR
//Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    
    public void disparo(RevolverAgua r){     //Si los metodos estubieran alojados en la Clase Revolver, debo llamar a los metodos: r.Mojar() - r.SigChorro()
        if (mojar()){
            System.out.println("Te mojaste - Estás muerto!!!");
        }else {
            sigChorro();
        }
    }
    
//    JUEGO:
//    Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    
//    public void llenarJuego(){
//        partida.setJugadores(jugadores);
//        partida.setR(r);
////    }
    
    public void ronda(){
        do {
           for (int i = 0; i < 5; i++) {
            disparo(r);
             }
       } while (!mojar());
 
    }
}
