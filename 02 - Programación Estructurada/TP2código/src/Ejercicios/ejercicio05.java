package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 5: Suma de Números Pares (while).
 *  Escribe un programa que solicite números al usuario y sume solo los números pares. 
 *  El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio05 {

    final static int CORTE = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1, suma = 0;
      
        while (num != CORTE){
            System.out.print("Ingrese números para sumar los pares: ");
            num = input.nextInt();
            if (num % 2 == 0) {
                suma += num;
            }
        }
        System.out.print("El resultado de la suma es: " + suma + "\n");
    } 
}