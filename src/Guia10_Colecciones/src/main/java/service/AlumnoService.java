/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.

 */
package service;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author angel
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Alumno> alumno;
    
//      En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//      toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//      pregunta al usuario si quiere crear otro Alumno o no.
    
    public void crearAlumno(){
        ArrayList <Alumno> alumno = new ArrayList<>();
        Alumno nuevo = new Alumno();
        Character opcion = null;
            while (opcion != 'n'){
                System.out.println("Nombre: ");
                    nuevo.setNombre(leer.next());
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Nota " + (i+1) + ": ");
                            nuevo.setNotas(notas.add(leer.nextInt()));
                    }
                ;

                System.out.println("¿Desea cargar otro alumno? s/n ");
                opcion = leer.next().charAt(0);
            }
    }
    
//      Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//          Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//      final y se lo busca en la lista de Alumno. Si está en la lista, se llama al método. Dentro
//      del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//      promedio final, devuelto por el método y mostrado en el main.    
    
    public double notaFinal(ArrayList <Alumno> alumno, ArrayList <Integer> notas){
        System.out.println("Calcular promedio - Ingrese nombre del alumno: ");
        String buscarAlumno = leer.next();
        double promedio = 0;
        Iterator <Alumno> buscarA = alumno.iterator();
        boolean existe = false;
            while (buscarA.hasNext()){
                if (buscarA.next().equals(buscarAlumno)){
                    existe = true;
                } 
            }
        if (existe){
            int suma = 0;
            for (Alumno al : alumno) {
                int i;
                for (i = 0; i <= notas.size(); i++)  {
                    suma += notas.get(i);
                    promedio = suma/3;
                }
            }
        } else{
            System.out.println("El nombre ingresado no se encuentra cargado.");
        }
        return promedio;
    }
}

    

