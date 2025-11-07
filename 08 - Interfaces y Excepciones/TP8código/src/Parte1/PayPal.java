package Parte1;

/**
 * @author Bruno Giuliano Vapore
 */
public class PayPal implements PagoConDescuento {
    private double descuento = 0.0;
    
    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de %" + porcentaje);
        this.descuento = porcentaje;
    }

    @Override
    public void procesarPago(double monto) {
        double montoDescontado = monto * (this.descuento / 100);
        double totalFinal =  monto - montoDescontado;
        System.out.println("El monto final a pagar es de: $" + totalFinal);
    }
    
}
