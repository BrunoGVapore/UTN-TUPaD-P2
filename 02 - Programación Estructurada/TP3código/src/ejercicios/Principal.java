package ejercicios;

/**
 * Trabajo Práctico N°3: Introducción a POO
 * @author Bruno Giuliano Vapore
 */
public class Principal {

    public static void main(String[] args) {
        
        // Ejercicio N°1: Registro de Estudiantes
        System.out.println("Ejercicio N°1: Registro de Estudiantes");
        Estudiante e001 = new Estudiante();
        
        e001.nombre = "Bruno";
        e001.apellido = "Vapore";
        e001.curso = "Programación II";
        e001.calificacion = 8;
        
        e001.mostrarInfo();
        
        e001.subirCalificacion(1.5);
        e001.mostrarInfo();
        
        e001.bajarCalificacion(1);
        e001.mostrarInfo();
        
        
        // Ejercicicio N°2: Registro de Mascotas
        System.out.println("Ejercicio N°2: Registro de Mascotas");
        Mascota m001 = new Mascota();
        
        m001.nombre = "Calliope";
        m001.especie = "Siamés";
        m001.edad = 4;
        
        m001.mostrarInfo();
        
        m001.cumplirAnios();
        m001.mostrarInfo();
        
        
        // Ejercicio N°3: Encapsulamiento con la Clase Libro
        System.out.println("Ejercicio N°3: Encapsulamiento con la Clase Libro");
        Libro l001 = new Libro();
        
        l001.setTitulo("Los Juegos del Hambre");
        l001.setAutor("Suzanne Collins");
        l001.setAñoPublicacion(2008);
        
        l001.setAñoPublicacion(-1);
        System.out.println("Título: " + l001.getTitulo() + "\nAutor: " + l001.getAutor() + "\n Año de Publicación: " + l001.getAñoPublicacion());
        
        l001.setAñoPublicacion(2035);
        System.out.println("Título: " + l001.getTitulo() + "\n Autor: " + l001.getAutor() + "\n Año de Publicación: " + l001.getAñoPublicacion());
        
        l001.setAñoPublicacion(2009);
        System.out.println("Título: " + l001.getTitulo() + "\n Autor: " + l001.getAutor() + "\n Año de Publicación: " + l001.getAñoPublicacion());
        
        
        // Ejercicio N°4: Gestión de Gallinas en Granja Digital
        System.out.println("Ejercicio N°4: Gestión de Gallinas en Granja Digital");
        Gallina g001 = new Gallina();
        Gallina g002 = new Gallina();
        
        g001.idGallina = 1;
        g001.edad = 3;
        g001.huevosPuestos = 200;
        
        g002.idGallina = 2;
        g002.edad = 1;
        g002.huevosPuestos = 50;
        
        g001.mostrarEstado();
        g002.mostrarEstado();
        
        System.out.println("Actualización de año: ");
        g001.envejecer(1);
        g002.envejecer(1);
        g001.ponerHuevo(50);
        g002.ponerHuevo(75);
        
        g001.mostrarEstado();
        g002.mostrarEstado();
        
        
        // Ejercicio N°5: Simulación de Nave Espacial
        System.out.println("Ejercicio N°5: Simulación de Nave Espacial");
        NaveEspacial nave001 = new NaveEspacial();
        
        nave001.nombre = "Lunaris";
        nave001.combustible = 50;
        
        nave001.mostrarEstado();
        
        nave001.despegar(); // Despegue consume 20 litros de combustible
        nave001.mostrarEstado();
        
        nave001.avanzar(5); // Avanza unidades astronomicas y consume 5 por cada ua.
        nave001.mostrarEstado();
        
        nave001.recargarCombustible(105.5); // Recarga en litros
        nave001.mostrarEstado();
        
        nave001.avanzar(5); // Avanza y consume
        nave001.mostrarEstado();
        
        nave001.recargarCombustible(468); // Supera el límite 
        nave001.mostrarEstado();
        
    }
    
}
