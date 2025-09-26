package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 9: Composición de funciones para calcular costo de envío y total de compra.
 *  a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
 *  Nacional: $5 por kg. Internacional: $10 por kg
 *  b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
 *  Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
 *  @author Bruno Giuliano Vapore
 */

import java.util.Scanner;

public class ejercicio09 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, peso, costoEnvio, totalCompra = 0;
        String zona;
        
        System.out.print("Ingresar el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingresar peso del paqueke en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingresar zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();

        costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio == 0){
            System.out.print("Error de zona, vuelva a intentar");
        } else {
            totalCompra = calcularTotalCompra(precio, costoEnvio);
        }
        
        System.out.print("Total a pagar: " + totalCompra + "\n");
    }

    /**
     * Función para calcular costo de envío
     * @param peso un numero dobule que será multiplicado por el precio de la zona
     * @param zona un String que determina el calcula con una estructura condicional if-else
     * @return double si el String es correcto, o devuelve 0 para manejar el error en el main
     */
    
    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")){
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }
    
    /**
     * Función que suma el total de la compra
     * @param precioProducto
     * @param costoEnvio
     * @return double con el resultado final
     */
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
    
}