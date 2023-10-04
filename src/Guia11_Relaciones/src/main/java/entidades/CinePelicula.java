/*
 
Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. */
package entidades;

/**
 *
 * @author angel
 */
public class CinePelicula {
    private String titulo;
    private Integer duracion;
    private Integer edadMinima;
    private String Director;

    public CinePelicula() {
    }

    public CinePelicula(String titulo, Integer duracion, Integer edadMinima, String Director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.Director = Director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "CinePelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", Director=" + Director + '}';
    }
    
 
}
