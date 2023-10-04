/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.ObjCadena;
import Servicio.CadenaService;
import java.util.Scanner;




/**
 *
 * @author angel
 */
public class Cadena {

    /**
     
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase: ");
        ObjCadena frase = new ObjCadena(leer.nextLine());
        CadenaService servicio = new CadenaService();
        int opcion;
        System.out.println("Indique la accion que desea llevar adelante");
            System.out.println("1. Contar la cantidad de vocales");
            System.out.println("2. Invertir la frase");
            System.out.println("3. Contar cuantas veces se repita una letra");
            System.out.println("4. Comparar la longitud");
            System.out.println("5. Unir dos frases");
            System.out.println("6. Reemplazar por una letra");
            System.out.println("7. Comprobar si la frase contiene una letra");
            System.out.println("8. Salir");
            opcion = leer.nextInt();
        do {
        switch (opcion){
            case 1: servicio.mostrarVocales(frase);
            break;
            case 2: servicio.invertirFrase(frase);
            break;
            case 3: servicio.vecesRepetido(frase);
            break;
            case 4: servicio.compararLongitud(frase);
            break;
            case 5: servicio.unirFrases(frase);
            break;
            case 6: servicio.reemplazar(frase);
            break;
            case 7: boolean contiene = servicio.contiene(frase);
                    if (contiene==true){
                        System.out.println("verdadero.");
                    } else System.out.println("falso.");
            break;
            }           
        }while (opcion !=8);
    }
}  

