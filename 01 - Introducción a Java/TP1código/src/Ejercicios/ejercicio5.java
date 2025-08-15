package Ejercicios;

import java.util.Scanner;

/**
 *  Trabajo Práctico N°1: Introducción a Java
 *  Ejercicio 5
 *  @author Bruno Giuliano Vapore
 */
public class ejercicio5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplica;
        Double division;
        
        System.out.print("Ingresar el primer numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingresa el segundo numero distinto de 0: ");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplica = num1 * num2;
        division = (double)num1 / num2;
        
        System.out.println(num1 + " + " + num2 + " = " + suma); 
        System.out.println(num1 + " - " + num2 + " = " + resta); 
        System.out.println(num1 + " * " + num2 + " = " + multiplica); 
        System.out.println(num1 + " / " + num2 + " = " + division); 
    }
}
