package Ejercicios;

/**
 *  Trabajo Práctico N°2: Programación Estructurada
 *  Ejercicio 13: Impresión recursiva de arrays antes y después de modificar un elemento.
 *  Crea un programa que:
 *  a. Declare e inicialice un array con los precios de algunos productos.
 *  b. Use una función recursiva para mostrar los precios originales.
 *  c. Modifique el precio de un producto específico.
 *  d. Use otra función recursiva para mostrar los valores modificados.
 */


public class ejercicio13 {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        mostrarPrecios(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios actualizados: ");
        mostrarPrecios(precios, 0);
    }
    
    /**
     * Función recursiva para recorrer el arreglo de precios.
     * Caso base: si indice es => a la longitud del arreglo. Return para finalizar la recursividad.
     * Imprime el elemento del arreglo según el índice
     * Vuelve a llamar a la función, aumentando el índice de a 1.
     * @param arr arreglo ingresado
     * @param indice se ingresa 0 para empezar por el primer elemento
     */
    static void mostrarPrecios(double[] arr, int indice){
        if (indice >= arr.length){
            return;
        }
        System.out.println("Precio: $" + arr[indice]);
        
        mostrarPrecios(arr, indice + 1);
    }
}
