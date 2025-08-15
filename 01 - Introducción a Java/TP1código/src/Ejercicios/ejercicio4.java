package Ejercicios;

import java.util.Scanner;

/**
 *  Trabajo Práctico N°1: Introducción a Java
 *  Ejercicio 4
 *  @author Bruno Giuliano Vapore
 */
public class ejercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es: " + nombre + "\nTu edad es: " + edad);
    }
}
