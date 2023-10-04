/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class numMultiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        EsMultiplo(num1,num2);
        
    }
        public static void EsMultiplo(int num1,int num2){
       
     if (num1 % num2 ==0){
            
            System.out.println("Son multiplos");
        
        }else{
            System.out.println("No son multiplos");
        }     
        
   
    }
}
    

