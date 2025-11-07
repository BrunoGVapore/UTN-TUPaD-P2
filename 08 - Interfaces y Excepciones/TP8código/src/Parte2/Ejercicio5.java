package Parte2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 5. Uso de try-with-resources - IOException
 * @author Bruno Giuliano Vapore
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {

        String nombreArchivo = "archivoExcepciones.txt";
        
        // 1. El recurso se declara DENTRO de los paréntesis del try.
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) { // Recursos dentro del try(). Se br se cierra solo, no es necesario el finally.
            
            System.out.println(br.readLine()); // Lee la única linea del archivo
            
        } catch (IOException e) { // Captura excepiones de recursos externos (FileNotFoundExcepcion es una subclase)
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
