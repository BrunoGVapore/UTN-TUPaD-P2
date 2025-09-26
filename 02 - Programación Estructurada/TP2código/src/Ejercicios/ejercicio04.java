package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 4: Calculadora de Descuento según categoría.
 *  Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
 *  Luego, aplique los siguientes descuentos: Categoría A: 10% de descuento; Categoría B: 15% de descuento; Categoría C: 20% de descuento
 *  El programa debe mostrar el precio original, el descuento aplicado y el precio final
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, descuento, resultado;
        char categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        System.out.print("Ingrese la categoría del producto A B o C: ");
        categoria = input.next().charAt(0);        
        
        switch (categoria) {
            case 'A' -> descuento = 0.10;
            case 'B' -> descuento = 0.15;
            case 'C' -> descuento = 0.20;
            default -> throw new AssertionError("Error de categoría");
        }
        resultado = precio - (precio * descuento);
        System.out.print("Al producto que cuesta $" + precio + " se le aplica un descuento de " + descuento + ". El precio final es de $" + resultado + "\n");
    } 
}