package Caso3;

/**
 * Subclase
 * @author Bruno Giuliano Vapore
 */
public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo(){
        return 950000.50;
    }
}
