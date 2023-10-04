/*
 Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
> Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
> Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento
y la fecha actual.
> Método menorQue recibe como parámetro una Persona y una edad. 
Retorna true si la persona es menor que la edad consultada o false en caso contrario.
> Método mostrarPersona que muestra la información de la persona deseada.

 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class PersonaService {
    Persona person1= new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Date fecha= new Date();
    
    public Persona CrearPersona()
    {
        System.out.println("ingrese su nombre: ");
        person1.setNombre(leer.nextLine());
        
        System.out.println("ingrese su fecha de nacimiento:");
        System.out.println("DIA:");
        fecha.setDate(leer.nextInt());
        
        System.out.println("MES:");
        fecha.setMonth(leer.nextInt() - 1);

        System.out.println("AÑO:");
        fecha.setYear(leer.nextInt() - 1900);
        person1.setFechaN(fecha);
        return person1;
    }
     public Date FechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int FechaDiferencia() {
        Date fechaActual=FechaActual();
        int edad = fechaActual.getYear() - person1.getFechaN().getYear();

        if ((fechaActual.getMonth() < person1.getFechaN().getMonth()) || ((fechaActual.getMonth() == person1.getFechaN().getMonth()) && (fechaActual.getDate() < person1.getFechaN().getDate()))) {
            edad--;
        }
        return edad;
       
    }
    public boolean menorQ (int edad)
    {
        if(person1.getFechaN().getDate()<edad)
        {return true;}
        else {return false;}
    }
    public void MostrarPersona()
    {
        System.out.println("el nombre de la persona es: "+person1.getNombre());
        System.out.println("su fecha de nacimiento es: "+person1.getFechaN());
    }
    
}

