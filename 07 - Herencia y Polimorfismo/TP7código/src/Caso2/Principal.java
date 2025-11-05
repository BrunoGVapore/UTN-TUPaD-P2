package Caso2;

import java.util.ArrayList;

/**
 * Caso 2: Figuras geométricas y métodos abstractos
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    public static void main(String[] args){
        
        ArrayList<Figura> figuras = new ArrayList<>();

        Circulo c1 = new Circulo(10, "Circulo 1");
        Rectangulo r1 = new Rectangulo(15, 5, "Rectangulo 1");
        Circulo c2 = new Circulo(231.5, "Circulo 2");
        Rectangulo r2 = new Rectangulo(12.25, 7, "Rectangulo 2");

        figuras.add(c1);
        figuras.add(r1);
        figuras.add(c2);
        figuras.add(r2);

        for (Figura figura : figuras) {
            System.out.print("El area de " + figura.getNombre() + " es: " + figura.calcularArea()+"\n"); 
        }
    
    }
}
