package ejercicio08;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1
 * Ejercicio 8: Documento - FirmaDigital - Usuario
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** Relaciones 1 a 1
    * Composición: Documento → FirmaDigital
    * Agregación: FirmaDigital → Usuario
    */ 
     public static void main(String[] args) {

        Usuario abog1 = new Usuario("Bruno", "bruno@gmail.com");
        
        Documento doc1 = new Documento("Demanda", "Alimentos", abog1); 
        //El usuario ingresa como parámetro pero no hay relación directa.
        //El constructor del Documento contiene la creación de la instancia FirmaDigital (Composición: Documento → FirmaDigital), terminando su ciclo de vida.
        //La FirmaDigital necesita como parámetro un usuario y el constructor asegura que siga existiendo (Agregación: FirmaDigital → Usuario)
         
        
        System.out.println(doc1); // Muestra todos los datos de las clases
        
        System.out.println(abog1); // Se demuestra que sigue existiendo el Usuario, aunque la FirmaDigital ya no.
        
        
    }
}
