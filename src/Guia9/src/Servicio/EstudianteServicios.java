package Servicio;

import Entidades.Estudiante;

/**
 *
 * @author USUARIO
 */
public class EstudianteServicios {
    
    private double suma = 0;
    private double promedio;
    private int n=0;
    private String nom [] = new String [8];
    private double nota [] = new double [8];
    
    public void promedio (Estudiante est, int i){
        
        suma += est.getNota();  
                
        if (i == 7) {
            
            promedio = suma/8;
            
            System.out.println("Promedio es de: " + promedio);
        }
        
    }
    
    public void alumnosDestacados(Estudiante est,int i){
                             
        if (est.getNota() > promedio) {
            nom [n] = est.getNombre();
            nota [n] = est.getNota();
            n++;
        }

        if (i == 7) {            
            
            int cont = 0 ;
            
            System.out.println("Los alumnos Destacados seran...");
            
            for (int j = 0; j < n; j++) {
                
                if (nota[j] > promedio) {
                    
                System.out.println((cont+1) + " = " + nom[j] + " nota: " + nota[j]);
                cont++;
                
                }
            }
        }
        
    }
}
