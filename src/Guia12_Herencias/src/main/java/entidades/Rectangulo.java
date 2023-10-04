/*
 Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Rectangulo implements calculosFormas{
    private Double base;
    private Double altura;
    Scanner leer = new Scanner(System.in);
    
    @Override
    public void calcularArea() {
        System.out.println("Ingrese base:");
        base = leer.nextDouble();
        System.out.println("Ingrese altura:");
        altura = leer.nextDouble();
        Double area = base * altura;
        System.out.println("Area = " + area);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetro = (base + altura) * 2;
        System.out.println("Perímetro = " + perimetro);
    }
    
    
}
