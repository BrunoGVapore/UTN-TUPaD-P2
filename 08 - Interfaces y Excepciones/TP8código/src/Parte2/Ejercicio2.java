package Parte2;

import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 2. Conversión de cadena a número - NumberFormatException
 * @author Bruno Giuliano Vapore
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar texto: ");
        String texto = scanner.nextLine();
        
        System.out.println("Intentando convertir a numero...");
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Resultado: " + numero);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: " + nfe.toString());
        }
    }
}
