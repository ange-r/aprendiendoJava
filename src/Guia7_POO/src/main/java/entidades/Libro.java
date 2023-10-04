/*S
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Libro {
    public int ISBN;
    public String Título;
    public String Autor;
    public int numPag;

    public Libro() {
    }

    
    public Libro(int ISBN, String Título, String Autor, int numPag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.numPag = numPag;
    }
 
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el N° ISBN: ");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el Título: ");
        this.Título = leer.next();
        System.out.println("Ingrese el Autor: ");
        this.Autor = leer.next();
        System.out.println("Ingrese el N° de páginas: ");
        this.numPag = leer.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("N° ISBN: " + this.ISBN);
        System.out.println("Título: " + this.Título);
        System.out.println("Autor: " + this.Autor);
        System.out.println("N° de páginas: " + this.numPag);
    }
}
