/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. La escuela nos 
ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber qué alumnos han recibido una 
nota por encima de ese promedio.

Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre y nota 
(representando la nota obtenida en el final). 

La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.

Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, 
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.

Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.

Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

*/

package integrador;

import Entidades.Estudiante;
import Servicio.EstudianteServicios;
import java.util.Scanner;

/**
 *
 * @author Herrera Victor
 */
public class Integrador {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Estudiante lista [] =  new Estudiante [8];
        
        EstudianteServicios es = new EstudianteServicios();
        
        for (int i = 0; i < 8; i++) {
            
            System.out.println("Ingrese el nombre y la nota de Estudiante: " + (i+1));
            
            lista[i] =  new Estudiante(leer.next(), leer.nextInt()); 
            
            es.promedio(lista[i],i);
            es.alumnosDestacados(lista[i],i);
            
        }
        
    }
}
