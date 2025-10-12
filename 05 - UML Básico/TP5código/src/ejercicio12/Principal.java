package ejercicio12;

/**
 * Trabajo Practico N°5: Ejercicios de Depndencia de Uso
 * Ejercicio 12: Impuesto - Contribuyente - Calculadora
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** DEPENDENCIA DE USO
    * Asociación unidireccional: Impuesto → Contribuyente
    * Dependencia de uso: Calculadora.calcular(Impuesto)
    */ 
     public static void main(String[] args) {

        Impuesto imp1 = new Impuesto(25000.0);
        Contribuyente persona1 = new Contribuyente("Bruno", "12-345678-9");
         
        Calculadora calculadora = new Calculadora(); // 
        calculadora.calcular(imp1); // Dependencia de Uso (método con validación = false)
        System.out.println(imp1); // No hay contribuyente asociado al impuesto
        
        imp1.setContribuyente(persona1); // Asociación 1:1 unidireccional
        calculadora.calcular(imp1); // (Validación = true)
    }
}
