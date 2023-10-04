/*
 *Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. 
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
 > Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

 > Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.

 > Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
el discriminante debe ser igual que 0.

 > Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.

 > Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.

 > Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla 
las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package service;

import entidades.Raices;


/**
 *
 * @author angel
 */

public class ServicioRaices {
     Raices obj1 = new Raices();
          
     public double getDiscriminante(Raices raices){
         double discr = (Math.pow(raices.getB(), 2))-4*raices.getA()*raices.getC();
//         System.out.println("Valor Discriminante: " + discr);
         return discr;
     }
     
     public boolean tieneRaices(Raices raices){
         return getDiscriminante(raices) >=0;   
    }
     public boolean tieneRaiz(Raices raices){
         return getDiscriminante(raices) == 0;
     }
//     public static void obtenerRaices(Raices raices) {
//        if (tieneRaices(raices)= true) {
//            double discriminante = Math.sqrt(getDiscriminante(raices));
//            double raiz1 = (-raices.getB() + discriminante) / (2 * raices.getA());
//            double raiz2 = (-raices.getB() - discriminante) / (2 * raices.getA());
//            System.out.println("Las dos raíces son: " + raiz1 + " y " + raiz2);
//        } else {
//        }
    }
     
}
