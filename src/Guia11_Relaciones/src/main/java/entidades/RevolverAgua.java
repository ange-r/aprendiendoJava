/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author angel
 */
public class RevolverAgua {
    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    
    public void llenarRevolver(){
        this.posicionActual = ((int)(Math.random()*6));
        this.posicionAgua = ((int)(Math.random()*6));
    }
    public boolean mojar(){
        boolean mojar= false;
        if (Objects.equals(posicionActual, posicionAgua)){
            mojar = true;
        } else {
            sigChorro();
        }
        return mojar;
    }
    
    public void sigChorro(){
        if (posicionActual== 6){
            this.posicionActual = 1;
        } else {
             this.posicionActual ++;
        }
    }
}
    
     