/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas
 */
package service;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //HashMap <String, Float> lista = new HashMap <>();      Esto lo uso para hacer directamente 
    //                                                   el ingreso de datos dentro del HashMap
    
    HashMap <String, Float> lista = new HashMap <>();
    
    public void cargarProducto(){
        Producto nuevo = new Producto();
        Character opcion = 's';
        System.out.println("- Cargar productos -");
        do{
            System.out.println("Nombre: ");
            nuevo.setProducto(leer.next());
            //String producto = leer.next();
            System.out.println("Precio: ");
            nuevo.setPrecio(leer.nextFloat());
            //Float precio = leer.nextFloat();
            //lista.put(producto, precio);
            lista.put(nuevo.getProducto(), nuevo.getPrecio());    //Se getea el nombre como llave, 
//                                               y dentro de los valores se guarda todo el objeto
            System.out.println("¿Desea ingresar otro producto? s/n");
            opcion = leer.next().charAt(0);
            
        } while (opcion!= 'n');
    }
    
    public void cambiarPrecio(){
        System.out.println("- Cambiar precio -"); 
        System.out.println("¿Qué producto desea modificar?");
        String aux = leer.next();
        
        if (lista.containsKey(aux)){
            System.out.println("Ingrese nuevo precio: ");
            lista.replace(aux, leer.nextFloat());
        } else {
            System.out.println("El producto ingresado no existe.");
            }
        }
    
    public void eliminarProducto() {
        System.out.println("- Eliminar Producto -");
        System.out.println("¿Qué prducto desea eliminar?");
        String aux2 = leer.next();
        if (lista.containsKey(aux2)){
            lista.remove(aux2);
            System.out.println("El producto ha sido eliminado.");
        } else {
            System.out.println("El producto ingresado no existe.");
        }
    }    
    
    public void mostrarLista(){
       for (Map.Entry <String, Float> mostrar : lista.entrySet()) {
           //System.out.println(mostrar.toString());
           System.out.println("Producto : " + mostrar.getKey() + " - Precio: " + mostrar.getValue());
       }
}

    
    }
    
    