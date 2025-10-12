package ejercicio14;

public class Render {
    private String formato;
    private Proyecto proyecto; 

    //Constructor
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto; // Asociación 1:1 con Proyecto 
    }

    @Override
    public String toString() {
        return "Render { Formato: " + formato + ", Proyecto: " + proyecto + " }";
    }
}
