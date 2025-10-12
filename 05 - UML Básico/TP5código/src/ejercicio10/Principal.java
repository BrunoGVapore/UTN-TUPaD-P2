package ejercicio10;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1
 * Ejercicio 10: CuentaBancaria - ClaveSeguridad - Titular
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** Relaciones 1 a 1
    * Composición: CuentaBancaria → ClaveSeguridad
    * Asociación bidireccional: CuentaBancaria ↔ Titular
    */ 
     public static void main(String[] args) {
        CuentaBancaria cta1 = new CuentaBancaria("65051234567892", 1255790.50, 1234);
        Titular titular1 = new Titular("Bruno Vapore", "12345678");
        
        // Asociación bidireccional 1:1 (cualquier opción resulta válida)
        titular1.setCuentaBancaria(cta1);
        cta1.setTitular(titular1);
        
        System.out.println(cta1);
    }
}
