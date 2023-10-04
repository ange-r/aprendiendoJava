/*
 Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Circulo implements calculosFormas {
    private Double radio;
    private Double diametro;
    Scanner leer = new Scanner(System.in);

    @Override
    public void calcularArea() {
        System.out.println("Ingrese radio:");
        radio = leer.nextDouble();
        Double area = PI *(Math.pow(radio, 2));
        System.out.println("Area = " + area);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese diámetro:");
        diametro = leer.nextDouble();
       Double perimetro = PI * diametro;
        System.out.println("Perímetro = " + perimetro);
    }
    
}
