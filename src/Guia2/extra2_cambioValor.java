/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package guia2;

/**
 *
 * @author angel
 */
public class extra2_cambioValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 3, B = 5, C = 8, D = 22, aux;
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = B;
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D); 
    }
    
}
