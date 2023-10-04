/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidades.EjExtra2_Edificio;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class MainEdificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Edificio> listaEdificios = new ArrayList();
                
        listaEdificios.add(new EdificioDeOficinas());
        listaEdificios.add(new EdificioDeOficinas());
        listaEdificios.add(new EdificioDeOficinas());
        listaEdificios.add(new Polideportivo());
        listaEdificios.add(new Polideportivo());
        listaEdificios.add(new Polideportivo());
        
        int cont = 0, cont1 = 0;
        
        for (Edificio aux : listaEdificios) {
            if (aux instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) aux).crearEdificio();
                ((EdificioDeOficinas) aux).calcSuperficie();
                ((EdificioDeOficinas) aux).calcVolumen();
                ((EdificioDeOficinas) aux).cantPersonasPorOficina();
            }
            if(aux instanceof Polideportivo){
                ((Polideportivo) aux).crearEdificio();
                ((Polideportivo) aux).calcSuperficie();
                ((Polideportivo) aux).calcVolumen();
                    if (((Polideportivo) aux).techo()){
                        cont++;}
                    else { cont1 ++;}
            }
        }
        for (Edificio aux : listaEdificios) {
            System.out.println(((EdificioDeOficinas) aux).toString());
            System.out.println(((Polideportivo) aux).toString());
//        }
//        for (Edificio aux : listaEdificios) {
             
        }
        System.out.println("Polideportivos Techados: " + cont);
        System.out.println("Polideportivos Abiertos: " + cont1);
//   
                
        
    }
    
}
