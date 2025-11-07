package Parte1;

import java.util.Scanner;

/**
 * Caso práctico - Parte 1: Sistema de e-commerce (Interfaces)
 * @author Bruno Giuliano Vapore
 */
public class Principal {

    public static void main(String[] args) {
        
        //Se instancia un cliente
        Cliente c1 = new Cliente("Bruno", "bruno@gmail.com");
        
        //Se instancia un pedido que inicializa una lista
        Pedido pedido = new Pedido(c1);
        
        //Se agrega al pedido productos
        pedido.agregarProducto( new Producto("Notebook HP", 1250999.99));
        pedido.agregarProducto( new Producto("Aspiradora Robot Gadnic", 1805000.50));
        pedido.agregarProducto( new Producto("Horno electrico BGH", 1290000));
        
        //Aplicando el método calcularTotal()
        // Por cada producto
        for (Producto p : pedido) {
            System.out.println("Precio de " + p.getNombre() + ": $" + p.calcularTotal());
        }
        // El total del pedido
        double total = pedido.calcularTotal();
        System.out.println("El total es: $" + total);
     
        
        // Procesando método de pago y descuentos aplicables
        Scanner input = new Scanner(System.in);
        System.out.println("Elija método de pago: \n 1.Tarjeta de Credito \n 2.Paypal");
        int opcion = input.nextInt();        
        
        if (opcion == 1) {
            TarjetaCredito tj = new TarjetaCredito();
            tj.aplicarDescuento(10); 
            tj.procesarPago(total);
            pedido.cambioDeEstado(); // Se notifica al cliente el cambio de estado del pedido
        } else if (opcion == 2) {
            PayPal pay = new PayPal();
            pay.aplicarDescuento(20);
            pay.procesarPago(total);
            pedido.cambioDeEstado();
        } else {
            System.out.println("Opción inválida");
        }
  
    }
    
}
