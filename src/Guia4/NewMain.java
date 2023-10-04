/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //NO HAGO QUE PIDA LOS DATOS POR QUE ES MAS TEDIOSO PARA HACER PRUEBAS
        int[] vec_1 = {12, 22, 43, 6, 5, 17, 4, 4, 58, 41, 12, 15};
        int[] vec_2 = {21, 22, 43, 6, 5, 17, 4, 4, 58, 41, 12, 15};
        
        System.out.println("Son iguales: " + vectores_iguales(vec_1, vec_2));
   
    }
    //FUNCION PARA AVERIGUAR SI DOS VECTORES SON IGUALES
    public static boolean vectores_iguales(int vecA[], int vecB[]) {
        if (vecA.length == vecB.length){
            for (int i = 0; i < vecA.length; i++) {
                if (vecA[i] != vecB[i]){
                    return false;
                }
            }
        } 
        else{
            return false;
        }
    return true;
    }
}
