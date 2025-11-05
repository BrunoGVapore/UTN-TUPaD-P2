package Caso3;

/**
 * Clase abstracta
 * @author Bruno Giuliano Vapore
 */
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    } 

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSueldo();

}
