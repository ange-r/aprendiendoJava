
import static com.sun.tools.javac.util.StringUtils.toLowerCase;
import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class Ejer3_G1_fraseMayMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fraseMa;
        String fraseMi;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");

        String frase = leer.next();
        fraseMi = toLowerCase(frase);
        fraseMa = toUpperCase(frase);

        System.out.println("Frase miniscula: " + fraseMi + " - Frase mayuscula: " + fraseMa);

    }
    
}
