
package ejercicios;

/**
 * Ejercicio N°3: Encapsulamiento con la Clase Libro
 * a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
 * Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
 * Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.
 */
public class Libro {
    // Con los atributos privados, hay que crear métodos setters
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
       return autor; 
    }
    
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    
    public void setTitulo(String titulo){
        if (titulo != null){
            this.titulo = titulo;
        }
    }
    
    public void setAutor(String autor){
        if (autor != null){
            this.autor = autor;
        }
    }
    
    public void setAñoPublicacion(int año){
        if (año > 0 && año <= 2025){          //Validación: número positivo y no años futuros
            this.añoPublicacion = año;
        }
    }
    
}
