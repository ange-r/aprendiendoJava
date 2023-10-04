/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author leoqu
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> listaProducto = new HashMap();

    public void crearProducto() {
        String rta;
        do {

            Producto p = new Producto();
            System.out.println("ingrese un producto para cargar");
            String nombre = leer.next();
            p.setNombre(nombre);
            System.out.println("Ingrese el precio del producto");
            p.setPrecio(leer.nextDouble());
            listaProducto.put(p.getNombre(), p.getPrecio());
            System.out.println("desea ingresar otro producto? s/n");
            rta = leer.next();
        } while (!rta.equalsIgnoreCase("n"));

    }

    public void modificarPrecio() {
        System.out.println("ingrese el producto a modificar");
        String nombremod = leer.next();
        
        if (listaProducto.containsKey(nombremod)) {
            System.out.println("ingrese el nuevo precio");
            listaProducto.replace(nombremod, leer.nextDouble());
        } else {
            System.out.println("el producto no se encuentra en la lista");
        }

    }

    public void eliminarProducto() {
        System.out.println("ingrese el producto a eliminar");
        String nombreEli = leer.next();
        if (listaProducto.containsKey(nombreEli)) {
            listaProducto.remove(nombreEli);
            System.out.println("Se elimino correctamente ");

        } else {
            System.out.println("el producto no se encuentra en la lista");
        }

    }

    public void mostrarProducto() {
        for (Map.Entry<String, Double> entry : listaProducto.entrySet()) {
            System.out.println("producto=" + entry.getKey() + ", precio" + entry.getValue());

        }
    }
}
