package Caso3;

/**
 * Subclase
 * @author Bruno Giuliano Vapore
 */
public class EmpleadoPlanta extends Empleado {

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo(){
        return 1500000;
    }
    
}
