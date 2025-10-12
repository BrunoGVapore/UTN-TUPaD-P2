package ejercicio11;

/**
 * Trabajo Practico N°5: Ejercicios de Depndencia de Uso
 * Ejercicio 11: Reproductor - Canción - Artista
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** DEPENDENCIA DE USO
    * Asociación unidireccional: Canción → Artista
    * Dependencia de uso: Reproductor.reproducir(Cancion)
    */ 
    public static void main(String[] args) {
         
        Cancion song1 = new Cancion("The Fate of Ophelia");
        Artista art1 = new Artista("Taylor Swift", "Pop");
         
        System.out.println(song1);
        song1.setArtista(art1); // Asociación 1:1 unidireccional
         
        // Dependencia de Uso
        Reproductor reproductor = new Reproductor(); // Primero se crea el objeto Reproductor
        reproductor.reproducir(song1); // Con el objeto se llama al médoto reproducir y se pasa como parámetro la canción (aparecerá seteado el artista -nombre y género-)
        
    }
}
