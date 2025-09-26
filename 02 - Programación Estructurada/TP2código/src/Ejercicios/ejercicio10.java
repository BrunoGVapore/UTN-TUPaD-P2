package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 10: Actualización de stock a partir de venta y recepción de productos.
 *  Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), 
 *  que calcule el nuevo stock después de una venta y recepción de productos: 
 *  NuevoStock = StockActual − CantidadVendida + CantidadRecibida
 *  NuevoStock = CantidadVendida + CantidadRecibida 
 *  Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
 */

import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        System.out.print("Ingresar stock actual del producto: ");
        stockActual = input.nextInt();
        System.out.print("Ingresar cantidad vendida del producto: ");
        cantidadVendida = input.nextInt();
        System.out.print("Ingresar cantidad recibida del producto: ");
        cantidadRecibida = input.nextInt();

        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El stock actual del producto es: " + nuevoStock);
    }

    /**
     * Función que calcula el stock actual del producto
     * @param stockActual base del calculo
     * @param cantidadVendida se le resta a <code>stockActual</code>
     * @param cantidadRecibida se le suma a <code>stockActual</code>
     * @return valor entero actualizado del stock
     */
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}