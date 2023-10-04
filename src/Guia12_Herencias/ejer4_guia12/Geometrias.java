/*
  Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package main;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author angel
 */
public class Geometrias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r1 = new Rectangulo();
        Circulo c1 = new Circulo();
        
        r1.calcularArea();
        r1.calcularPerimetro();
        
        c1.calcularArea();
        c1.calcularPerimetro();
        
    }
    
}
