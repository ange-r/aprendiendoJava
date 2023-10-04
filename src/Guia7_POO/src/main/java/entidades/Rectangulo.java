/*
 Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida de base del rectangulo: ");
        this.base = leer.nextInt();
        System.out.println("Ingrese la medida de altura del rectangulo: ");
        this.altura = leer.nextInt();
    }
    public int superficie(){
        int superf = base * altura;
        System.out.println("Superficie: " + superf);
        return superf;
    }
    public int perimetro(){
        int perim = (base * 2) + (altura * 2);
        System.out.println("Perímetro: " + perim);
        return perim;
    }
    public void dibujarRectangulo(){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base-1 || j == 0 || j == altura-1){
                     System.out.print(" * ");
                } else {
                     System.out.print("   "); 
                 }               
            }
            System.out.println("");
            }
    }
    
}
