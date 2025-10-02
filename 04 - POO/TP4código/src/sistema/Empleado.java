package sistema;


/**
 * @author Bruno Giuliano Vapore
 */

public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados; //Atributo estático que pertenece a la clase
    
    private static int contadorId = 1; // Contador aparte para crear id únicos, ya que los empleados podrían disminuir
    
    //Constructor con todos los parámetros
    public Empleado(int id, String nombre, String puesto, double salario){
        setId(id);          // Se validan a través de métodos
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        
        totalEmpleados++; // Aumenta en 1 el valor del atributo estático
        contadorId++; // Aumenta en 1 el contador de Id
    }

    // Constructor con parametros nombre y puesto
    public Empleado(String nombre, String puesto){
        this(contadorId, nombre, puesto, 500000.0); //this llama al otro constructor, establece por defecto el id y el salario
    }

    // Métodos
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    // Setters
    private void setId(int id) {
        if (id == contadorId){
            this.id = id;
        } else {
            throw new IllegalArgumentException("El ID debe arrancar en 1 o ser consecutivo al anterior creado");
        }
    }
    
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){ //Validación no nulo ni vacio
            this.nombre = nombre.trim();
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()){ //Validación no nulo ni vacio
            this.puesto = puesto;
        } else {
            throw new IllegalArgumentException("El puesto no puede estar vacío");
        }
    }
 
    private void setSalario(double salario) {
        if (salario > 0){     // Validación número positivo
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("El salario debe ser positivo");
        }
    }

    // Métodos que actualizan el salario 
    // Reciba un entero para el porcentaje de aumento.
    public double actualizarSalario(int porcentaje){
        if (porcentaje > 0){
            salario += (salario * porcentaje) / 100;
        }
        return salario;
    }
    
    // Recibe un double para la cantidad fija a aumentar.
    public double actualizarSalario(double aumento){
         if (aumento > 0){
            salario += aumento;
        }
        return salario;
    }

    
    // Método estático para mostrar el total de los empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    
    @Override // toString para mostrar el estado del objeto
    public String toString(){
        return "Empleado Id: " + id + "\nNombre: " + nombre + "\nPuesto: " + puesto + "\nSalario: " + salario +"\n";
    }

}

