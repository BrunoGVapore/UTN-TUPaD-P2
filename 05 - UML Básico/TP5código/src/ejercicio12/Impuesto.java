package ejercicio12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    public double getMonto(){
        return monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    
}
