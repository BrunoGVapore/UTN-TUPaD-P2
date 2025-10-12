package ejercicio10;

public class ClaveSeguridad {
    private int codigo;
    private String ultimaModificacion = "05/15/2025";

    public ClaveSeguridad(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
    
}
