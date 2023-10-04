/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

;

import java.util.Scanner;
import service.ProductoService;

/**
 *
 * @author angel
 */
public class ProductoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService ns = new ProductoService();
        int opcion;
        do {
            System.out.println("- Menú -\n"
            + "1 - Cargar Producto\n"
            + "2 - Modificar Precio\n"
            + "3 - Eliminar Producto\n"
            + "4 - Mostrar Lista de Productos/Precios\n"
            + "5 - Salir");
            opcion = leer.nextInt();
                 switch (opcion){
                    case 1: ns.cargarProducto();
                    break;
                    case 2: ns.cambiarPrecio();
                    break;
                    case 3: ns.eliminarProducto();
                    break;
                    case 4: ns.mostrarLista();
                    break;
                    case 5: System.out.println("Cerrando aplicación.");
                }
        } while (opcion != 5);
    }
    
}
