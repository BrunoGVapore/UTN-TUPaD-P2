package ejercicio13;

public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario){
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println(codigo);
    }
}
