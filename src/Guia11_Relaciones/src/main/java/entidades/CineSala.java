/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author angel
 */
public class CineSala{
    private char letras;// de A a F
    private Integer fila;// de 1 a 8
    private char estado;// por defecto DESOCUPADO

    public CineSala() {
    }

    public CineSala(char letras, Integer fila, char estado) {
        this.letras = letras;
        this.fila = fila;
        this.estado = estado;
    }

    public char getLetras() {
        return letras;
    }

    public void setLetras(char letras) {
        this.letras = letras;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lugar: "+ fila + letras + ": "+  estado + '.';
    }
    
    
    
    
}
