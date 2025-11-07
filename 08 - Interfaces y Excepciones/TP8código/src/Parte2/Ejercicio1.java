package Parte2;

import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 1. División segura - ArithmeticException
 * @author Bruno Giuliano Vapore
 */
public class Ejercicio1 {
   
    public static void main(String[] args) {
        
        System.out.println("DIVISION ENTRE ENTEROS");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresar dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            System.out.println("El resultado es: " + (dividendo / divisor));
            
        } catch (ArithmeticException ae) { // Manejo de excepción específica
            System.out.println("Error: " + ae.getMessage());
        } catch (Exception e) {            // Manejo de otras excepciones
            System.out.println("Error: " + e.toString());
        }
                
    }  
}