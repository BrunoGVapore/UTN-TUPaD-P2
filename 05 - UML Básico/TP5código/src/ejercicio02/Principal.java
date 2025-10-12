package ejercicio02;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1
 * Ejercicio 2: Celular - Batería - Usuario
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** Relaciones 1 a 1
    * Agregación: Celular → Batería
    * Asociación bidireccional: Celular ↔ Usuario
    */     
    public static void main(String[] args) {
        Bateria bateria1 = new Bateria("EB-BS938ABY", "5100 mAh");
        Celular cel1 = new Celular("123456789012345", "Samsung", "S25 Ultra", bateria1); // Agregación 1:1 (Bateria como parámetro)
        
        Usuario persona1 = new Usuario("Bruno Vapore", "1234567");
        
        //Asociación bidireccional 1:1 (cualquier opción resulta válida)
        cel1.setUsuario(persona1); // Vinculamos usario al celular
        persona1.setCelular(cel1); // Vinculamos personal al celular
        
        System.out.println(cel1.getUsuario()); // Muestra el usuario del celular
        
        System.out.println(persona1.getCelular()); // Muestra el celular del usuario (ya con la información completa)
    }
}
