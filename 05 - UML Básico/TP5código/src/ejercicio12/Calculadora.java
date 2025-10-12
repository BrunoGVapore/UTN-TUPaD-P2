package ejercicio12;

public class Calculadora {
    
    //Dependencia de Uso
    public void calcular(Impuesto impuesto){ 
        if (impuesto.getContribuyente() != null){
        System.out.println("El contribuyente " + impuesto.getContribuyente() + " debe de impuestos: " + impuesto.getMonto());
        } else { 
        System.out.println("No se ha determinado el contribuyente");
        }
    }    
}
