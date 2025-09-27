
package ejercicios;

/**
 * Ejercicio N°2: Registro de Mascotas
 * a. Crear una clase Mascota con los atributos: nombre, especie, edad.
 * Métodos requeridos: mostrarInfo(), cumplirAnios().
 * Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
 */
public class Mascota {
    // Atributos en public para asignarle valores directamente en Principal.java
    public String nombre;
    public String especie;
    public int edad;
    
    public void mostrarInfo(){
       System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
    }
    
    public int cumplirAnios(){
        return edad += 1;
    }
}
