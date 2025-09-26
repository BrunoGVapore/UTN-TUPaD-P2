package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 6: Contador de Positivos, Negativos y Ceros (for).
 *  Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, contadorPos = 0, contadorNeg = 0, contadorCeros = 0;
                
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un número: ");
            num = input.nextInt();
            if (num > 0) {
                contadorPos += 1;
            } else if (num < 0) {
                contadorNeg += 1;
            } else {
                contadorCeros += 1;
            } 
        }
        System.out.print("Total de números positivos: " + contadorPos + "\nTotal de números negativos: " + contadorNeg + "\nTotal de ceros: " + contadorCeros +"\n");
    } 
}