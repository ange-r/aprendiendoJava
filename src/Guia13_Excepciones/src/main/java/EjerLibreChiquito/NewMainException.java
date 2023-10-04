/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerLibreChiquito;


import java.util.Scanner;

public class NewMainException {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Chiquito chiqui1 = new Chiquito("", 10);

        System.out.println("Ingrese el nombre");
        chiqui1.setNombre(leer.next());
        System.out.println(chiqui1);

    }

}