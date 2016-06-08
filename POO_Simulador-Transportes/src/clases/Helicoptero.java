package clases;


public class Helicoptero extends Vehiculo {

    /**
     * Default constructor
     */
    public Helicoptero() {
        super(15,"HLP",310.0);
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return cantKm * 6.64;
    }


}