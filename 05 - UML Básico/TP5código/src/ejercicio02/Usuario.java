package ejercicio02;

public class Usuario {
    private String nombre;
    private String dni;
    
    private Celular celular;
    
    public Usuario(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Asociación bidireccional Celular ↔ Usuario
    public void setCelular(Celular celular){
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() {
        return celular;
    }
    
    @Override
    public String toString() {
        return "Usuario = {" + "Nombre: " + nombre + ", DNI: " + dni + '}';
    }
    
}
