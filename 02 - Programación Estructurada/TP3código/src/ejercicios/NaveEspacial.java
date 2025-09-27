
package ejercicios;

/**
 * Ejercicio N°5: Simulación de Nave Espacial
 * Crear una clase NaveEspacial con los atributos: nombre, combustible.
 * Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
 * Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
 * Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
 */
public class NaveEspacial {
    
    public String nombre;
    public double combustible;
    
    public void despegar(){
        if (combustible > 20){ //Validación combustible minimo 20l para el despegue
            System.out.println("La nave ha despegado");
            combustible -= 20;
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(double distancia){
        if (combustible > 5){ //Validación combustible minimo, se consume 5l por ua
            combustible -= distancia * 5;
            System.out.println("La nave ha avanzado " + distancia + " unidades astronómicas.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }
            
    public void recargarCombustible(double cantidad){
        if (combustible + cantidad <= 500){ //Validación limite de recarga
            combustible += cantidad;
            System.out.println("Recarga de combustible realizada.");
        } else {
            System.out.println("No puede superar el límite de 500 litros");
        }

    }
    
    public void mostrarEstado(){
        System.out.println("Nave: " + nombre + " con " + combustible + " unidades de combustible");
    }
    
}
