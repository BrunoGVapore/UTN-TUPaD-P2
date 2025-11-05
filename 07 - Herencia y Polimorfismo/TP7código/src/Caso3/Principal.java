package Caso3;

import java.util.ArrayList;

/**
 * Caso 3: Empleados y polimorfismo (usar instanceof para clasificar)
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    public static void main(String[] args){
        
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Bruno"));
        empleados.add(new EmpleadoPlanta("Ana"));
        empleados.add(new EmpleadoTemporal("Carla"));
        empleados.add(new EmpleadoTemporal("Rocio"));

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta){
                System.out.println("El sueldo de " + e.getNombre() + " es: $" + e.calcularSueldo());
            } else {
                System.out.println("El sueldo de " + e.getNombre() + " es: $" + e.calcularSueldo());
            }
        }
    
    }
}
