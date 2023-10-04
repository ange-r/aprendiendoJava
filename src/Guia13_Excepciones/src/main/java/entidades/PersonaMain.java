/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

 */
public class PersonaMain {

   
    public static void main(String[] args) {
       PersonaService ps = new PersonaService();
              
            Persona p1 = ps.crearPersona();
            
            try {
                 ps.esMayorDeEdad(p1);
            } catch (Exception e){
                System.out.println("El dato EDAD es NULO, y no se puede ejecutar el calculo EsMayorDeEdad");
            }
           
            
//            Persona p2 = ps.crearPersona();
//            Persona p3 = ps.crearPersona();
//            Persona p4 = ps.crearPersona();
     
//        double[] IMC = new double[4];
//        boolean[] mayorEdad = new boolean[4];
//
//        esMayorEdad(ps, p1, p2, p3, p4, mayorEdad);
//
//        calcularIMC(ps, p1, p2, p3, p4, IMC);
//
//        compararEdades(mayorEdad);
//
//        compararIMC(IMC);

    }
}
//
//    private static void esMayorEdad(PersonaService ps, Persona p1, Persona p2, Persona p3, Persona p4, boolean[] mayorEdad) {
//        mayorEdad[0] = ps.esMayorDeEdad(p1);
//        mayorEdad[1] = ps.esMayorDeEdad(p2);
//        mayorEdad[2] = ps.esMayorDeEdad(p3);
//        mayorEdad[3] = ps.esMayorDeEdad(p4);
//    }
//
//    private static void calcularIMC(PersonaService ps, Persona p1, Persona p2, Persona p3, Persona p4, double[] IMC) {
//        IMC[0] = ps.calcularIMC(p1);
//        IMC[1] = ps.calcularIMC(p2);
//        IMC[2] = ps.calcularIMC(p3);
//        IMC[3] = ps.calcularIMC(p4);
//    }
//
//    private static void compararEdades(boolean[] mayorEdad) {
//        int contMayor = 0;
//
//        for (int i = 0; i < mayorEdad.length; i++) {
//            if (mayorEdad[i] == false) {
//                contMayor++;
//            }
//        }
//
//        int contMenor = mayorEdad.length - contMayor;
//
//        double promMayor = ((double) contMayor / mayorEdad.length) * 100;
//        double promMenor = ((double) contMenor / mayorEdad.length) * 100;
//
//        System.out.println("La cantidad de mayores de edad es de: " + contMayor);
//        System.out.println("El promedio de mayores de edad es de: " + promMayor + "%");
//
//        System.out.println("La cantidad de menores de edad es de: " + (mayorEdad.length - contMayor));
//        System.out.println("El promedio de menores de edad es de: " + promMenor + "%");
//    }
//
//    private static void compararIMC(double[] IMC) {
//        int contPesoBajo = 0, contPesoIdeal = 0, contPesoAlto = 0;
//
//        for (int i = 0; i < IMC.length; i++) {
//            if (IMC[i] == -1) {
//                contPesoBajo++;
//            } else if (IMC[i] == 0) {
//                contPesoIdeal++;
//            } else {
//                contPesoAlto++;
//            }
//        }
//
//        System.out.println("La cantidad de personas con peso bajo es de: " + contPesoBajo);
//        System.out.println("El porcentaje de personas con peso bajo es de: " + ((double) contPesoBajo / IMC.length) * 100 + "%");
//
//        System.out.println("La cantidad de personas con peso ideal es de: " + contPesoIdeal);
//        System.out.println("El porcentaje de personas con peso ideal es de: " + ((double) contPesoIdeal / IMC.length) * 100 + "%");
//
//        System.out.println("La cantidad de personas con peso alto es de: " + contPesoAlto);
//        System.out.println("El porcentaje de personas con peso alto es de: " + ((double) contPesoAlto / IMC.length) * 100 + "%");
//    }
//
//    }
//    
