package Parte2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 3. Lectura de archivo - FileNotFoundException
 * @author Bruno Giuliano Vapore
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        String nombreArchivo = "archivoExcepciones.txt"; // Nombre del archivo guardado en la raíz del proyecto
        Scanner lector = null;   // Se crea el objeto Scanner. Si no encuentra el archivo se mantiene en null
        
        try {
            File archivo = new File(nombreArchivo); // Apunta al archivo físico (ubicado en la carpeta raíz del proyecto)
            lector = new Scanner(archivo);          // Abre el archivo

            System.out.println(lector.nextLine()); //Lee la única linea del archivo
        
        } catch (FileNotFoundException fnfe) { // Manejo de excepción si no encuentra el archivo
            System.out.println("Error: " + fnfe.getMessage());
            
        } finally {
            if (lector != null){   // Evita un NullerPointerException en caso de que no haya encontrado el archivo
                  lector.close();  // Cierra el recurso
            }    
        }
    }
}
