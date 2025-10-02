
package sistema;

/**
 * Trabajao Práctico N°4: Sistema de Gestión de Empleados
 * Modelar una clase Empleado que represente a un trabajador en una empresa. 
 * Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y el uso de atributos 
 * aplicando encapsulamiento y métodos estáticos para llevar control de los objetos creados.
 * @author Bruno Giuliano Vapore
 */
public class Principal {


    public static void main(String[] args) {
       // Primer empleado con constructor completo
       Empleado e1 = new Empleado(1, "Bruno Vapore", "Secretario", 1500000.0);
       // Segundo empleado con constructor de dos parámetros
       Empleado e2 = new Empleado("Aldana Dupleix", "Administrativo");
       
       System.out.print(e1 + "\n");
       System.out.print(e2 + "\n");
      
       // Se actualizan los salarios
       e1.actualizarSalario(8); // valor int para incremento en porcentaje
       e2.actualizarSalario(500000.0); // valor double para aumento fijo
       
       System.out.print(e1 + "\n");
       System.out.print(e2 + "\n");
       
       // Se crea tercer empleado, para asegurar que la validación del setId funcione
       Empleado e3 = new Empleado(3, "Manuel Paz", "Directora", 3500000.0);
       System.out.print(e3 + "\n");
       
       // Se muestra el total de empleados
       System.out.print("Total de empleados = " + Empleado.mostrarTotalEmpleados() + "\n");
       
    } 
}
