package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 12: Modificación de un array de precios y visualización de resultados.
 *  Crea un programa que: 
 *  a. Declare e inicialice un array con los precios de algunos productos.
 *  b. Muestre los valores originales de los precios.
 *  c. Modifique el precio de un producto específico.
 *  d. Muestre los valores modificados.
 */


public class ejercicio12 {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        precios[2] = 129.99;
        
        System.out.println("Precios actualizados: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}