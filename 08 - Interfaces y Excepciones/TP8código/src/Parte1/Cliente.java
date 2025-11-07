package Parte1;

/**
 * @author Bruno Giuliano Vapore
 */
public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("Estado de su pedido: " + mensaje + "\nDestinatario: " + this.nombre + "(" + this.email + ")");
    }
    
}
