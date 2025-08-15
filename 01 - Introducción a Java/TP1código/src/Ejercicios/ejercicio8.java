package Ejercicios;
import java.util.Scanner;

/**
 *  Trabajo Práctico N°1: Introducción a Java
 *  Ejercicio 8
 *  @author Bruno Giuliano Vapore
 */
public class ejercicio8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, divisionInt;
        Double divisionDouble;
        
        System.out.print("Ingresar el primer numero: ");
        num1 = input.nextInt();
        System.out.print("Ingresa el segundo numero distinto de 0: ");
        num2 = input.nextInt();
        
        divisionInt = num1 / num2;
        divisionDouble = (double)num1 / num2;
        
        System.out.println("Resultado int: " + divisionInt); 
        System.out.println("Resultado double: " + divisionDouble); 
    }
}
