/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Juego {
    private ArrayList <Jugador> jugadores;
    private RevolverAgua r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getR() {
        return r;
    }

    public void setR(RevolverAgua r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }
    
    Juego partida = new Juego();
    
    public void llenarJuego(){
        partida.setJugadores(jugadores);
        partida.setR(r);
    }
    
    public void ronda(){
        do {
           for (int i = 0; i < 5; i++) {
           
       } while (!mojar());
 
    }
}
