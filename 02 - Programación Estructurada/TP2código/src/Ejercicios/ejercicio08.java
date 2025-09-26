package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 8: Cálculo del Precio Final con impuesto y descuento.
 *  Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
 *  PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento). PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
 *  Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio08 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento;
        
        System.out.print("Ingresar precio base del producto: ");
        precioBase = input.nextDouble();
        System.out.print("Ingresar porcentaje de impuesto (solo número, por ejemplo 10 para 10%): ");
        impuesto = input.nextDouble();
        System.out.print("Ingresar porcentaje de descuento (solo número, por ejemplo 5 para 5%): ");
        descuento = input.nextDouble();

        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
    }

    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase*impuesto/100) - (precioBase*descuento/100);
    }
}