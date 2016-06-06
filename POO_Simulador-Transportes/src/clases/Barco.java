package clases;

public class Barco extends Vehiculo {

    /**
     * Default constructor
     */
    public Barco() {
        super(30,"BRC");
    }
    
    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {

        return 0.0d;
    }

}