package clases;

public class Barco extends Vehiculo {

    /**
     * Default constructor
     */
    public Barco() {
        super(30,"BRC",3200.0);
    }
    
    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return cantKm*9.06;
    }

    @Override
    public void reparar(){
        super.vidaUtil = (int) super.vidaUtil / 5;
    }
    
}