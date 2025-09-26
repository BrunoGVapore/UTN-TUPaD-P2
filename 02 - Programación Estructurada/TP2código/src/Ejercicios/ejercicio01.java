package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 1: Verificación de Año Bisiesto.
 *  Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
 *  Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese un año: ");
        anio = input.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    } 
}
