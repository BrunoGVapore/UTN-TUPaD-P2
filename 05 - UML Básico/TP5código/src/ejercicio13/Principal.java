package ejercicio13;

/**
 * Trabajo Practico N°5: Ejercicios de Dependencia de Creación
 * Ejercicio 13: GeneradorQR - Usuario - CódigoQR
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** DEPENDENCIA DE CREACIÓN
    * Asociación unidireccional: CódigoQR → Usuario
    * Dependencia de creación: GeneradorQR.generar(String, Usuario)
    */ 
    public static void main(String[] args) {

    Usuario user1 = new Usuario("Bruno", "bruno@gmail.com");
    GeneradorQR generadorQR = new GeneradorQR();
    
    //Dependencia de creación
    generadorQR.generar("https://programacion.com", user1); // Imprime el códigoQR creado
    
    /** El médoto instancia un códigoQR ingresando valor(String) y Usuario(objeto) como parámetros
    * En el constructor del códigoQR se guardan los atributos valor y Usuario, donde se refleja la relación de Asociación con la clase Usuario.
    * No es posible usar un setter para el Usuario
    * Al finalizar el método que imprime el códigoQR, éste deja de existir.
    */
    }
}
