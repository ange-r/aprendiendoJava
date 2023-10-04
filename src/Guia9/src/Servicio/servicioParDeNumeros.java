/*Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además 
//implementar los siguientes métodos:
// >Método mostrarValores que muestra cuáles son los dos números guardados.
// >Método devolverMayor para retornar cuál de los dos atributos 
//tiene el mayor valor
// >Método calcularPotencia para calcular la potencia del mayor valor de la clase 
//elevado al menor número. Previamente se deben redondear ambos valores.
// >Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicio;

import Entidades.ParDeNumeros;

/**
 *
 * @author JAVIER ESPINDOLA
 */
public class servicioParDeNumeros {
    
    public void mostrarValores(ParDeNumeros num){
        System.out.println("el numero 1 es: "+num.getNum1());
        System.out.println("el numero 2 es: "+num.getNum2());
    
    }
    
    public double devolverMayor(ParDeNumeros n){
        
        if(n.getNum1()>n.getNum2())
            return n.getNum1();
        else
            return n.getNum2();
    }
    
    public void calcularPotencia(ParDeNumeros num){
    
    double menor = Math.min(Math.round(num.getNum1()), Math.round(num.getNum2()));
    double mayor = Math.max(Math.round(num.getNum1()), Math.round(num.getNum2()));
    double potencia = Math.pow(mayor, menor);
        System.out.println("la potencia de "+mayor+ " elevado a "+menor+" es: "+potencia );
    }
    
    public void calculaRaiz(ParDeNumeros num){
        double menor = Math.abs( Math.min(num.getNum1(), num.getNum2()));
        
        double raiz = Math.sqrt(menor);
        
        System.out.println("la raiz cuadra de "+menor+" es "+ raiz);
    
    }
    
}
