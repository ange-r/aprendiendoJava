/*
 Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        this.radio = leer.nextDouble();
    }
    public double area(){
        double area = Math.pow((Math.PI*radio), 2);
        return area;
    }
    public double perimetro() {
        double perimetro = 2 * (Math.PI*radio);
        return perimetro;
    }
}
