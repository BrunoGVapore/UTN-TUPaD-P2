package caso3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Giuliano Vapore
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) { //Constructor
        this.nombre = nombre;
        this.profesores = profesores = new ArrayList<>();
        this.cursos = cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            this.profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }
    
    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            this.cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("El curso no existe");
            return;
        }
        if (profesor == null) {
            System.out.println("El profesor no existe");
            return;
        }

        curso.setProfesor(profesor);
        System.out.println("Se asignó el profesor " + profesor.getNombre() + " al curso " + curso.getNombre());
    }
    
        public void listarProfesores() {
        System.out.println("Listando profesores.....:");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("Listando cursos.....:");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }


    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null);  // Rompe la relación (lado N de la relación (cursos) que rompe con lado 1 (Profesor)
            this.cursos.remove(curso); // Elimina el curso
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("No se encuentra el curso indicado");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos()); // la copia evita ConcurrentModificationException (porque necesito recorrer la lista al mismo tiempo que se modifica)
            for (Curso c : cursosDelProfesor) {                                    // Lado 1 de la relación (Profesor), que rompe con N (cursos) lo que justifica la copia de seguridad
                c.setProfesor(null); // Rompe la relación
            }
            this.profesores.remove(profesor); // Se elimina el profesor
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("No se encuentra el profesor indicado");
        }
    }

}
