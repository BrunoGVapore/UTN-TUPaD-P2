package Parte1;

/**
 * @author Bruno Giuliano Vapore
 */
public interface PagoConDescuento extends Pago {
    
    public abstract void aplicarDescuento(double porcentaje);
}
