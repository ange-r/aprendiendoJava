/*
 Implemente la clase PersonaMain en el paquete entidades. 
Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
constructor vacío, constructor parametrizado, get y set. 
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
> Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto PersonaMain creado.
> Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento
y la fecha actual.
> Método menorQue recibe como parámetro una PersonaMain y una edad. 
Retorna true si la persona es menor que la edad consultada o false en caso contrario.
> Método mostrarPersona que muestra la información de la persona deseada.

 */
package Main;


import Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class PersonaMain {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaService Persona1= new PersonaService();
        
        Persona1.CrearPersona();
        Persona1.FechaDiferencia();
        System.out.println("que edad piensa que tiene?");
        System.out.println("la edad que piensa que tiene es: "+Persona1.menorQ(leer.nextInt()));
        Persona1.MostrarPersona();
        
        
    }
    
}
    