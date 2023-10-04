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
public class Velero extends Barco {
    protected Integer numMastiles;

    public Velero() {
    }

    public Velero(Integer numMastiles, String matricula, Double eslora, int añoFab, String tipoNavio) {
        super(matricula, eslora, añoFab, tipoNavio);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public Double getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    @Override
    public int getAñoFab() {
        return añoFab;
    }

    @Override
    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }

    public String getTipoNavio() {
        return tipoNavio;
    }

    public void setTipoNavio(String tipoNavio) {
        this.tipoNavio = tipoNavio;
    }

    @Override
    public void crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearBarco(); 
        System.out.println("Ingrese cantidad de mástiles: ");
        numMastiles = leer.nextInt();
    }
      
    @Override
    public void valorModulo() {
        Double modVelero = (super.getEslora() * 10) + numMastiles;
    }
}
