package Parte1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Bruno Giuliano Vapore
 */
public class Pedido implements Pagable, Iterable<Producto> {
    
    private ArrayList<Producto> pedido;
    private String estado = "Pendiente";
    private Notificable cliente;
    
    public Pedido(Notificable cliente) {
        this.pedido = new ArrayList<>();
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p){
        this.pedido.add(p);
    }

    public ArrayList<Producto> getPedido() {
        return pedido;
    }
    
    public void cambioDeEstado(){
        this.estado = "Finalizado";
        this.cliente.notificar(this.estado);
    }
    
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : pedido) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    @Override
    public Iterator<Producto> iterator() {
        return this.pedido.iterator();
    }

}
