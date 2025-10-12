package ejercicio03;

public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() { // Para el método getAutor en la clase Libro
        return nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }

    
}
