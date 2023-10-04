/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class extra4_numRomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int ingreso = leer.nextInt();
            switch (ingreso){
                case 1:
                    System.out.println("El número ingresado " + ingreso + " equivales a I en números Romanos");
                    break;
                case 2:
                    System.out.println("El número ingresado " + ingreso + " equivales a II en números Romanos");
                    break;
                case 3:
                    System.out.println("El número ingresado " + ingreso + " equivales a III en números Romanos");
                    break;    
                case 4:
                    System.out.println("El número ingresado " + ingreso + " equivales a IV en números Romanos");
                    break;    
                case 5:
                    System.out.println("El número ingresado " + ingreso + " equivales a V en números Romanos");
                    break;
                case 6:
                    System.out.println("El número ingresado " + ingreso + " equivales a VI en números Romanos");
                    break;
                case 7:
                    System.out.println("El número ingresado " + ingreso + " equivales a VII en números Romanos");
                    break;
                case 8:
                    System.out.println("El número ingresado " + ingreso + " equivales a VIII en números Romanos");
                    break;    
                case 9:
                    System.out.println("El número ingresado " + ingreso + " equivales a IX en números Romanos");
                    break;    
                case 10:
                    System.out.println("El número ingresado " + ingreso + " equivales a X en números Romanos");
                    break; 
                    default:
                        System.out.println("Número invalido");
            }
        }
    }


