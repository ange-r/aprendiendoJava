/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Puntos {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese las coordenadas para el PUNTO1 - X: ");
        this.x1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas para el PUNTO1 - Y: ");
        this.y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas para el PUNTO2 - X: ");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese las coordenadas para el PUNTO2 - Y: ");
        this.y2 = leer.nextInt();
    }
    
//       distancia(P1,P2) = raiz cuadrada de ((x2-x1)elevada al cuadrado)+((y2-y1) elevada al cuadrado)
//       Math.sqrt() = raiz cuadrada
//       Math.pow(num;potencia) = potencia (elevar)
    
    public double distancia (){
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
        System.out.println("La distancia entre los puntos es " + distancia);
        return distancia;
    }
}
