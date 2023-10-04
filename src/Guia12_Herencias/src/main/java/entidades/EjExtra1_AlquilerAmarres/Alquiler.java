/*
 En un puerto se alquilan amarres para barcos de distinto tipo. 
Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler, 
fecha de devolución, la posición del amarre y el barco que lo ocupará.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package entidades.EjExtra1_AlquilerAmarres;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Alquiler{
    protected String nombre;
    protected Long dni;
    protected Calendar fechaAlq;
    protected Calendar fechaDev;
    protected Integer ubicacion;
    protected Barco navio;

    public Alquiler() {
    }

    public Alquiler(String nombre, Long dni, Calendar fechaAlq, Calendar fechaDev, Integer ubicacion, Barco navio) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.ubicacion = ubicacion;
        this.navio = navio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Calendar getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Calendar fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Calendar getfechaDev() {
        return fechaDev;
    }

    public void setfechaDev(Calendar fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Barco getNavio() {
        return navio;
    }

    public void setNavio(Barco navio) {
        this.navio = navio;
    }
    
//    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//  alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//  multiplicando por 10 los metros de eslora).
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/aa");
    
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//String fechaComoCadena = sdf.format(new Date());
//System.out.println(fechaComoCadena);
    
    public void alquiler(){
        System.out.println("Ingrese nombre: ");
        nombre = leer.next();
        System.out.println("DNI: ");
        dni = leer.nextLong();
        System.out.println("Fecha Alquiler: (dd/mm/yy) ");
        String fechaAlqui= fecha.format(leer.next());
        fechaAlq = fecha.getCalendar();
        System.out.println("Fecha Devolución: (dd/mm/yy) ");
        String fechaDevol = fecha.format(leer.next());
        fechaDev = fecha.getCalendar();
        System.out.println("Ingrese ubicación (N° amarre): ");
        ubicacion = leer.nextInt();
//        System.out.println("Ingrese embarcación: ");
//        String navio = leer.next();
//        this.setNavio()navio;
        
    }
    
    public void cantDias(){
//        Calendar diasTotales = fechaDev.getCalendarType() - fechaAlq;
    }

    
}
