package caso2;

import java.util.ArrayList;

/** Trabajo Práctico N°6: Caso 2 (Biblioteca - Libro - Autor)
 * Se debe desarrollar un sistema para gestionar una biblioteca, en la cual se registren los libros disponibles y sus autores. 
 * La relación central es de composición 1 a N: una Biblioteca contiene múltiples Libros, y cada Libro pertenece obligatoriamente a una Biblioteca. 
 * Si la Biblioteca se elimina, también se eliminan sus Libros.
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    public static void main(String[] args) {
    // 1. Creamos una biblioteca.
    Biblioteca riva = new Biblioteca("Rivadavia");
    
    // 2. Crear al menos tres autores
    Autor jkr = new Autor("1", "J.K.Rowling", "Británica");
    Autor sz = new Autor("2", "Suzanne Collins", "Estadounidense");
    Autor jrrt = new Autor("3", "J.R.R.Tolkien", "Británica");
    
    // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
    
    riva.agregarLibro("978-84-226-7987-5", "Harry Potter y la Piedra Filosofal", 1997, jkr);
    riva.agregarLibro("84-7888-495-5", "Harry Potter y la Cámara Secreta", 1998, jkr);
    riva.agregarLibro("978-84-9867-539-9", "Los Juegos del Hambre", 2009, sz);
    riva.agregarLibro("978-84-450-7372-8", "El Señor de los Anillos I. La Comunidad del Anillo", 1954, jrrt);
    riva.agregarLibro("978-950-547-065-5", "El Señor de los Anillos II. Las Dos Torres", 1954, jrrt);
    
    // 4. Listar todos los libros con su información y la del autor.
    
    riva.listarLibros();
    
    // 5. Buscar un libro por su ISBN y mostrar su información.
    System.out.println("--------------------------");
    System.out.println("Buscando libro por ISBN: ");
    System.out.println(riva.buscarLibroPorIsbn("978-84-9867-539-9"));
    
    // 6. Filtrar y mostrar los libros publicados en un año específico.
    
    System.out.println("--------------------------");
    System.out.println("Buscando libros por año de publicación: ");
    
    ArrayList<Libro> librosEncontrados = riva.filtrarLibrosPorAnio(1954);

    if (librosEncontrados.isEmpty()) {
        System.out.println("No se encontraron libros");
    } else {
        for (Libro libro : librosEncontrados) {
            libro.mostrarInfo();
            System.out.println("--------------------");
        }
    }
    
    // 7. Eliminar un libro por su ISBN y listar los libros restantes.
    
    System.out.println("Eliminando libro.....");
    riva.eliminarLibro("978-950-547-065-5");
    System.out.println("Libro eliminado. Listando libros actuales......");
    riva.listarLibros();
    
    // 8. Mostrar la cantidad total de libros en la biblioteca.
    
    System.out.println("La cantidad de libros en la biblioteca es: " + riva.obtenerCantidadLibros());
    
    // 9. Listar todos los autores de los libros disponibles en la biblioteca.
    
    System.out.println("Autores disponibles: ");
    riva.mostrarAutoresDisponibles();
    
    }
    
}