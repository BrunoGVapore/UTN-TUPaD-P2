package ejercicio11;

public class Reproductor {
    
    //Dependencia de Uso
    public void reproducir(Cancion cancion){ //El método usa la canción en forma temporal, no se conserva la referencia 
        System.out.println("Reproduciendo: " + cancion.getCancion()); // Método declarado en Cancion, devuelve titulo y si se encuentra seteado el artista(nombre+genero) también.
    }
    
}
