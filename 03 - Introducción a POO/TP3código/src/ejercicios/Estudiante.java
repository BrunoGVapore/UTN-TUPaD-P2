
package ejercicios;

/**
 * Ejercicio N°1: Registro de Estudiantes
 * a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
 * Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
 * Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
 * @author Bruno Giuliano Vapore
 */
public class Estudiante {
    // Atributos en public para asignarle valores directamente en Principal.java
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;
    
    
    public void mostrarInfo(){
       System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificación: " + calificacion);
    }
    
    public double subirCalificacion(double puntos){
        return calificacion += puntos;
    }
    
    public double bajarCalificacion(double puntos){
        return calificacion -= puntos;
    }
}
