package ejercicio11;

public class Cancion {
    private String titulo; // Atributo propio
    private Artista artista; // Atributo de clase para Relación 1:1 unidireccional con Artista
    
    //Constructor
    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getCancion() { //Método usado en Reproductor
        return titulo + artista.toString();
    }

    public void setArtista(Artista artista) { //Setter para la relación 1:1 con Artista
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
    
}
