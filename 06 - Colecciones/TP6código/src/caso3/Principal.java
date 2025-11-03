package caso3;

/** Trabajo Práctico N°6: Caso 3 (Universidad - Profesor - Curso)
 * Se debe modelar un sistema académico donde un Profesor dicta muchos Cursos y cada Curso tiene exactamente un Profesor responsable. 
 * La relación Profesor–Curso es bidireccional: 
 * Desde Curso se accede a su Profesor.
 * Desde Profesor se accede a la lista de Cursos que dicta. 
 * Además, existe la clase Universidad que administra el alta/baja y consulta de profesores y cursos.
 * Invariante de asociación: cada vez que se asigne o cambie el profesor de un curso, debe actualizarse en los dos lados (agregar/quitar en la lista del profesor correspondiente).
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    public static void main(String[] args) {
    
        // 1. Crear al menos 3 profesores y 5 cursos.
        
        Profesor p1 = new Profesor("ABC123", "Werner Goldschmidt", "Filosofía del Derecho");
        Profesor p2 = new Profesor("DEF456", "Aida Kemelmajer de Carlucci", "Derecho Civil");
        Profesor p3 = new Profesor("GHI789", "Emiliano Buis", "Derecho Internacional");
        
        Curso c1 = new Curso("01", "Derecho Constitucional");
        Curso c2 = new Curso("02", "Derecho Internacional Público");
        Curso c3 = new Curso("03", "Derecho Internacional Privado");
        Curso c4 = new Curso("04", "Teoría General de Derecho");
        Curso c5 = new Curso("05", "Derecho de las Familias");
        
        // 2. Agregar profesores y cursos a la universidad.
        
        Universidad unicen = new Universidad("UNCPBA");
                
        unicen.agregarProfesor(p1);
        unicen.agregarProfesor(p2);
        unicen.agregarProfesor(p3);
        unicen.agregarCurso(c1);
        unicen.agregarCurso(c2);
        unicen.agregarCurso(c3);
        unicen.agregarCurso(c4);
        unicen.agregarCurso(c5);
        
        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        
        // El método pide id de curso y código de profesor
        unicen.asignarProfesorACurso("05", "DEF456"); // Profesora Aida a 2 cursos
        unicen.asignarProfesorACurso("01", "DEF456");
        unicen.asignarProfesorACurso("02", "GHI789"); // Profesor Emiliano a 2 cursos
        unicen.asignarProfesorACurso("03", "GHI789");
        unicen.asignarProfesorACurso("04", "ABC123"); // Profesor Werner a 1 curso
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        
        unicen.listarCursos();
        unicen.listarProfesores();
        
        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        
        System.out.print("------Reasignando------: ");
        unicen.asignarProfesorACurso("03", "ABC123"); // Se asigna Profesor Werner al Curso DIP
        unicen.listarCursos();                        // Ambos lados quedaron sincronizados (relacion bidireccional)
        unicen.listarProfesores();        
        
        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        
        p1.mostrarInfo();           // Se muestra la info del profesor Werner
        unicen.eliminarCurso("04"); // Se elimina TGD, asignado a Werner
        System.out.println("----Actualizando Información----");
        p1.mostrarInfo();
        
        // 7. Remover un profesor y dejar profesor = null,
        
        unicen.eliminarProfesor("ABC123"); //Se elimina Werner
        c3.mostrarInfo();   // Se muestra la info del curso
        
        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("-----REPORTE ACTUALIZADO-----");
        unicen.listarProfesores();
    }
}
