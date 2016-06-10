package clases;


public class Helicoptero extends Vehiculo {

    /**
     * Default constructor
     */
    public Helicoptero() {
        super(15,"HLP",3500.0);
        super.tipoVehiculo = "Aéreo";
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return cantKm * 6.64;
    }


}