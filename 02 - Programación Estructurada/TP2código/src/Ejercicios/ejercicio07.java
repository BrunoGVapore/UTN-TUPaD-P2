package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 7: Validación de Nota entre 0 y 10 (do-while).
 *  Escribe un programa que solicite al usuario una nota entre 0 y 10. 
 *  Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio07 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese la nota del alumno/a: ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);   
        System.out.println("Nota guardada correctamente.");
    }
}
