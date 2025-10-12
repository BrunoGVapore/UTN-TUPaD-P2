package ejercicio11;

public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return " - " + nombre + " (" + genero + ")"; // Formato modificado para salida prolija con reproductor
    }
    
}
