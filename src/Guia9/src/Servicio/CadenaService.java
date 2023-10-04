/*
 Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
> Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
> Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
> Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
> Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
> Método unirFrases(String frase), deberá unir la frase contenida en la clase ObjCadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
> Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
> Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package Servicio;

import Entidades.ObjCadena;
import java.util.Scanner;

public class CadenaService {
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales(ObjCadena frase){
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            String letra = frase.getFrase().substring(i,i+1);
            if ((letra.equals("a"))||(letra.equals("e"))||(letra.equals("i"))||(letra.equals("o"))||(letra.equals("u"))){
            cont ++;
            }
        } 
        System.out.println("La frase ingresada: " + frase + ", posee " + cont + " vocales.");
    }
    
    public void invertirFrase (ObjCadena frase ){
        for (int i = frase.getLongitud()-1; i >= 0; i--) {
            System.out.print(frase.getFrase().charAt(i));
        }
        System.out.println("");
    }
    
    public void vecesRepetido(ObjCadena frase){
        System.out.println("Ingrese un caracter a buscar: ");
        String X = leer.next();
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            String caract = frase.getFrase().substring(i, i+1);
            if (X.equals(caract)){
            cont ++;
            }
        }
        System.out.println("El caracter " + X + " se repite " + cont + " veces.");
    }
    
   public void compararLongitud (ObjCadena frase){
        System.out.println("Ingrese una nueva frase");
        String frase2= leer.next();
        if (frase2.length()==frase.getLongitud()){
            System.out.println("Las frases poseen la misma longitud.");
        } else System.out.println("Las frases no poseen la misma longitud.");
        
    }
    public void unirFrases (ObjCadena frase) {
        System.out.println("Ingrese una nueva frase");
        String frase2=leer.nextLine();
        frase2 = frase.getFrase().concat(frase2);
        System.out.println(frase2);
    }
    public void reemplazar (ObjCadena frase){
        System.out.println("Indique el carater con el que desea reemplazar a la letra 'a'");
        String letra = leer.next();
        String nueva2= frase.getFrase().replace("a", letra);
        System.out.println(nueva2);
    }
   public boolean contiene (ObjCadena frase){
       System.out.println("Indique la letra que desea buscar");
       String letra = leer.next();
       boolean contiene = frase.getFrase().contains(letra);
       return contiene;
   }
   
        
}
