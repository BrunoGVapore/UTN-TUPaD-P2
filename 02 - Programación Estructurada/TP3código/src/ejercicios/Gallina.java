
package ejercicios;

/**
 * Ejercicio N°4: Gestión de Gallinas en Granja Digital
 * a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
 * Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
 * Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 */
public class Gallina {
    
    public int idGallina;
    public int edad;
    public int huevosPuestos;
    
    
    public void mostrarEstado(){
         System.out.println("idGallina: " + idGallina + "\nEdad: " + edad + "\nHuevos Puestos: " + huevosPuestos);
    }
    
    public int envejecer(int anio){
        return edad += anio;
    }
    
    public int ponerHuevo(int huevos){
        return huevosPuestos += huevos;
    }
    
}
