/*
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipoNavios de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package entidades.EjExtra1_AlquilerAmarres;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public abstract class Barco {
    protected String matricula;
    protected Double eslora;
    protected int añoFab;
    protected String tipoNavio;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, int añoFab, String tipoNavio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFab = añoFab;
        this.tipoNavio = tipoNavio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public int getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }

    public String getTipo() {
        return tipoNavio;
    }

    public void setTipo(String tipoNavio) {
        this.tipoNavio = tipoNavio;
    }
    
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese matricula: ");
        matricula = leer.next();
        System.out.println("Eslora: ");
        eslora = leer.nextDouble();
        System.out.println("Año fabricación: ");
        añoFab = leer.nextInt();
        System.out.println("Tipo de navío: ");
        tipoNavio = leer.next();
    }
    
    public void valorModulo(){}
    
}
