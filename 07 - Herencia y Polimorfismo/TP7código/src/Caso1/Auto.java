package Caso1;

/**
 * Subclase
 * @author Bruno Giuliano Vapore
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
         System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nCantidad de puertas: " + cantidadPuertas);
    }
      
}
