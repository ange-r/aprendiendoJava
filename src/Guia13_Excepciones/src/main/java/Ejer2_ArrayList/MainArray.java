/*
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package Ejer2_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class MainArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> nuevo = new ArrayList();
        
        nuevo.add("Casa");
        nuevo.add("Casa");
        nuevo.add("Casa");
        nuevo.add("Casa");
   
        try {
            nuevo.get(5);
        } catch (Exception e) {
            System.out.println("El indice ingresado no existe");
        }
        
        
    }
    
}
