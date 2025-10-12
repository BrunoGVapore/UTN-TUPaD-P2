package ejercicio14;

/**
 * Trabajo Practico N°5: Ejercicios de Dependencia de Creación
 * Ejercicio 14: EditorVideo - Proyecto - Render
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** DEPENDENCIA DE CREACIÓN
    * Asociación unidireccional: Render → Proyecto
    * Dependencia de creación: EditorVideo.exportar(String, Proyecto)
    */ 
     public static void main(String[] args) {

        Proyecto pelicula = new Proyecto("Corto de Octubre", 10);

        EditorVideo editor = new EditorVideo();

        editor.exportar("DCP", pelicula); // Dependencia de creación
    }
    
}
