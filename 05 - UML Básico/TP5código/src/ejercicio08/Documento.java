package ejercicio08;

public class Documento {
    private String titulo;
    private String contenido;
    
    private FirmaDigital firma;
    
    public Documento(String titulo, String contenido, Usuario usuario) { //Usuario solo sirve como parámetro para la creación de la FirmaDigital, no es atributo en esta clase y no hay relación directa entre Documento y Usuario.
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(usuario); // Con new se crea la FirmaDigital (Relación 1:1 de Composición: Documento → FirmaDigital)
    }
    
    
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + '}';
    }
    
}

