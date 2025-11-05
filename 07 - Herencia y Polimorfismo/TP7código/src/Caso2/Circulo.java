package Caso2;

/**
 * Subclase
 * @author Bruno
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return radio * Math.PI;
    }
    
}
