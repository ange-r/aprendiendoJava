/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package guia2;

/**
 *
 * @author angel
 */
public class extra12_num_toString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String A, B, C;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    A = Integer.toString(i); // covirte numero INT a cadena
                    B = Integer.toString(j);
                    C = Integer.toString(k); 
                if (i == 3){ // se iguala el valor de i (uso 2= ==)
                    A = "E"; // se le otroga valo a A (uso un solo =)
            }   if (j == 3){ 
                    B = "E";
            }   if (k == 3){ 
                    C = "E";
            }
        System.out.println(A + " - " + B + " - " + C);
                }
            }
        }
    }
}