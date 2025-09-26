package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 2: Determinar el Mayor de Tres Números.
 *  Escribe un programa en Java que pida al usuario tres números enteros 
 *  y determine cuál es el mayor.
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Ingresar el primer número: ");
        num1 = input.nextInt();
        
        System.out.print("Ingresar el segundo número: ");
        num2 = input.nextInt();
        
        System.out.print("Ingresar el tercer número: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El número " + num1 + " es el mayor.");
        } else if (num1 < num2 && num2 > num3) {
            System.out.println("El número " + num2 + " es el mayor.");
        } else {
            System.out.println("El número " + num3 + " es el mayor.");
        }
    } 
}