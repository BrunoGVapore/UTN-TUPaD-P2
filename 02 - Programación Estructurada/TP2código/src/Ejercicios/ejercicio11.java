package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 11: Cálculo de descuento especial usando variable global.
 *  Declara una variable global Ejemplo de entrada/salida: = 0.10. 
 *  Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
 *  Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
 */

import java.util.Scanner;

public class ejercicio11 {
    
    final static double DESCUENTO = 0.20;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }

    /**
     * Función que toma en cuenta el descuento especial del día (variable global)
     * Calcula el descuento aplicado (variable local) al producto
     * e imprime por pantalla el precio final del producto.
     * @param precio
     */
    static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO;
        System.out.print("Precio final: " + (precio - descuentoAplicado) + "\n");
    }
}