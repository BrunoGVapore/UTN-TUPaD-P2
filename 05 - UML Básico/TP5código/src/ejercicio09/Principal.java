package ejercicio09;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1
 * Ejercicio 9: CitaMédica - Paciente - Profesional
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    /** Relaciones 1 a 1
    * Asociación unidireccional: CitaMédica → Paciente
    * Asociación unidireccional: CitaMédica → Profesional
    */ 
     public static void main(String[] args) {

        CitaMedica cita1 = new CitaMedica("31/10/2025","09:00 hs.");
        Paciente paciente1 = new Paciente("Bruno", "IOMA");
        Profesional profesional1 = new Profesional("Tomillo", "Endocrinólogo");
        
        System.out.println(cita1);
        
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        
        System.out.println(cita1);
    }
}
