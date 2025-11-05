package Caso4;

/**
 * Superclase
 * @author Bruno Giuliano Vapore
 */
public abstract class Animal {

    public Animal() {
    }
    
    public String describirAnimal(){
        return "Es un animal que hace: ";
    }
    
    public abstract String hacerSonido();
    
}
