package caso3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Bruno Giuliano Vapore
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();;
    
    
    
    //Métodos:
    // • agregarCurso(Curso c) → Agrega el curso a su lista si no está y sincroniza el lado del curso.
    // • eliminarCurso(Curso c) → Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde).
    // • listarCursos() → Muestra códigos y nombres.
    // • mostrarInfo() → Imprime datos del profesor y cantidad de cursos.

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public void agregarCurso(Curso c){
        if (c != null && !cursos.contains(c)){
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c) && c.getProfesor() == this) {
            c.setProfesor(null); 
        }
    }

    public void listarCursos() {
        if (this.cursos.isEmpty()) {
            System.out.println("No hay cursos");
        } else {
            for (Curso curso : this.cursos) {
                System.out.println(curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Profesor: " + this.nombre + " (ID: " + this.id + ") - " + this.especialidad);
        System.out.println("Cantidad de cursos: " + this.cursos.size());
        if (this.cursos.isEmpty()) {
            System.out.println("No hay cursos asignados");
        } else {
            System.out.println("Cursos:");
            for (Curso curso : this.cursos) {
                System.out.println(curso.getNombre());
            }
        }
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

}
