package Parte2;

import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 4. Excepción personalizada - EdadInvalidaException
 * @author Bruno Giuliano Vapore
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        try {
            int edad = scanner.nextInt();
            validarEdad(edad); // Se llama al método que valida la edad y tiene la excepción
            
        } catch (EdadInvalidaException eie) {
            System.out.println("Error: " + eie.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
    }
    
    // Método de validación de edad
    public static void validarEdad(int edad) throws EdadInvalidaException { // La excepción se declara en el método
        
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera del rango valido (0-120)."); // Lanza el error con el mensaje
        }
        
        System.out.println("Edad validada");
    }
        
    
}
