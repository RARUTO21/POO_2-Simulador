package clases;


public class Helicoptero extends Vehiculo {

    /**
     * Default constructor
     */
    public Helicoptero() {
        super(15,"HLP");
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return 0.0d;
    }

}