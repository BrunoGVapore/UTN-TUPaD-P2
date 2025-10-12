package ejercicio10;

public class Titular {
    private String nombre;
    private String dni;
    
    private CuentaBancaria cuenta;
    
    public Titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuenta){ // Asociación bidireccional Pasaporte ↔ Titular
        this.cuenta = cuenta; 
        if(cuenta != null && cuenta.getTitular() != this) { 
            cuenta.setTitular(this);
        }
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuenta;
    }
    
    @Override
    public String toString() {
        return "Titular = {" + "Nombre: " + nombre + ", DNI: " + dni + '}';
    }
    
}
