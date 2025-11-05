package Caso4;

import java.util.ArrayList;

/**
 * Caso 4: Animales y comportamiento sobrescrito
 * @author Bruno Giuliano Vapore
 */
public class Principal {
    
    public static void main(String[] args){
        
        ArrayList<Animal> animales = new ArrayList<>();

        Gato gato = new Gato();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();
        
        animales.add(gato);
        animales.add(perro);
        animales.add(vaca);

        for (Animal a : animales) {
            System.out.println(a.describirAnimal() + a.hacerSonido());
        }
    }
}
