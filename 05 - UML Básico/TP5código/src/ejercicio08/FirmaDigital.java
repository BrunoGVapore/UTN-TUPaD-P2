package ejercicio08;

import java.util.Random;
import java.time.LocalDate;

public class FirmaDigital {
    private String codigoHash;
    private LocalDate fecha;

    private Usuario usuario;
    
    private static final Random GENERADOR = new Random(); // variable estática final "GENERADOR" de tipo Random para inicializar la clase, evitando se inicie por cada creación de instancia
    
    public FirmaDigital(Usuario usuario) { // El constructor recibe el objeto Usuario como parámetro y se almacena en usuario (Relación 1:1 de Agregación: FirmaDigital → Usuario) asegurando su independencia.
        int numAleatorio = GENERADOR.nextInt(10000000); // El método genera números enteros aleatorios entre 0 y 999999
        this.codigoHash = String.format("%06d", numAleatorio); // Conversión a String, formato de 6 dígitos y relleno de 0
        this.fecha = LocalDate.now(); // Devuelve fecha como tipo LocalDate
        this.usuario = usuario; // Acá se asegura que el usuario firmante (ingresado como parámetro) seguirá existiendo (y no sea null), meintras la FirmaDigital termina su ciclo de vida.
    }
   
    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
    
}
