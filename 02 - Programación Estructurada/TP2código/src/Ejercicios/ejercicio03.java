package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 3: Clasificación de Edad.
 *  Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
 *  Menor de 12 años: "Niño"; Entre 12 y 17 años: "Adolescente"; Entre 18 y 59 años: "Adulto"; 60 años o más: "Adulto mayor"
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();

        if (edad < 12){
            System.out.println("Eres un/a niño/a");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Eres un/a adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Eres un/a adulta");
        } else {
            System.out.println("Eres un/a adulto/a mayor");
        }
    } 
}