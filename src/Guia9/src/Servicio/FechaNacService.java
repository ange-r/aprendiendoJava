/*
  Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
en paquete Servicios, que tenga los siguientes métodos:
 >> Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 >> Método fechaActual que cree un objeto fecha con el día actual. 
Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
 >> Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
package Servicio;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class FechaNacService {
    
    Date fecha=new Date();
    Scanner leer = new Scanner(System.in);
    
    public Date FechadeNacimiento()
    {
        System.out.println("ingrese su fecha de nacimiento:");
        
        System.out.println("DIA:");
        fecha.setDate(leer.nextInt());
        
        System.out.println("MES:");
        fecha.setMonth(leer.nextInt()-1);
        
        System.out.println("AÑO:");
        fecha.setYear(leer.nextInt()-1900);
        
        return fecha;
    }
    public Date FechaActual()
    {
        Date fechaActual=new Date();
        return fechaActual;
    }
    public void FechaDiferencia(Date fechaActual,Date FechaNacimiento)
    {
       int edad=fechaActual.getYear()-FechaNacimiento.getYear();
     
       if ((fechaActual.getMonth()<FechaNacimiento.getMonth())||((fechaActual.getMonth()==FechaNacimiento.getMonth())&&(fechaActual.getDate()<FechaNacimiento.getDate())))
       {edad--;}
        System.out.println("su edad es: "+edad);
    }
}

    
    

